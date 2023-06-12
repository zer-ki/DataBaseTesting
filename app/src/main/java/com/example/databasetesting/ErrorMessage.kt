package com.example.databasetesting

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "errorMessageTable")
data class ErrorMessage(
    @PrimaryKey
    val id: Int,
    val errorTitle: String,
    val errorDescription: String
)
