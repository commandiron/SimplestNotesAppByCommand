package com.example.simplest_notes_app_by_command.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteAsExample(
    val title: String = "",
    val content: String = "",
    @PrimaryKey val id: Int? = null
)