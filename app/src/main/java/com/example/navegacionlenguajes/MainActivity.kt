package com.example.navegacionlenguajes

import Screen.NavigationExample
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.navegacionlenguajes.ui.theme.NavegacionLenguajesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegacionLenguajesTheme {
                NavigationExample()
            }
        }
    }
}
