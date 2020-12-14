package de.stuydycase.parship.viewmodel

import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test

class ToggleTitleViewModelTest {

    private lateinit var viewModel: ToggleTitleViewModel

    @Before
    fun setUp() {
        viewModel = ToggleTitleViewModel()
    }

    @Test
    fun initTest() {
        assertEquals(ToggleTitleViewModel.State.PARSHIP.title, viewModel.title.get())
        assertEquals(ToggleTitleViewModel.State.PARSHIP.color, viewModel.color.get())
    }

    @Test
    fun onClickParshipTitleTest() {
        viewModel.onClick()
        assertEquals(ToggleTitleViewModel.State.ELITE_PARTNER.title, viewModel.title.get())
        assertEquals(ToggleTitleViewModel.State.ELITE_PARTNER.color, viewModel.color.get())
    }

    @Test
    fun onClickEliteTitleTest() {
        viewModel.onClick()
        assertEquals(ToggleTitleViewModel.State.ELITE_PARTNER.title, viewModel.title.get())
        assertEquals(ToggleTitleViewModel.State.ELITE_PARTNER.color, viewModel.color.get())
        viewModel.onClick()
        assertEquals(ToggleTitleViewModel.State.PARSHIP.title, viewModel.title.get())
        assertEquals(ToggleTitleViewModel.State.PARSHIP.color, viewModel.color.get())
    }
}