package com.example.contacts.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contacts.R
import com.example.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.apply {

                bnvMain.setOnItemSelectedListener { item ->
                    when (item.itemId){
                         R.id.item_all -> {
                         }
                        R.id.item_favorites -> {
                        }
                    }
                    true
                }
            }
    }
}