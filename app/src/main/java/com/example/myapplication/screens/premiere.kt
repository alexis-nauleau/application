package com.example.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun MainScreen(navController: NavHostController) {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Premier")
        Button(
            onClick = {
                navController.navigate("second")

            },
            modifier = Modifier
                .clip(RoundedCornerShape(100))
                .background(MaterialTheme.colorScheme.primary),
        ) { Text("Go to second Screen") }


    }
}

@Composable
fun MainScreenPreview() {
    MyApplicationTheme {
        Scaffold { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(color = Color.Red))
            }
        }
    }
}
