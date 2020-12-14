package de.stuydycase.parship.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import de.stuydycase.parship.R
import de.stuydycase.parship.databinding.FragmentToggleTitleBinding
import de.stuydycase.parship.viewmodel.ToggleTitleViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ToggleTitleFragment : Fragment() {

    private lateinit var viewModel : ToggleTitleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ToggleTitleViewModel()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentToggleTitleBinding>(inflater, R.layout.fragment_toggle_title, container, false)
        binding.lifecycleOwner = this.viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root
    }
}