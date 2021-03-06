package com.example.shigi.activity

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.shigi.R
import com.example.shigi.doctordata.DoctorList
import com.example.shigi.doctordata.DoctorStatus

class DocDetail : AppCompatActivity() {

    private var mImage : Int? = null
    private var mSpecial : String? = null
    private var mName : String? = null
    private var mId : Int? = null
    private var mDoctor : ArrayList<DoctorStatus>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doctor_details)

        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        mDoctor = DoctorList.getList()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        } else {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        val back : ImageButton = findViewById(R.id.details_back)
        val schedule : CardView = findViewById(R.id.doctor_schedule)
        val appointment : Button = findViewById(R.id.doctor_appointment)

        back.setOnClickListener(){
            intent = Intent(this, ListDoctor::class.java)
            startActivity(intent)
        }

        schedule.setOnClickListener(){
            Toast.makeText(this@DocDetail, "Feature to be available soon", Toast.LENGTH_SHORT)
                    .show()
        }

        appointment.setOnClickListener(){
            Toast.makeText(this@DocDetail, "Feature to be available soon", Toast.LENGTH_SHORT)
                    .show()
        }
    }
}