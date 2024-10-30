package com.example.buttonapplication.data.local.expense

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ExpensesDao {
    @Insert
    suspend fun create(expense:ExpenseEntity):Int

    @Query("")
    suspend fun readAll():List<ExpenseEntity>
}