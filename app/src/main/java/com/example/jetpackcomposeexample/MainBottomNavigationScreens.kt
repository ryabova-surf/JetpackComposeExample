package com.example.jetpackcomposeexample

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Star

sealed class MainBottomNavigationScreens(val route: String, val model: ScreenModel) {
    object Pat : MainBottomNavigationScreens(
        "pat",
        ScreenModel(
            icon = Icons.Filled.Star,
            label = "Pat",
            imageId = R.drawable.hedgehog,
            text = "Pat lil hedgehog to make him happier!",
            buttonText = "Pat"
        )
    )
    object Feed : MainBottomNavigationScreens(
        "feed",
        ScreenModel(
            icon = Icons.Filled.Home,
            label = "Feed",
            imageId = R.drawable.hedgehog_feed,
            text = "Feed lil hedgehog to make him happier!",
            buttonText = "Feed"
        )
    )
    object Walk : MainBottomNavigationScreens(
        "walk",
        ScreenModel(
            icon = Icons.Filled.Place,
            label = "Walk",
            imageId = R.drawable.hedgehog_walk,
            text = "Walk lil hedgehog to make him happier!",
            buttonText = "Walk"
        )
    )
}
