package com.example.myapplication.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.screens.EndScreen
import com.example.myapplication.screens.MainScreen

@Composable
fun MainNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "first") {
        composable("first") { MainScreen(navController) }
        composable("second") { EndScreen(navController) }
        composable(route = "test", content = { EndScreen(navController) })
    }
}