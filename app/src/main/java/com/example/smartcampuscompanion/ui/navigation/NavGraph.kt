package com.example.smartcampuscompanion.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smartcampuscompanion.ui.screens.LoginScreen
import com.example.smartcampuscompanion.ui.screens.DashboardScreen
import com.example.smartcampuscompanion.ui.screens.CampusInfoScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(Screen.Login.route) { LoginScreen(navController) }
        composable(Screen.Dashboard.route) { DashboardScreen(navController) }
        composable(Screen.CampusInfo.route) { CampusInfoScreen(navController) }
    }
}