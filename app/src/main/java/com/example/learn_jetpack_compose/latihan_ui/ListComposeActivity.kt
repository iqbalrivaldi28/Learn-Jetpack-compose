package com.example.learn_jetpack_compose.latihan_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ExpandLess
import androidx.compose.material.icons.outlined.ExpandMore
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
        LazyColumn {
            items(names.size) { index ->
                Greeting(names[index])
            }
        }
    } else {
        Text(text = "No people to Greet ")
    }
}


@Composable
fun Greeting(name: String) {
    var isExpanded by remember {
        mutableStateOf(false)
    }

    val animatedSizeDp by animateDpAsState(
        targetValue = if (isExpanded) 120.dp else 80.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        )
    )

    Row (
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.jetpack_compose),
            contentDescription = "Logo Jetpack Compose",
            modifier = Modifier.size(animatedSizeDp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column (
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Hello $name",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Welcome to Compose")
        }
        IconButton(onClick = { isExpanded = !isExpanded }) {
            Icon(
                imageVector = if (isExpanded) Icons.Outlined.ExpandLess else Icons.Outlined.ExpandMore,
                contentDescription = if (isExpanded) "Show less" else "Show more"
            )
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