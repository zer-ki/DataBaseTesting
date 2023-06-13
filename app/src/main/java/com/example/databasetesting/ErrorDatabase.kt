package com.example.databasetesting

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ErrorMessage::class],
    version = 1
)

abstract class ErrorDatabase: RoomDatabase() {
    abstract fun dao(): ErrorMessageDao
}