package com.example.mokorestest

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import dev.icerock.moko.resources.compose.painterResource

@Composable
internal fun App() {
    MaterialTheme {
        Scaffold {
            Image(painterResource(MR.images.sun), contentDescription = null)
        }
    }
}