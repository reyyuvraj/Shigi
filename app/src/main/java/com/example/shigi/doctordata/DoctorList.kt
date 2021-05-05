package com.example.shigi.doctordata

import com.example.shigi.R

object DoctorList {

    const val email_id: String = "email"

    fun getList(): ArrayList<DoctorStatus>{
        val dList = ArrayList<DoctorStatus>()

        //1
        val d1 = DoctorStatus(
            1,
            "Dr. Alan C. Brave",
            "Cardiologist",
            1,
            R.drawable.doctor6,
            "Dr. Alan C. Brave is a cardiologist in Saint Louis, Missouri and is affiliated with multiple hospitals in the area."
        )
        dList.add(d1)

        //2
        val d2 = DoctorStatus(
            2,
            "Dr. Michael Aaron",
            "Orthodontist",
            0,
            R.drawable.doctor2,
            "Dr. Michael Aaron is a orthodontist in Saint Louis, Missouri and is affiliated with multiple hospitals in the area."
        )
        dList.add(d2)

        //3
        val d3 = DoctorStatus(
            3,
            "Dr. Shelley Ramon",
            "Eye Specialist",
            1,
            R.drawable.doctor4,
            "Dr. Dr. Shelley Ramon is a eye specialist in Saint Louis, Missouri and is affiliated with multiple hospitals in the area."
        )
        dList.add(d3)

        //4
        val d4 = DoctorStatus(
            4,
            "Dr. Jake Brown",
            "ENT Specialist",
            0,
            R.drawable.doctor5,
            "Dr. Jake Brown is a ENT Specialist in Saint Louis, Missouri and is affiliated with multiple hospitals in the area."
        )
        dList.add(d4)

        //5
        val d5 = DoctorStatus(
            5,
            "Dr. Peter Geller",
            "Psychiatrist",
            0,
            R.drawable.doctor3,
            "Dr. Peter Geller is a psychiatrist in Saint Louis, Missouri and is affiliated with multiple hospitals in the area."
        )
        dList.add(d5)

        return dList
    }
}
