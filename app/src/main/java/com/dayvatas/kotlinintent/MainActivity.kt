package com.dayvatas.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dayvatas.kotlinintent.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun next(view : View){
        val intent = Intent(applicationContext, NextActivity::class.java)
        intent.putExtra("username", binding.userNameText.text.toString())
        intent.putExtra("name", binding.nameText.text.toString())
        startActivity(intent)
    }
}