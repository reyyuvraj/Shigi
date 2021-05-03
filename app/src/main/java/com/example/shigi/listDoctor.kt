package com.example.shigi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class listDoctor : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doctor_appointment)

        val clickD1 : RelativeLayout = findViewById(R.id.doctor_1)
        clickD1.setOnClickListener {
            intent = Intent(this, docDetail::class.java)
            startActivity(intent)
        }

        val clickD2 : RelativeLayout = findViewById(R.id.doctor_2)
        clickD2.setOnClickListener {
            intent = Intent(this, docDetail::class.java)
            startActivity(intent)
        }

        val clickD3 : RelativeLayout = findViewById(R.id.doctor_3)
        clickD3.setOnClickListener {
            intent = Intent(this, docDetail::class.java)
            startActivity(intent)
        }

        val clickD4 : RelativeLayout = findViewById(R.id.doctor_4)
        clickD4.setOnClickListener {
            intent = Intent(this, docDetail::class.java)
            startActivity(intent)
        }
    }
}