package com.zavosh.mvc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.zavosh.mvc.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), Observer {

    private var binding: ActivityMainBinding? = null
    private var mainData = MainData()
    private var myModel: Model? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.main = mainData

        myModel = Model()
        myModel!!.addObserver(this)

        binding!!.button1.setOnClickListener {
            myModel?.setValueAtIndex(0)
        }

        binding!!.button2.setOnClickListener {
            myModel?.setValueAtIndex(1)
        }

        binding!!.button3.setOnClickListener {
            myModel?.setValueAtIndex(2)
        }


    }

    override fun update(p0: Observable?, p1: Any?) {
        mainData.textCountOne = "Count ${myModel?.getValueAtIndex(0)}"
        mainData.textCountTwo = "Count ${myModel?.getValueAtIndex(1)}"
        mainData.textCountThree = "Count ${myModel?.getValueAtIndex(2)}"
        binding?.main = mainData
    }
}