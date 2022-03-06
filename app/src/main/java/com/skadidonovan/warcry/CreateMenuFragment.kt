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
    lateinit var binding : FragmentCreateMenuBinding
    val listt = R.array.factionList

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateMenuBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter: ArrayAdapter<String> = object : ArrayAdapter<String>(
            requireActivity(),
            android.R.layout.simple_spinner_dropdown_item,
            listt
        ){
            override fun getDropDownView(
                position: Int,
                convertView: View?,
                parent: ViewGroup
            ): View {
                val view: TextView = super.getDropDownView(
                    position,
                    convertView,
                    parent
                ) as TextView
                return view
            }
        }
        binding.factionSpinner.adapter = adapter

        binding.factionSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                if (binding.factionSpinner.selectedItemPosition == R.array.factionList.component2()){
                    binding.spinner.adapter = spinnerAppointment(R.array.orderWarbands)
                    binding.spinner.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // another interface callback
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = CreateMenuFragment()
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return super.onContextItemSelected(item)
    }


    fun spinnerAppointment(factionList : Int) : ArrayAdapter<String> {
        val adapter: ArrayAdapter<String> = object : ArrayAdapter<String>(
            requireActivity(),
            android.R.layout.simple_spinner_dropdown_item,
            factionList
        ){}
        return adapter
    }
}