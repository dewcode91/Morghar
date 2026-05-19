package com.morghar.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PostScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Post a Rental", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(16.dp))
        Text("Form goes here (title, price, BHK, furnish, photos, location)")
    }
}
