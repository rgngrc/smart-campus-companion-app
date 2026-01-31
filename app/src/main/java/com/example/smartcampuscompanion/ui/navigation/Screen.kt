package com.example.smartcampuscompanion.ui.navigation

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Dashboard : Screen("dashboard")
    object CampusInfo : Screen("campus_info")
}