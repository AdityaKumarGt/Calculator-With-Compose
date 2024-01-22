package com.example.calculatorwithcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val viewModel = viewModel<CalculatorViewModel>()
    val buttonSpacing = 8.dp

    NavHost(navController = navController, startDestination = "splash_screen"){
        composable("splash_screen"){
            SplashScreen(navController = navController)
        }
        composable("main_screen"){

            Calculator(
                state = viewModel.state,
                resultState = viewModel.resultState,
                onAction = viewModel::onAction,
                buttonSpacing = buttonSpacing
            )
        }
    }
}
