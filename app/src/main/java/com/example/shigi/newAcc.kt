package com.example.shigi

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class newAcc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val text : TextView = findViewById(R.id.create_sign_in)
        text.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}