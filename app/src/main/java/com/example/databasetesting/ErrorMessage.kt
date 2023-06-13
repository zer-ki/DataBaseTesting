package com.example.databasetesting

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.w3c.dom.Text

@Entity(tableName = "errorMessageTable")
data class ErrorMessage(
    @PrimaryKey
    val id: Long,
    val errorTitle: String,
    val errorDescription: String
)
