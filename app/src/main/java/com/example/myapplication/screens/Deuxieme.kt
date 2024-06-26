package com.example.myapplication.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun EndScreen(navController: NavHostController) {
    var affiche by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Second Screen")
        Button(onClick = {
            navController.popBackStack()
            affiche = true
        }) {
            Text("Go to First Screen")
        }

        if (affiche) {
            MainScreenPreview()
        }
        else{
            EndScreenPreview()
        }
    }
}

@Composable
fun EndScreenPreview() {
    MyApplicationTheme {
        Scaffold { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Scene Numéro 2")
            }
        }
    }
}
