package com.reyuki.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
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
fun ComposableQuadrant() {
    val mauve = Color(0xFFB69DF8)
    val purple = Color(0xFFF6EDFF)
    val configuration = LocalConfiguration.current
    Column {
        Row {
            Box(modifier = Modifier.background(color = purple)) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(configuration.screenWidthDp.dp / 2)
                        .height(configuration.screenHeightDp.dp / 2),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    Text(
                        text = stringResource(R.string.text),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = stringResource(R.string.text_content),
                        textAlign = TextAlign.Justify
                    )
                }
            }
            Box(modifier = Modifier.background(color = mauve)) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(configuration.screenWidthDp.dp / 2)
                        .height(configuration.screenHeightDp.dp / 2),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = stringResource(R.string.image),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = stringResource(R.string.image_content),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
        Row {
            Box(modifier = Modifier.background(color = mauve)) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(configuration.screenWidthDp.dp / 2)
                        .height(configuration.screenHeightDp.dp / 2),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    Text(
                        text = stringResource(R.string.row),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = stringResource(R.string.row_content),
                        textAlign = TextAlign.Justify
                    )
                }
            }
            Box(modifier = Modifier.background(color = purple)) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .width(configuration.screenWidthDp.dp / 2)
                        .height(configuration.screenHeightDp.dp / 2),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    Text(
                        text = stringResource(R.string.column),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = stringResource(R.string.column_content),
                        textAlign = TextAlign.Justify
                    )
                }
            }
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