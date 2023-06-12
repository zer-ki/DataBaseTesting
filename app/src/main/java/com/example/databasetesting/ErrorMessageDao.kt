package com.example.databasetesting

import androidx.room.Query

interface ErrorMessageDao {
    @Query ("SELECT * FROM errorMessageTable WHERE id IN (:ids)")
    fun getEntitiesByIds(ids: List<Int>): List<ErrorMessage>
}