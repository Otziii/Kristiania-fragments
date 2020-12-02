package com.jorfald.fragmentexample.recycler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jorfald.fragmentexample.Animal
import com.jorfald.fragmentexample.R
import kotlinx.android.synthetic.main.fragment_list_example.*
import kotlinx.android.synthetic.main.fragment_list_example.view.*

class RecyclerExampleFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var recyclerLayoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_example, container, false)

        recyclerView = view.recycler_view

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = mutableListOf<Animal>()
        list.add(Animal("Hund", true))
        list.add(Animal("Katt", true))
        list.add(Animal("Mus", true))
        list.add(Animal("Fisk", false))
        list.add(Animal("Fugl", false))

        recyclerAdapter = ExampleAdapter(list)
        recyclerLayoutManager = LinearLayoutManager(activity)

        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = recyclerLayoutManager

        delete_last_button.setOnClickListener {
            if (list.isNotEmpty()) {
                list.removeLast()
                recyclerAdapter.notifyDataSetChanged()
            }
        }
    }
}
