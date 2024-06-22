package com.example.learn_jetpack_compose.basic_layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learn_jetpack_compose.R
import com.example.learn_jetpack_compose.ui.theme.LearnjetpackcomposeTheme

class RowLayoutActivity:  ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            LearnjetpackcomposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RowProfile()
                }
                
            }
        }
    }
}


@Composable
fun RowProfile() {
    Row {
        Row(modifier = Modifier) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
            Column (modifier = Modifier) {
                Text(text = "Ini title gambar")
                Text(text = "Ini deskripsi gambar ")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun RowProfilePrev() {
    LearnjetpackcomposeTheme {
        RowProfile()
    }
}