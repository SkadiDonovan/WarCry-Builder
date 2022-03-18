package com.skadidonovan.warcry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.skadidonovan.warcry.databinding.FragmentLoadMenuBinding


class LoadMenuFragment : Fragment() {
    lateinit var binding: FragmentLoadMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoadMenuBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = LoadMenuFragment()
    }
}