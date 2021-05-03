package com.example.shigi

object doctorList {

    const val email_id: String = "email"

    fun getList(): ArrayList<doctorStatus>{
        val dList = ArrayList<doctorStatus>()

        //1
        val d1 = doctorStatus(
                1,
                "Dr. Alan C. Brave",
                "Cardiologist",
                1,
                R.drawable.doctor4
        )
        dList.add(d1)

        val d2 = doctorStatus(
                2,
                "Dr. Michael Aaron",
                "Orthodontist",
                0,
                R.drawable.doctor1
        )
        dList.add(d2)

        val d3 = doctorStatus(
                3,
                "Dr. Shelly Ramon",
                "Eye Specialist",
                1,
                R.drawable.doctor5
        )
        dList.add(d3)

        val d4 = doctorStatus(
                4,
                "Dr. Jake Brown",
                "ENT Specialist",
                0,
                R.drawable.doctor5
        )
        dList.add(d4)

        val d5 = doctorStatus(
                5,
                "Dr. Peter Geller",
                "Psychiatrist",
                0,
                R.drawable.doctor2
        )
        dList.add(d5)

        return dList
    }
}