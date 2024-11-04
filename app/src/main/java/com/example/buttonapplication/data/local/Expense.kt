package com.example.buttonapplication.data.local

import android.icu.util.CurrencyAmount

data class Expense(
    val id:String,
    val description:String,
    val amount:CurrencyAmount
)
