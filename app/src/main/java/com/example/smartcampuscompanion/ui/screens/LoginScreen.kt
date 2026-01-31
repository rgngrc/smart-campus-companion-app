package com.example.smartcampuscompanion.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material3.Text
import com.example.smartcampuscompanion.ui.navigation.Screen

@Composable
fun LoginScreen(navController: NavController) {
    Column {
        Text("Login")
        Button(onClick = { navController.navigate(Screen.Dashboard.route) }) {
            Text("Sign In (Test)")
        }
    }
}