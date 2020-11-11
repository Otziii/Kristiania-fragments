package com.jorfald.fragmentexample.recycler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jorfald.fragmentexample.R
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

        val list = mutableListOf<String>()
        for (i in 0..1000) {
            list.add("$i")
        }

        recyclerAdapter = ExampleAdapter(requireContext(), list)
        recyclerLayoutManager = GridLayoutManager(activity, 5)

        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = recyclerLayoutManager
    }
}