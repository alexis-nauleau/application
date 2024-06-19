package com.example.myapplication.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
public fun MaBox() {
    val arr = arrayOf(
        R.drawable.imag1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4
    )
    Box(
        Modifier
            .background(Color(0xBA1B7FA0))
            .width(150.dp)
            .padding(start = 10.dp, end = 10.dp)
    )
    {
        Column {
            Image(
                painter = painterResource(id = R.drawable.image2), contentDescription = null,
                modifier = Modifier
                    .size(width = 200.dp, height = 150.dp)
                    .align(Alignment.CenterHorizontally)

            )
            Text(
                text = "title",
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

            )
        }
    }
}