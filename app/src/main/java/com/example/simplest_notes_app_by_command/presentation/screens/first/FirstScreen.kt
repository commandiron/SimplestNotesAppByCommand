package com.example.simplest_notes_app_by_command.presentation.screens.first

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.simplest_notes_app_by_command.presentation.navigation.NavItem
import com.example.simplest_notes_app_by_command.presentation.screens.first.components.NoteItem

@ExperimentalAnimationApi
@Composable
fun FirstScreen(
    navController: NavController,
    viewModel: FirstViewModel = hiltViewModel()
) {
    val notes = viewModel.notes

    Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()) {
            items(notes){ note ->
                NoteItem(
                    note = note,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate(
                                NavItem.Second.screen_route + "?noteId=${note.id}"
                            )
                        },
                    onDeleteClick = {
                        viewModel.deleteNote(note)
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }

        FloatingActionButton(
            modifier = Modifier.align(Alignment.BottomCenter),
            onClick = {
                navController.navigate(NavItem.Second.fullRoute)
            }
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Add note")
        }
    }
}