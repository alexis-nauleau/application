package com.example.myapplication.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun Footer(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()


    Row(
        modifier = modifier

            .fillMaxSize()
            .padding(start = 10.dp)
            .horizontalScroll(state = scrollState)
    ) {
        MaBox()
        MaBox()
        MaBox()
        MaBox()
        MaBox()

    }
}

