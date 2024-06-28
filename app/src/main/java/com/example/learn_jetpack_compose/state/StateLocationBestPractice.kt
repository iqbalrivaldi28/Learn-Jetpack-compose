package com.example.learn_jetpack_compose.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
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
fun MyScreen(modifier: Modifier = Modifier) {
    
    var checked by remember {
        mutableStateOf(false)
    }

    Row(
        modifier = modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        MySwitch(
            initialChecked = checked,
            onCheckedChanged = {checked = it}
        )
        Text(
            text = if (checked) "ON" else "OFF",
            modifier = modifier.clickable {
                checked = !checked
            }
        )

    }
}


@Composable
fun MySwitch(
    initialChecked: Boolean,
    onCheckedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {

    var checked by remember {
        mutableStateOf(initialChecked)
    }

    Switch(
        checked = checked,
        onCheckedChange = {
            checked = it
            onCheckedChanged(it)
        }
    )
}


@Preview(showBackground = true)
@Composable
private fun MyScreenPrev() {
    LearnjetpackcomposeTheme {
        MyScreen()
    }
}