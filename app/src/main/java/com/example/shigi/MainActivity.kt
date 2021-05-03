package com.example.shigi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text : TextView = findViewById(R.id.in_sign_up)
        val button : EditText = findViewById(R.id.in_id)

        button.setOnClickListener(){
            intent = Intent(this, listDoctor::class.java)
            startActivity(intent)
        }

        text.setOnClickListener(){
            intent = Intent(this, newAcc::class.java)
            startActivity(intent)
        }
    }
}