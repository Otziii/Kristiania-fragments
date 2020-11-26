package com.jorfald.fragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jorfald.fragmentexample.views.CustomButton
import com.jorfald.fragmentexample.views.CustomLayout
import kotlinx.android.synthetic.main.main_fragment.*

class BlackFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newCustomButton: CustomButton = CustomButton(requireContext())
        newCustomButton.changeButtonText("Click me!")

        newCustomButton.setOnClickListener {
            Toast.makeText(requireContext(), "The button was clicked", Toast.LENGTH_SHORT).show()
        }

        linear_layout.addView(newCustomButton)

        val customLayout = CustomLayout(requireContext())
        customLayout.setHeader("Første linje")
        customLayout.setSubTitle("Andre linje")

        linear_layout.addView(customLayout)
    }
}