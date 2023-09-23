package com.reyuki.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.reyuki.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposableQuadrant()
                }
            }
        }
    }
}

@Composable
fun QuadrantCard(color: Color, title: String, content: String, modifier: Modifier) {
    Column(
        modifier = modifier
            .background(color)
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
    }
}

val mauve = Color(0xFFB69DF8)
val purple = Color(0xFFF6EDFF)

@Composable
fun ComposableQuadrant() {
    Column {
        Row(Modifier.weight(1f)) {
            QuadrantCard(purple, title = stringResource(R.string.text), content = stringResource(R.string.text_content), Modifier.weight(1f))
            QuadrantCard(mauve, title = stringResource(R.string.image), content = stringResource(R.string.image_content), Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)) {
            QuadrantCard(mauve, title = stringResource(R.string.row), content = stringResource(R.string.row_content), Modifier.weight(1f))
            QuadrantCard(purple, title = stringResource(R.string.column), content = stringResource(R.string.column_content), Modifier.weight(1f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        ComposableQuadrant()
    }
}