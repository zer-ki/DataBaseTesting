package com.example.databasetesting

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ErrorMessageDao {
    @Query ("SELECT * FROM errorMessageTable")
    fun getAllData(): List<ErrorMessage>
    //fun getEntitiesByIds(ids: List<Int>): List<ErrorMessage>
}