package de.stuydycase.parship.common

import android.graphics.Color
import android.widget.TextView
import androidx.annotation.UiThread
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import de.stuydycase.parship.common.setText
import de.stuydycase.parship.R
import de.stuydycase.parship.common.setTextColor
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CustomBindingAdaptersTest {

    @Test @UiThread
    fun textViewBindingTest() {
        val v = TextView(InstrumentationRegistry.getInstrumentation().targetContext)
        setText(v, R.string.toggle_fragment_title_parship)
        assertEquals("Parship", v.text)
        setText(v, R.string.toggle_fragment_title_elite_partner)
        assertEquals("Elitepartner", v.text)
    }

    @Test @UiThread
    fun textColorBindingTest() {
        val v = TextView(InstrumentationRegistry.getInstrumentation().targetContext)
        setTextColor(v, R.color.main_blue_color)
        assertEquals(v.resources.getColor(R.color.main_blue_color, null), v.currentTextColor)
        setTextColor(v, R.color.main_red_color)
        assertEquals(v.resources.getColor(R.color.main_red_color, null), v.currentTextColor)
    }

    @Test @UiThread
    fun textViewBindingInvalidValueTest() {
        val v = TextView(InstrumentationRegistry.getInstrumentation().targetContext)
        setText(v, -1)
        assertEquals("Default Title", v.text)
    }

    @Test @UiThread
    fun textColorBindingInvalidValueTest() {
        val v = TextView(InstrumentationRegistry.getInstrumentation().targetContext)
        setTextColor(v, -1)
        assertEquals(Color.BLACK, v.currentTextColor)
    }
}