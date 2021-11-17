package com.example.jetpackcomposeexample

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector

data class ScreenModel(
    val icon: ImageVector,
    val label: String,
    @DrawableRes val imageId: Int,
    val text: String,
    val buttonText: String
)
