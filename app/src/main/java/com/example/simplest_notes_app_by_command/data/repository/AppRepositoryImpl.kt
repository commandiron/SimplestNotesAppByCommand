package com.example.simplest_notes_app_by_command.data.repository

import com.example.simplest_notes_app_by_command.data.data_source.AppDao
import com.example.simplest_notes_app_by_command.domain.model.NoteAsExample
import com.example.simplest_notes_app_by_command.domain.repository.AppRepository
import kotlinx.coroutines.flow.Flow

class AppRepositoryImpl(
    private val dao: AppDao
): AppRepository {

    override fun getNotes(): Flow<List<NoteAsExample>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): NoteAsExample? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(noteAsExample: NoteAsExample) {
        dao.insertNote(noteAsExample)
    }

    override suspend fun deleteNote(noteAsExample: NoteAsExample) {
        dao.deleteNote(noteAsExample)
    }
}