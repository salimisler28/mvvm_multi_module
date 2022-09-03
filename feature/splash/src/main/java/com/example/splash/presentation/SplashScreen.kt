package com.example.splash.presentation

import android.window.SplashScreen
import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SplashScreen(splashViewModel: SplashViewModel, onFinish: () -> Unit) {
    Text(text = "Splash", Modifier.clickable { onFinish.invoke() })
}