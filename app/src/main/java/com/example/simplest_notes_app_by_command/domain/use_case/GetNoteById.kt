package com.example.simplest_notes_app_by_command.domain.use_case

import com.example.simplest_notes_app_by_command.domain.model.NoteAsExample
import com.example.simplest_notes_app_by_command.domain.repository.AppRepository

class GetNoteById(
    private val repository: AppRepository
) {
    suspend operator fun invoke(id: Int): NoteAsExample? = repository.getNoteById(id)
}