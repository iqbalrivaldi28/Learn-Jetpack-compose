package com.example.learn_jetpack_compose.basic_layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learn_jetpack_compose.R
import com.example.learn_jetpack_compose.ui.theme.LearnjetpackcomposeTheme

class BoxLayoutActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            LearnjetpackcomposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    
                }
            }
        }
    }
}

@Composable
fun BoxProfile() {
    Box(modifier = Modifier) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
        Icon(
            imageVector = Icons.Default.Check,
            contentDescription = null,
            Modifier.size(24.dp).align(Alignment.BottomEnd)

        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BoxProfilePrev() {
    LearnjetpackcomposeTheme {
        BoxProfile()
    }
}