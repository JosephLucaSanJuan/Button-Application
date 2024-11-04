package com.example.buttonapplication.data

import java.util.UUID

data class Participant(
    val id: UUID,
    val name: String = "",
    val surname:String = ""
)
