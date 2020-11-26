package com.jorfald.fragmentexample.views

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import com.jorfald.fragmentexample.R

@SuppressLint("AppCompatCustomView")
class CustomButton(context: Context, attributeSet: AttributeSet? = null) :
    Button(context, attributeSet) {

    init {
        setTextColor(context.getColor(R.color.red))
        textSize = 20f
        setBackgroundColor(context.getColor(R.color.white))

        text = "Custom button"
    }

    fun changeButtonText(newText: String) {
        text = newText
    }
}