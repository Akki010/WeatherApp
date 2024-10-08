package com.akshay.weatherapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.akshay.weatherapp.screens.HomeScreen

@Composable
fun WeatherNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = WeatherScreens.HomeScreen.name) {

        composable(WeatherScreens.HomeScreen.name) {
            HomeScreen()
        }
    }
}