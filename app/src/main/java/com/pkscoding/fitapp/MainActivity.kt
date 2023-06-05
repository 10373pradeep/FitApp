package com.pkscoding.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.pkscoding.fitapp.databinding.ActivityMainBinding
import com.pkscoding.fitapp.service.StepDetectorService

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val intent = Intent(this, StepDetectorService::class.java)
        startService(intent)
        StepDetectorService.subscribe.register(this)
    }

    fun subscribeSteps(steps: Int) {
        binding.TVSTEPS.setOnClickListener {
            TV_INPUT_SERVICE

        }
        binding.TVCALORIES.setOnClickListener {

        }
       binding.TVDISTANCE.setOnClickListener {

       }


    }
}