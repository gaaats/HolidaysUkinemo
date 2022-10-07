package com.holpackartukii.holidayartukinemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.holpackartukii.holidayartukinemo.databinding.ActivityGameBinding
import com.holpackartukii.holidayartukinemo.databinding.ActivityMainBinding

class GameActivity : AppCompatActivity() {
    private var _binding: ActivityGameBinding? = null
    private val binding get() = _binding ?: throw RuntimeException("ActivityMainBinding = null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}