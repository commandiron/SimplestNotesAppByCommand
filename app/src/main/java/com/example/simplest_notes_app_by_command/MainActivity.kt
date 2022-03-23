package com.example.simplest_notes_app_by_command

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import com.example.simplest_notes_app_by_command.ui.theme.My_compose_template_by_commandironTheme
import dagger.hilt.android.AndroidEntryPoint


@ExperimentalAnimationApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_compose_template_by_commandironTheme {
                MainScreenView()
            }
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun MainScreenView(){

    val scaffoldState = rememberScaffoldState()
    val navController = rememberNavController()

    Scaffold(
        scaffoldState = scaffoldState,
    ) {
        NavigationGraph(navController)
    }
}