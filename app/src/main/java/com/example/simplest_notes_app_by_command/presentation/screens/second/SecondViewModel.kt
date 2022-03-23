package com.example.simplest_notes_app_by_command.presentation.screens.second

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simplest_notes_app_by_command.domain.model.NoteAsExample
import com.example.simplest_notes_app_by_command.domain.use_case.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor(
    private val useCases: UseCases,
    savedStateHandle: SavedStateHandle
): ViewModel() {

    var note : NoteAsExample by mutableStateOf(NoteAsExample())
        private set

    init {
        savedStateHandle.get<String>("noteId")?.let { noteId ->
            if(noteId.toInt() != -1) {
                viewModelScope.launch {
                    note = useCases.getNoteById(noteId.toInt())!!.copy()
                }
            }
        }
    }

    fun insertNote(noteAsExample: NoteAsExample){
        viewModelScope.launch {
            useCases.insertNote(noteAsExample)
        }
    }
}