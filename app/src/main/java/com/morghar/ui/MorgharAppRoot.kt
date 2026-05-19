package com.morghar.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.morghar.ui.screens.AuthScreen
import com.morghar.ui.screens.FavoritesScreen
import com.morghar.ui.screens.HomeScreen
import com.morghar.ui.screens.MapScreen
import com.morghar.ui.screens.PostScreen

@Composable
fun MorgharAppRoot() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Auth.route,
            modifier = Modifier
        ) {
            composable(Screen.Auth.route) { AuthScreen(onAuthed = { navController.navigate(Screen.Home.route) }) }
            composable(Screen.Home.route) { HomeScreen() }
            composable(Screen.Map.route) { MapScreen() }
            composable(Screen.Post.route) { PostScreen() }
            composable(Screen.Favorites.route) { FavoritesScreen() }
        }
    }
}

@Composable
private fun BottomNavBar(navController: NavHostController) {
    val items = listOf(Screen.Home, Screen.Map, Screen.Post, Screen.Favorites)
    NavigationBar {
        items.forEach { screen ->
            NavigationBarItem(
                selected = false,
                onClick = { navController.navigate(screen.route) },
                icon = { Text(screen.route) },
                label = { Text(screen.route) }
            )
        }
    }
}
