package com.example.simplest_notes_app_by_command.presentation.navigation

import com.example.simplest_notes_app_by_command.R

sealed class NavItem(var title:String, var icon:Int, var screen_route:String, var arguments: String){

    object Splash: NavItem("Splash", R.drawable.ic_launcher_foreground,"splash", ""){
        val fullRoute = screen_route + arguments
    }

    object First: NavItem("First", R.drawable.ic_launcher_foreground,"first", ""){
        val fullRoute = screen_route + arguments
    }

    object Second: NavItem("Second", R.drawable.ic_launcher_foreground,"second", "?noteId={noteId}"){
        val fullRoute = screen_route + arguments
    }
}
