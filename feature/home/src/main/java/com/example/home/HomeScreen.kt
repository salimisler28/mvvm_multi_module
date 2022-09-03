package com.example.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(homeViewModel: HomeViewModel, onSearchClicked: () -> Unit) {
    Column {
        Text("home")
        Text("search", modifier = Modifier.clickable { onSearchClicked.invoke() })
    }
}