package com.skadidonovan.warcry


import android.content.res.Resources
import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.setPadding
import androidx.core.view.updateLayoutParams
import com.skadidonovan.warcry.databinding.FragmentCreateMenuBinding
import java.util.ArrayList
import kotlin.math.roundToInt


class CreateMenuFragment : Fragment() {
    lateinit var binding: FragmentCreateMenuBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateMenuBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.changeAllySpinner.setOnSpinnerItemSelectedListener<String> { oldIndex, oldItem, newIndex, newText ->
            when (newText){
                "Original Warbands" -> binding.changeFactionSpinner.setItems(R.array.originalWarbands)
                "Order" -> binding.changeFactionSpinner.setItems(R.array.orderWarbands)
                "Chaos" -> binding.changeFactionSpinner.setItems(R.array.chaosWarbands)
                "Death" -> binding.changeFactionSpinner.setItems(R.array.deathWarbands)
                "Destruction" -> binding.changeFactionSpinner.setItems(R.array.destructionWarbands)
            }
        }
    }
    companion object {
        @JvmStatic
        fun newInstance() = CreateMenuFragment()
    }
}

