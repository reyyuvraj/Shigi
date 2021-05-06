package com.example.shigi.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.shigi.R

class NewAcc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val signin : Button = findViewById(R.id.create_login)
        val text : TextView = findViewById(R.id.create_sign_in)
        val facebook : Button = findViewById(R.id.create_connect)
        //val emailid : TextView = findViewById(R.id.create_id)
        //val password : TextView = findViewById(R.id.create_password)
        //val name : TextView = findViewById(R.id.create_name)

        signin.setOnClickListener(){
            intent = Intent(this, ListDoctor::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        text.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        facebook.setOnClickListener(){
            Toast.makeText(this@NewAcc, "Feature to be available soon", Toast.LENGTH_SHORT)
                .show()
        }
    }
}