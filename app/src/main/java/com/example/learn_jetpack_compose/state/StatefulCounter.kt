package com.example.learn_jetpack_compose.state

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learn_jetpack_compose.ui.theme.LearnjetpackcomposeTheme

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Button di klik $count kali",
            modifier = modifier.padding(bottom = 16.dp)
        )
        Button(onClick = { count++ }) {
            Text(text = "Klik saya")
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun StatefulCounterPrev() {
    LearnjetpackcomposeTheme {
        StatefulCounter()
    }
}