package com.dayvatas.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dayvatas.kotlinintent.databinding.ActivityNextBinding

private lateinit var binding : ActivityNextBinding

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //getIntent
        val intent = intent
        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")

        binding.userNameTextNext.text = "Username: " + username
        binding.nameTextNext.text = "Name: " + name
    }
}