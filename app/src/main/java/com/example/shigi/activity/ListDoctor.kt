package com.example.shigi.activity

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.shigi.R
import com.example.shigi.doctordata.DoctorStatus

class ListDoctor : AppCompatActivity(){

    //private var mId : Int = 1
    //private var mDoctor : ArrayList<DoctorStatus>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doctor_appointment)

        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        } else {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        val menu : ImageButton = findViewById(R.id.menu)

        menu.setOnClickListener(){
            Toast.makeText(this@ListDoctor, "Feature to be available soon", Toast.LENGTH_SHORT)
                .show()
        }

        val clickD1 : RelativeLayout = findViewById(R.id.doctor_1)
        clickD1.setOnClickListener {
            intent = Intent(this, DocDetail::class.java)
            startActivity(intent)
        }

        val clickD2 : RelativeLayout = findViewById(R.id.doctor_2)
        clickD2.setOnClickListener {
            intent = Intent(this, DocDetail::class.java)
            startActivity(intent)
        }

        val clickD3 : RelativeLayout = findViewById(R.id.doctor_3)
        clickD3.setOnClickListener {
            intent = Intent(this, DocDetail::class.java)
            startActivity(intent)
        }

        val clickD4 : RelativeLayout = findViewById(R.id.doctor_4)
        clickD4.setOnClickListener {
            intent = Intent(this, DocDetail::class.java)
            startActivity(intent)
        }

        val clickD5 : RelativeLayout = findViewById(R.id.doctor_5)
        clickD5.setOnClickListener {
            intent = Intent(this, DocDetail::class.java)
            startActivity(intent)

            /*val doc = mDoctor!!.get(4)
            doctor_pfp.setImageResource(doc.image)
            doctor_speciality.text = doc.speciality
            doctor_name.text = doc.name
            doctor_about = doc.about*/
        }
    }
}