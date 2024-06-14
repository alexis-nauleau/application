package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = Color(0xFF1B7FA0)) { innerPadding ->

                    Top(
                        modifier=Modifier
                            .fillMaxWidth()
                            .padding(top=50.dp)
                            .background(Color(0xFFC3CFD3))
                            .height(90.dp)


                    )
                    Middle(
                        modifier=Modifier
                            .fillMaxWidth()
                            .padding(top=350.dp)
                            .background(Color(0xFF72ABBE))
                            .height(200.dp)

                    )

                    Bottom(
                        modifier=Modifier
                            .fillMaxWidth()
                            .padding(top=660.dp)
                            .background(Color(0xFF033546))
                            .height(250.dp)

                    )

                }
            }
        }
    }

}

@Composable
fun Top( modifier: Modifier = Modifier) {
    Row() {
        Icon(imageVector = Icons.Filled.Create, contentDescription = "",modifier=modifier)
        Text(
            text = "Top",
            modifier = modifier) }
}
@Composable
fun Middle( modifier: Modifier = Modifier) {
    Row() {

        Text(
            text = "middle",
            modifier = modifier) }
}

@Composable
fun Bottom( modifier: Modifier = Modifier) {
    Row() {
        Text(
            text = "middle",
            modifier = modifier) }
}

