package com.jorfald.fragmentexample.recycler

import android.content.Context
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jorfald.fragmentexample.R

class ExampleAdapter(
    private val context: Context,
    var dataset: List<String>
) : RecyclerView.Adapter<ExampleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val textView = TextView(parent.context)

        textView.textSize = 35f
        textView.setTextColor(context.getColor(R.color.green))

        textView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        return ViewHolder(textView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataset[position]

        if (position % 2 == 0) {
            holder.textView.setBackgroundColor(context.getColor(R.color.blue))
        } else {
            holder.textView.setBackgroundColor(context.getColor(R.color.red))
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}
