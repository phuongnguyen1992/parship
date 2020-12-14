package de.stuydycase.parship.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableInt
import de.stuydycase.parship.R

class ToggleTitleViewModel : BaseObservable() {

    var title = ObservableInt()
    var color = ObservableInt()

    private var state = State.PARSHIP

    init {
        updateView()
    }

    fun onClick() {
        state = if (state == State.PARSHIP) {
            State.ELITE_PARTNER
        } else {
            State.PARSHIP
        }
        updateView()
    }

    private fun updateView() {
        title.set(state.title)
        color.set(state.color)
    }

    enum class State(val title: Int, val color: Int) {
        PARSHIP (R.string.toggle_fragment_title_parship, R.color.main_red_color),
        ELITE_PARTNER (R.string.toggle_fragment_title_elite_partner, R.color.main_blue_color),
    }
}