package de.stuydycase.parship.common

import android.content.res.Resources
import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import de.stuydycase.parship.R

@BindingAdapter("textColorId")
fun setTextColor(view: View, colorId: Int) {
    try {
        if (view is TextView) {
            view.setTextColor(view.resources.getColor(colorId, null))
        }
    } catch (e: Resources.NotFoundException) {
        e.printStackTrace()
        (view as TextView).setTextColor(Color.BLACK)
    }
}

@BindingAdapter("textId")
fun setText(view: View, textId: Int) {
    try {
        if (view is TextView) {
            view.text = view.resources.getText(textId)
        }
    } catch (e: Resources.NotFoundException) {
        e.printStackTrace()
        (view as TextView).setText(R.string.toggle_fragment_title_default)
    }
}