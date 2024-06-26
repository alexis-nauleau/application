package com.example.myapplication.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.screens.EndScreen
import com.example.myapplication.screens.MainScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Middle(

    modifier: Modifier = Modifier
) {


    Box(
        modifier = modifier
            .fillMaxWidth()

            .padding(horizontal = 16.dp), // ajuste l'emplacement du texte
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(
                text = "title".uppercase(),
                style = TextStyle(fontSize = 28.sp))

            Row {
                Icon(
                    Icons.Outlined.Star,
                    contentDescription = "star",
                    
                )
                Icon(
                    Icons.Outlined.Star,
                    contentDescription = "star",

                )
                Icon(
                    Icons.Outlined.Star,
                    contentDescription = "star",

                )
                Icon(
                    Icons.Outlined.Star,
                    contentDescription = "star",

                )
            }
            Text(
                text = "Lorem ipsum dolor sit amet consectetur," +
                        " adipisicing elit. Incidunt modi quos illum" +

                        " asperiores illum qui veniam aspernatur? Officiis" +
                        " quidem neque enim culpa hic?",
                style = TextStyle(fontSize = 20.sp)
            )


            Row(horizontalArrangement = Arrangement.SpaceBetween) {

                MainNavHost()

            }
        }

    }
}
