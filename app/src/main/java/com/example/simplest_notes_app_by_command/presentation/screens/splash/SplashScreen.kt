package com.example.simplest_notes_app_by_command.presentation.screens.splash

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notes
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.simplest_notes_app_by_command.presentation.navigation.NavItem
import com.example.simplest_notes_app_by_command.core.Constants.SPLASH_DELAY
import com.example.simplest_notes_app_by_command.core.Constants.SPLASH_TITLE
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController){

    LaunchedEffect(key1 = true) {

        delay(SPLASH_DELAY)

        navController.popBackStack()
        navController.navigate(NavItem.First.fullRoute)
    }
    Splash()
}

@Composable
fun Splash() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            Icon(
                modifier = Modifier
                    .size(120.dp),
                imageVector = Icons.Default.Notes,
                contentDescription = null,
            )
            Text(
                text =SPLASH_TITLE,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(2.dp, 2.dp, 2.dp, 2.dp))
        }
    }
}