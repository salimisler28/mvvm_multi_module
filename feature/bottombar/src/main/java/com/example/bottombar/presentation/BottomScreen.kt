package com.example.bottombar.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.home.HomeNavigation
import com.example.search.presentation.SearchNavigation

sealed class BottomScreen(val route: String, val icon: ImageVector) {
    object Home : BottomScreen(HomeNavigation.ROUTE, icon = Icons.Filled.Home)
    object Search : BottomScreen(SearchNavigation.ROUTE, icon = Icons.Filled.Search)
}

val items = listOf(BottomScreen.Home, BottomScreen.Search)
