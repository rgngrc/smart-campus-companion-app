package com.example.smartcampuscompanion.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material3.Text
import com.example.smartcampuscompanion.ui.navigation.Screen

@Composable
fun DashboardScreen(navController: NavController) {
    Column {
        Text("Dashboard")
        Button(onClick = { navController.navigate(Screen.CampusInfo.route) }) {
            Text("View Campus Info")
        }
        Button(onClick = { navController.popBackStack() }) {
            Text("Back to Login")
        }
    }
}