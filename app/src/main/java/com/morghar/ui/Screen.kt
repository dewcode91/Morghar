package com.morghar.ui

sealed class Screen(val route: String) {
    data object Auth : Screen("auth")
    data object Home : Screen("home")
    data object Map : Screen("map")
    data object Post : Screen("post")
    data object Favorites : Screen("favorites")
}
