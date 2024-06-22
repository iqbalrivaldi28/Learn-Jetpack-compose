package com.example.learn_jetpack_compose.basic_layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learn_jetpack_compose.ui.theme.LearnjetpackcomposeTheme

class ColumnLayoutActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnjetpackcomposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UserProfile()
                }
            }
        }
    }
}


@Composable
fun UserProfile() {
    Column {
        Text(text = "M. Iqbal Rivaldi")
        Text(text = "Jr. Android Developer")
    }
}

@Preview(showBackground = true)
@Composable
private fun UserProfilePrev() {
    LearnjetpackcomposeTheme {
        UserProfile()
    }

}


