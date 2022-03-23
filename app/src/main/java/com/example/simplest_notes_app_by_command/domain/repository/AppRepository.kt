package com.example.simplest_notes_app_by_command.domain.repository

import com.example.simplest_notes_app_by_command.domain.model.NoteAsExample
import kotlinx.coroutines.flow.Flow

interface AppRepository {

    fun getNotes(): Flow<List<NoteAsExample>>

    suspend fun getNoteById(id:Int): NoteAsExample?

    suspend fun insertNote(noteAsExample: NoteAsExample)

    suspend fun deleteNote(noteAsExample: NoteAsExample)
}