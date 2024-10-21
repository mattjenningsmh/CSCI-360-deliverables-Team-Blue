package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.CougarHuntTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CougarHuntTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    HomeScreen()
                }

            }
        }
    }
}

@Composable
fun HomeScreen(){
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Top
    ){
        IconButton(
            onClick = { /* Handle button click */ },
            modifier = Modifier.size(20.dp).clip(CircleShape)
        ) {
            Image(
                painter = painterResource(id = R.drawable.blank_profile),
                contentDescription = "blank profile logo",
                modifier = Modifier.size(20.dp).clip(CircleShape)
            )
        }
        Text(
            text = "sign in",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(horizontal = 5.dp)
        )
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
       Image(
           painter = painterResource(id = R.drawable.cougarlogo),
           contentDescription = "CougarHunt logo",
           modifier = Modifier.size(200.dp)
       )
        Text(
            text = "CougarHunt",
            style = MaterialTheme.typography.titleMedium
        )
        Button(
            onClick = {/* Handle input here*/},
            modifier = Modifier.padding(16.dp)
        ){
            Text(text = "Start Hunt")
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    CougarHuntTheme {
        Surface(modifier = Modifier.fillMaxSize()){
            HomeScreen()
        }

    }

}



