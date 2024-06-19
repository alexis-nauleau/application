package com.example.myapplication.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.MutableStateFlow

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Header() {
    val text = MutableStateFlow<String>("");

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .padding(horizontal = 15.dp)
    ) {
        Icon(
            Icons.Outlined.ArrowBack,
            contentDescription = "Un bouton pour aller en arrière",
            modifier = Modifier.weight(1f),
            tint = Color.White
        )
        var query by remember { mutableStateOf("") }//permet de faire la liaison pour afficher le texte saisie dans textfield


        TextField(
            value = query,

            onValueChange = {query=it},
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0x60FFFFFF),
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
            ),
            modifier = Modifier
                .border(width = 0.dp, color = Color.Transparent)
                .weight(5f)
                .clip(RoundedCornerShape(100))
        )
    }
}