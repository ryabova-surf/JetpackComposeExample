package com.example.jetpackcomposeexample

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.*
import com.example.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExampleTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val bottomNavItems = listOf(
        MainBottomNavigationScreens.Pat,
        MainBottomNavigationScreens.Feed,
        MainBottomNavigationScreens.Walk
    )

    Scaffold(
        bottomBar = { AppBottomNavigation(navController = navController, items = bottomNavItems) }
    ) { innerPadding ->
        MainScreenNavigationConfigurations(navController = navController, innerPadding)
    }
}

@Preview(showBackground = true,
uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    JetpackComposeExampleTheme {
        Screen(MainBottomNavigationScreens.Feed.model)
    }
}