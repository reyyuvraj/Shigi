package com.example.shigi.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate
import com.example.shigi.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text : TextView = findViewById(R.id.in_sign_up)
        val signin : Button = findViewById(R.id.in_login)
        val facebook : Button = findViewById(R.id.in_connect)
        val forgot: TextView = findViewById(R.id.in_forgot)
        //val emailid : TextView = findViewById(R.id.in_id)
        //val password : TextView = findViewById(R.id.in_password)

        signin.setOnClickListener(){
            intent = Intent(this, ListDoctor::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        text.setOnClickListener(){
            intent = Intent(this, NewAcc::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        facebook.setOnClickListener(){
            Toast.makeText(this@MainActivity, "Feature to be available soon", Toast.LENGTH_SHORT)
                .show()
        }

        forgot.setOnClickListener(){
            Toast.makeText(this@MainActivity, "Feature to be available soon", Toast.LENGTH_SHORT)
                    .show()
        }
    }
}

/*if (emailid.text.toString().isEmpty() || password.text.toString().isEmpty()) {

            Toast.makeText(this@MainActivity, "Please enter valid credentials", Toast.LENGTH_SHORT)
                .show()
        }*/