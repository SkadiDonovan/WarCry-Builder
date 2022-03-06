package com.skadidonovan.warcry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.skadidonovan.warcry.databinding.ActivityMainBinding
import com.skadidonovan.warcry.ConditionFrags

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val dataModel : DataModel by viewModels()

    var conditionMainFrag= ConditionFrags.FRAG_NULL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        dataModel.message.observe(this, {

        })


        binding.btCreate.setOnClickListener{
            if (conditionMainFrag != ConditionFrags.FRAG_CREATE) {
                openFrag(R.id.mainFrag, CreateMenuFragment())
                conditionMainFrag = ConditionFrags.FRAG_CREATE
            }
        }
        binding.btLoad.setOnClickListener{
            if (conditionMainFrag != ConditionFrags.FRAG_LOAD) {
                conditionMainFrag = ConditionFrags.FRAG_LOAD
            }
        }
    }

    fun openFrag(id: Int, fragment: CreateMenuFragment){
        supportFragmentManager
            .beginTransaction().replace(id, fragment)
            .commit()
    }
}