package com.example.simplest_notes_app_by_command.domain.use_case

import com.example.simplest_notes_app_by_command.domain.model.NoteAsExample
import com.example.simplest_notes_app_by_command.domain.repository.AppRepository
import kotlinx.coroutines.flow.Flow

class GetNotes(
    private val repository: AppRepository
) {
    operator fun invoke(): Flow<List<NoteAsExample>> = repository.getNotes()
}