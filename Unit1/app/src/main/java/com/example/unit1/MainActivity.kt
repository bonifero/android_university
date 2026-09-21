package com.example.unit1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.unit1.pathway3.Greeting
import com.example.unit1.pathway3.GreetingImage
import com.example.unit1.pathway3.BusinessCardApp
import com.example.unit1.pathway3.ComposeArticleApp
import com.example.unit1.pathway3.ComposeQuadrantApp
import com.example.unit1.pathway3.TaskManagerApp
import com.example.unit1.ui.theme.Unit1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Unit1Theme {
                Unit1App()
            }
        }
    }
}

@Composable
fun Unit1App(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding()
    ) {

        // Greeting("Nikita")

        // GreetingImage(
        //     message = stringResource(R.string.happy_birthday_text),
        //     from = stringResource(R.string.signature_text)
        // )

        // ComposeArticleApp()

        // TaskManagerApp()

        // ComposeQuadrantApp()

        BusinessCardApp()
    }
}

@Preview(showBackground = true)
@Composable
fun Unit1AppPreview() {
    Unit1Theme {
        Unit1App()
    }
}
