package com.skadidonovan.warcry

import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.core.graphics.component1
import androidx.core.graphics.component2
import com.skadidonovan.warcry.databinding.FragmentCreateMenuBinding
import android.widget.ArrayAdapter as ArrayAdapter


class CreateMenuFragment : Fragment() {
    lateinit var binding: FragmentCreateMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateMenuBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = CreateMenuFragment()
    }
}

