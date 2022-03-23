package com.example.simplest_notes_app_by_command.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.simplest_notes_app_by_command.domain.model.NoteAsExample

@Database(entities = [NoteAsExample::class], version = 2)
abstract class AppDatabase: RoomDatabase() {
    abstract val appDao: AppDao

    companion object{
        const val DATABASE_NAME = "app_db"
    }
}