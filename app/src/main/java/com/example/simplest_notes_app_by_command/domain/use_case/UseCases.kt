package com.example.simplest_notes_app_by_command.domain.use_case

data class UseCases(

    val getNotes: GetNotes,
    val getNoteById: GetNoteById,
    val insertNote: InsertNote,
    val deleteNote: DeleteNote
)