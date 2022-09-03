package com.example.bottombar.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.home.HomeScreen
import com.example.home.homeScreenNav
import com.example.search.presentation.SearchScreen
import com.example.search.presentation.searchNav

@Composable
fun BottomBarScreen(onSearchClicked: () -> Unit) {
    val bottomBarNavController = rememberNavController()

    Scaffold(
        bottomBar = { BottomAppBar(bottomBarNavController) },
        modifier = Modifier
    ) { innerPadding ->
        NavHost(
            navController = bottomBarNavController,
            startDestination = BottomScreen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            homeScreenNav(onSearchClicked)
            searchNav()
        }
    }
}

@Composable
fun BottomAppBar(bottomBarNavController: NavHostController) {
    BottomAppBar {
        val navBackStackEntry by bottomBarNavController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        items.forEach { bottomScreen ->
            BottomNavigationItem(
                icon = { Icon(bottomScreen.icon, contentDescription = null) },
                label = { Text(text = bottomScreen.route) },
                selected = currentDestination?.hierarchy?.any { it.route == bottomScreen.route } == true,
                onClick = {
                    bottomBarNavController.navigate(bottomScreen.route) {
                        popUpTo(bottomBarNavController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}