package com.example.simplest_notes_app_by_command

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.simplest_notes_app_by_command.presentation.navigation.NavItem
import com.example.simplest_notes_app_by_command.presentation.screens.first.FirstScreen
import com.example.simplest_notes_app_by_command.presentation.screens.second.SecondScreen
import com.example.simplest_notes_app_by_command.presentation.screens.splash.SplashScreen

@ExperimentalAnimationApi
@Composable
fun NavigationGraph(
    navController: NavHostController
) {
    
    NavHost(navController = navController, startDestination = NavItem.Splash.fullRoute ){

        //Splash Screen
        composable(
            NavItem.Splash.fullRoute) {
            SplashScreen(
                navController = navController)
        }

        //First Screen
        composable(
            NavItem.First.fullRoute) {
            FirstScreen(
                navController = navController)
        }

        //Second Screen
        composable(
            NavItem.Second.fullRoute) {
            SecondScreen(
                navController = navController)
        }
    }
}