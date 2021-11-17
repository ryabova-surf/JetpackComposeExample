package com.example.jetpackcomposeexample

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun AppBottomNavigation(
    navController: NavHostController,
    items: List<MainBottomNavigationScreens>
) {
    BottomNavigation {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route
        items.forEach { screen ->
            BottomNavigationItem(
                icon = { Icon(screen.model.icon, "Bottom navigation tab icon") },
                label = { Text(text = screen.model.label) },
                selected = currentRoute == screen.route,
                alwaysShowLabel = false,
                onClick = {
                    if (currentRoute != screen.route) {
                        navController.navigate(screen.route)
                    }
                }
            )
        }
    }
}