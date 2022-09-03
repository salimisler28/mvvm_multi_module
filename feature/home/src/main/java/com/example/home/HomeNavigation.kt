package com.example.home

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

object HomeNavigation {
    val ROUTE = "home"
}

fun NavGraphBuilder.homeScreenNav(onSearchClicked: () -> Unit) {
    composable(HomeNavigation.ROUTE) {
        HomeScreen(hiltViewModel(), onSearchClicked)
    }
}