package com.jorfald.fragmentexample.views

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.jorfald.fragmentexample.R
import kotlinx.android.synthetic.main.green_fragment.view.*
import kotlinx.android.synthetic.main.list_view_custom.view.*

class CustomListView(
    context: Context,
    attributeSet: AttributeSet? = null
) : FrameLayout(context, attributeSet) {
    val imageView: ImageView
    val textView: TextView

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.list_view_custom, this)

        imageView = view.image_view
        textView = view.text_input

        textView.textSize = 35f
        textView.setTextColor(context.getColor(R.color.green))
    }

    fun setText(newText: String) {
        textView.text = newText
    }

    fun setImage(newImageDrawable: Drawable) {
        imageView.setImageDrawable(newImageDrawable)
    }
}