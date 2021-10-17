package com.manuelduarte077.cleanarchitecturenoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.manuelduarte077.cleanarchitecturenoteapp.ui.theme.CleanArchitectureNoteAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureNoteAppTheme {
                SimpleComposable()
            }
        }
    }
}


@Composable
fun SimpleComposable() {
    Text("Hello World")
}
@Preview
@Composable
fun ComposablePreview() {
    SimpleComposable()
}