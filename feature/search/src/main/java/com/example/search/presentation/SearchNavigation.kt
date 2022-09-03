package com.example.search.presentation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

object SearchNavigation {
    const val ROUTE = "search_route"
}

fun NavGraphBuilder.searchNav() {
    composable(SearchNavigation.ROUTE) {
        SearchScreen(hiltViewModel())
    }
}