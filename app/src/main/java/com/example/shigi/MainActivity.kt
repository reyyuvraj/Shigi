package com.example.shigi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.in_id)
        val text : TextView = findViewById(R.id.in_sign_up)

        button.setOnClickListener(){
            val intent = Intent(this, listDoctor::class.java)
            startActivity(intent)
        }

        text.setOnClickListener(){
            intent = Intent(this, newAcc::class.java)
            startActivity(intent)
        }
    }
}