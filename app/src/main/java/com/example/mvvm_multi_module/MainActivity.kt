package com.example.mvvm_multi_module

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.bottombar.presentation.BottomBarNavigation
import com.example.bottombar.presentation.bottomBarNav
import com.example.mvvm_multi_module.ui.theme.Mvvm_multi_moduleTheme
import com.example.search.presentation.SearchNavigation
import com.example.search.presentation.searchNav
import com.example.splash.presentation.SplashNavigation
import com.example.splash.presentation.splashScreenNav
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var mainActivityNavHostController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mvvm_multi_moduleTheme {
                mainActivityNavHostController = rememberNavController()
                NavHost(
                    navController = mainActivityNavHostController,
                    startDestination = SplashNavigation.ROUTE
                ) {
                    splashScreenNav { navigateBottomBar() }
                    bottomBarNav { navigateSearch() }
                    searchNav()
                }
            }
        }
    }

    private fun navigateBottomBar() {
        mainActivityNavHostController.navigate(BottomBarNavigation.ROUTE)
    }

    private fun navigateSearch() {
        mainActivityNavHostController.navigate(SearchNavigation.ROUTE)
    }
}