package com.example.shigi.doctordata

data class doctorStatus(
    val id: Int,
    val name: String,
    val speciality : String,
    val availability : Int,
    val image : Int,
    val about: String
)