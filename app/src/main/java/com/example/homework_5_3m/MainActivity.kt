package com.example.homework_5_3m

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_5_3m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container_fragment, FirstFragment())
            .commit()

    }
}