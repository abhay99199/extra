package com.example.extra.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.extra.R

@Composable
fun measure(navigateToNext: () -> Unit){
    var sliderPositions by remember { mutableStateOf(0f) }
    Box(modifier = Modifier.background(Color.Black)){
        Column {
            Text(
                text = "Logo name",
                color = Color.White,
                modifier = Modifier.padding(170.dp, 30.dp)
            )
            Image(painter = painterResource(id = R.drawable.measure), contentDescription = null,
                modifier = Modifier.padding(135.dp,80.dp))
            Text(
                text = "What's your current height?" +
                        "(in fit)",
                color = Color.White,
                modifier = Modifier.padding(100.dp, 19.dp, 0.dp, 0.dp)
            )
            Slider(
                value = sliderPositions,
                onValueChange = { sliderPositions = it },colors = SliderDefaults.colors(
                    thumbColor = MaterialTheme.colorScheme.secondary,
                    activeTrackColor = MaterialTheme.colorScheme.secondary,
                    inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer),
                modifier = Modifier.padding(50.dp,30.dp),
                steps = 9,
                valueRange = 4f..9f
            )
            Text(text = sliderPositions.toString(),
                modifier = Modifier.padding(50.dp,0.dp)
            )
            Button(
                onClick = navigateToNext,
                modifier = Modifier
                    .padding(70.dp, 160.dp,0.dp,0.dp)
                    .height(35.dp)
                    .width(270.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text(
                    text = "Continue",
                    color = Color.White
                )
            }
        }
    }
}