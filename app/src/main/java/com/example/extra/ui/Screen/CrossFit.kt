package com.example.extra.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.extra.R

@Composable
fun CrossFit()
{
    Box(modifier = Modifier.background(Color.Black))
    {
        Column {
            Text(
                text = "Logo name", color = Color.White,
                modifier = Modifier.padding(170.dp, 10.dp)
            )
            Card {
                Text(text = "Mountain Climber",color = Color.White)
                Image(painter = painterResource(id = R.drawable.exersice_1), contentDescription = null)
            }
        }
    }

}



