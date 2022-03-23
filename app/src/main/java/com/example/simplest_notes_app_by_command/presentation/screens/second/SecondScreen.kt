package com.example.simplest_notes_app_by_command.presentation.screens.second

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Save
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.simplest_notes_app_by_command.presentation.navigation.NavItem
import com.example.simplest_notes_app_by_command.domain.model.NoteAsExample

@Composable
fun SecondScreen(
    navController: NavController,
    viewModel: SecondViewModel = hiltViewModel()
) {

    val note = viewModel.note

    var title by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }
    LaunchedEffect(key1 = note){
        title = note.title
        content = note.content
    }

    Box(
        modifier = Modifier.fillMaxSize().padding(10.dp),
        contentAlignment = Alignment.Center) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = title,
                label = { Text("Title") },
                singleLine = true,
                onValueChange = {
                title = it
            })
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                modifier = Modifier.fillMaxWidth().height(300.dp),
                value = content,
                label = {Text("Content")},
                maxLines = 10,
                onValueChange = {
                content = it
            })
        }
        FloatingActionButton(
            modifier = Modifier.align(Alignment.BottomCenter),
            onClick = {
                viewModel.insertNote(NoteAsExample(title,content,note.id))
                navController.navigate(
                    NavItem.First.fullRoute)
            }
        ) {
            Icon(imageVector = Icons.Default.Save, contentDescription = "Save note")
        }
    }
}