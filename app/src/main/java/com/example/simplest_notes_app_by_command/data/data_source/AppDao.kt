package com.example.simplest_notes_app_by_command.data.data_source

import androidx.room.*
import com.example.simplest_notes_app_by_command.domain.model.NoteAsExample
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {

    @Query("SELECT * FROM noteasexample")
    fun getNotes(): Flow<List<NoteAsExample>>

    @Query("SELECT * FROM noteasexample WHERE id = :id")
    suspend fun getNoteById(id: Int): NoteAsExample?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(noteAsExample: NoteAsExample)

    @Delete
    suspend fun deleteNote(noteAsExample: NoteAsExample)
}