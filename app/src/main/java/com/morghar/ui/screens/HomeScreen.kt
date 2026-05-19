package com.morghar.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.morghar.Constants

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Find Rentals in ${Constants.CITY_NAME}", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(16.dp))

        // Filters (stub UI)
        FilterRow()
        Spacer(Modifier.height(16.dp))

        // Listings (stub list)
        Text("Listings will appear here")
    }
}

@Composable
private fun FilterRow() {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        OutlinedButton(onClick = {}) { Text("Price") }
        OutlinedButton(onClick = {}) { Text("BHK") }
        OutlinedButton(onClick = {}) { Text("Furnished") }
    }
}
