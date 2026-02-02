package com.example.smartcampuscompanion.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material3.Text

@Composable
fun CampusInfoScreen(navController: NavController) {
    Column {
        Text("Campus Information")
        Button(onClick = { navController.popBackStack() }) {
            Text("Back to Dashboard")
        }
    }
}