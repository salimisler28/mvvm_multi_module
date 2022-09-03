package com.example.bottombar.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

object BottomBarNavigation {
    const val ROUTE = "bottom_bar_route"
}

fun NavGraphBuilder.bottomBarNav(onSearchClicked: () -> Unit) {
    composable(BottomBarNavigation.ROUTE) {
        BottomBarScreen(onSearchClicked)
    }
}