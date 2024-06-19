package com.example.myapplication



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.myapplication.components.Footer
import com.example.myapplication.components.Header
import com.example.myapplication.components.Middle
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        Modifier
                            //.background(Color(0xFF72ABBE))
                            .fillMaxSize()
                            .padding(innerPadding)
                            .paint(

                                painterResource(id = R.drawable.image3),
                                contentScale = ContentScale.FillHeight)

                    ) {
                        Column {
                            Box(
                                Modifier
                                    .weight(1f)
                            ) {
                                Header()
                            }
                            Spacer(Modifier.weight(2.25f))
                            Box(
                                Modifier
                                    .background(Color(0xBA1B7FA0))
                                    .fillMaxWidth()
                                    .weight(2.5f)

                            ) {
                                Middle()
                            }
                            Spacer(Modifier.weight(2.25f))
                            Box(
                                Modifier

                                    .fillMaxWidth()
                                    .weight(2f)
                            )
                            {
                                Footer()
                            }
                        }
                    }
                }
            }
        }
    }
}