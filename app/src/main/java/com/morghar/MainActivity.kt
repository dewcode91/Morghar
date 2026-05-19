package com.morghar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.morghar.ui.MorgharAppRoot
import com.morghar.ui.theme.MorgharTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MorgharTheme {
                MorgharAppRoot()
            }
        }
    }
}
