package com.jorfald.fragmentexample.recycler

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jorfald.fragmentexample.Animal
import com.jorfald.fragmentexample.views.AnimalCell

class ExampleAdapter(
    var dataset: MutableList<Animal>
) : RecyclerView.Adapter<ExampleAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(AnimalCell(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = dataset[position]

        holder.listItem.setHeader(animal.name)

        if (animal.isMammal) {
            holder.listItem.setSubTitle("Is mammal")
        } else {
            holder.listItem.setSubTitle("Laying eggs")
        }

        holder.listItem.setCrossClickListener {
            
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class ViewHolder(val listItem: AnimalCell) : RecyclerView.ViewHolder(listItem)
}
