package com.example.jetpackcomposeexample

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MainScreenNavigationConfigurations(
    navController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(navController, startDestination = MainBottomNavigationScreens.Pat.route, Modifier.padding(innerPadding)) {
        composable(MainBottomNavigationScreens.Pat.route) {
            Screen(MainBottomNavigationScreens.Pat.model)
        }
        composable(MainBottomNavigationScreens.Feed.route) {
            Screen(MainBottomNavigationScreens.Feed.model)
        }
        composable(MainBottomNavigationScreens.Walk.route) {
            Screen(MainBottomNavigationScreens.Walk.model)
        }
    }
}