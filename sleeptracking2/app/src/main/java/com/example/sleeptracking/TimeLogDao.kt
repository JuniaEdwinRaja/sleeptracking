package com.example.sleeptracking

import androidx.room.Dao
import androidx.room.Insert
import com.example.projectone.TimeLog

@Dao
interface TimeLogDao {
    @Insert
    suspend fun insert(timeLog: TimeLog)

}