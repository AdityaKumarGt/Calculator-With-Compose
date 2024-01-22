package com.example.calculatorwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculatorwithcompose.ui.theme.CalculatorWithComposeTheme
import com.example.calculatorwithcompose.ui.theme.DarkGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBar?.hide()
        setContent {
            CalculatorWithComposeTheme {
                Surface(
                    color = Color(0xFF000000),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Navigation()
                }
            }
        }

    }
}


