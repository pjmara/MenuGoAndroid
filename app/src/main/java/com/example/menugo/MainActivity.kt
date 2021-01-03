package com.example.menugo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendUserToCreateMenu(view: View) {
        val intent = Intent(this, CreateAMenu::class.java).apply {

        }
        startActivity(intent)
    }
}