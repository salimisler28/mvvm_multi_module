package com.example.splash.presentation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

object SplashNavigation {
    const val ROUTE = "splash_route"
}

fun NavGraphBuilder.splashScreenNav(onFinish: () -> Unit) {
    composable(SplashNavigation.ROUTE) {
        SplashScreen(splashViewModel = hiltViewModel(), onFinish)
    }
}