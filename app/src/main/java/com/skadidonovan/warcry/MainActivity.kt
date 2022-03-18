package com.skadidonovan.warcry

import DataBaseWorking.AppDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.skadidonovan.warcry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var dataBase: AppDatabase

    var conditionMainFrag = ConditionFrags.FRAG_NULL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

                                                                            //setOnClickListeners
        binding.btCreate.setOnClickListener{
            if (conditionMainFrag != ConditionFrags.FRAG_CREATE) {
                openFrag(R.id.mainFrag, CreateMenuFragment())
                conditionMainFrag = ConditionFrags.FRAG_CREATE
            }
            if (conditionMainFrag == ConditionFrags.FRAG_CREATE){
            }
        }
        binding.btLoad.setOnClickListener{
            if (conditionMainFrag != ConditionFrags.FRAG_LOAD) {
                openFrag(R.id.mainFrag, LoadMenuFragment())
                conditionMainFrag = ConditionFrags.FRAG_LOAD
            }
        }
                                                                                        //Database
        dataBase = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "roster-list"
        ).allowMainThreadQueries().build()



    }

    private fun openFrag(id: Int, fragment: Fragment){
        supportFragmentManager
            .beginTransaction().replace(id, fragment)
            .commit()
    }
}