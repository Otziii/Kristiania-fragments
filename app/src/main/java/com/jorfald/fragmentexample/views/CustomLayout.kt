package com.jorfald.fragmentexample.views

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.jorfald.fragmentexample.R
import kotlinx.android.synthetic.main.layout_custom.view.*

class CustomLayout(context: Context, attributeSet: AttributeSet? = null) :
    ConstraintLayout(context, attributeSet) {

    val iconImage: ImageView
    val headerText: TextView
    val subTitleText: TextView

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_custom, this)

        iconImage = view.icon_image
        headerText = view.header_text
        subTitleText = view.sub_title_text

        setBackgroundColor(context.getColor(R.color.green))
    }

    fun setHeader(newText: String) {
        headerText.text = newText
    }

    fun setSubTitle(newText: String) {
        subTitleText.text = newText
    }

    fun setIconImage(drawable: Drawable) {
        iconImage.setImageDrawable(drawable)
    }
}