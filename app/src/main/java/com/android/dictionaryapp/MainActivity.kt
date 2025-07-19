package com.android.dictionaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.dictionaryapp.ui.theme.DictionaryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DictionaryTheme  {

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DictionaryTheme {
    }
}