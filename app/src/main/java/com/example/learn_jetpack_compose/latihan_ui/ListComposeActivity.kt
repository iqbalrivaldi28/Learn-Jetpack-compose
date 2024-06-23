package com.example.learn_jetpack_compose.latihan_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learn_jetpack_compose.R
import com.example.learn_jetpack_compose.ui.theme.LearnjetpackcomposeTheme

private val sampleName = listOf(
    "Iqbal",
    "Naisa",
    "Nasywa",
    "Putri",
    "Fauzan",
    "Haikal",
    "Sulthan",
    "Raisa"
)
class ListComposeActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnjetpackcomposeTheme {
                HelloJetpackComposeApp()
            }
        }
    }
}

@Composable
fun HelloJetpackComposeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        GreetingList(sampleName)
    }
}


@Preview(showBackground = true)
@Composable
private fun HelloJetpackComposeAppPrev() {
    LearnjetpackcomposeTheme {
        HelloJetpackComposeApp()
    }
}


@Composable
fun GreetingList(names: List<String>) {
    if (names.isNotEmpty()){
        Column {
            for (name in names){
                Greeting(name)
            }
        }
    } else {
        Text(text = "No people to Greet ")
    }
}


@Composable
fun Greeting(name: String) {
    Row (
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.jetpack_compose),
            contentDescription = "Logo Jetpack Compose",
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = "Hello $name",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Welcome to Compose")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GreetingPrev() {
    LearnjetpackcomposeTheme {
        Greeting("Jetpack")
    }
}