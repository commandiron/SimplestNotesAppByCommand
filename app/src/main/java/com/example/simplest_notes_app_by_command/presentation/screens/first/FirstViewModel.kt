package com.example.simplest_notes_app_by_command.presentation.screens.first

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simplest_notes_app_by_command.domain.model.NoteAsExample
import com.example.simplest_notes_app_by_command.domain.use_case.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(
    private val useCases: UseCases
): ViewModel() {

    var notes : List<NoteAsExample> by mutableStateOf(listOf())
        private set

    init {
        getNotes()
    }

    fun getNotes(){
        viewModelScope.launch {
            useCases.getNotes.invoke().collect{
                notes = it
            }
        }
    }

    fun deleteNote(noteAsExample: NoteAsExample){
        viewModelScope.launch {
            useCases.deleteNote(noteAsExample)
        }
    }
}