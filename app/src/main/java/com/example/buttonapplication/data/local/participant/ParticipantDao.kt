package com.example.buttonapplication.data.local.participant

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

@Dao
interface ParticipantDao {
    @Insert
    suspend fun create(participant: ParticipantEntity)

    @Delete
    suspend fun delete(participant: ParticipantEntity)
}