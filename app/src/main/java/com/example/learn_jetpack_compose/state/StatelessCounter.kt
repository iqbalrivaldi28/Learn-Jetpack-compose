package com.example.learn_jetpack_compose.state

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learn_jetpack_compose.ui.theme.LearnjetpackcomposeTheme

@Composable
fun StatelessCounter(
    count: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Button di klik $count kali",
            modifier = modifier.padding(bottom = 8.dp)
        )
        Button(onClick = { onClick() }) {
            Text(text = "Click Me")
        }
    }
}


@Composable
fun StatefulCounterRef(modifier: Modifier = Modifier) {
    var count by rememberSaveable {
        mutableStateOf(0)
    }
    
    StatelessCounter(
        count = count,
        onClick = { count++ },
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
private fun StatefulCounterRefPrev() {
    LearnjetpackcomposeTheme {
        StatefulCounterRef()
    }
}





