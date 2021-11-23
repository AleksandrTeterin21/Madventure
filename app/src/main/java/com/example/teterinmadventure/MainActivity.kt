package com.example.teterinmadventure

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.example.teterinmadventure.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun next_activity(view: View) {}
}