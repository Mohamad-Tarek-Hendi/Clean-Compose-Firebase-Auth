package com.example.firebasegooglesign_in

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.firebasegooglesign_in.ui.theme.FirebaseGoogleSignInTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseGoogleSignInTheme {

            }
        }
    }
}