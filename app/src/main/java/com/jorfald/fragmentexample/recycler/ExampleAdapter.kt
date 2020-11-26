package com.jorfald.fragmentexample.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jorfald.fragmentexample.Animal
import com.jorfald.fragmentexample.views.CustomLayout

class ExampleAdapter(
    var dataset: List<Animal>
) : RecyclerView.Adapter<ExampleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CustomLayout(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = dataset[position]

        holder.listItem.setHeader(animal.name)

        if (animal.isMammal) {
            holder.listItem.setSubTitle("Is mammal")
        } else {
            holder.listItem.setSubTitle("Laying eggs")
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class ViewHolder(val listItem: CustomLayout) : RecyclerView.ViewHolder(listItem)
}
