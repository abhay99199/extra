package com.example.extra.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extra.R

@Composable
fun gender(navigateToNext: () -> Unit) {
    Box(modifier = Modifier.background(Color(155,184,205))) {
        Column {
            val offset = Offset(5.0f, 10.0f)
            Text(
                text = "FitGenes", color = Color.White,
                modifier = Modifier.padding(170.dp, 5.dp),
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
//                    shadow = Shadow(
//                        color = Color.Black, offset =offset , blurRadius = 3f
//                    )
                )
            )
            Text(
                text = "What's your Gender?",
                color = Color.White,
                modifier = Modifier.padding(140.dp, 190.dp, 0.dp, 0.dp)
            )
            Row(modifier = Modifier.padding(45.dp, 40.dp, 0.dp, 0.dp)) {
                Card(modifier = Modifier.padding(0.dp, 0.dp, 5.dp, 0.dp)
                    .background(Color(155,184,205))
                    .clickable (onClick = navigateToNext)) {
                    Image(
                        painter = painterResource(id = R.drawable.male), contentDescription = null,
                    )

                }
                Card(modifier = Modifier.padding(5.dp, 0.dp, 0.dp, 0.dp)
                    .background(Color(155,184,205))
                    .clickable (onClick = navigateToNext)) {
                    Image(
                        painter = painterResource(id = R.drawable.female),
                        contentDescription = null
                    )
                }
            }
            Row {
                Text(
                    text = "Male", color = Color.White,
                    modifier = Modifier.padding(110.dp, 0.dp, 0.dp, 0.dp)
                )
                Text(
                    text = "Female", color = Color.White,
                    modifier = Modifier.padding(130.dp, 0.dp, 0.dp, 0.dp)
                )
            }
            Button(
                onClick = navigateToNext,
                modifier = Modifier
                    .padding(70.dp, 120.dp)
                    .height(35.dp)
                    .width(270.dp),
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "Continue",
                    color = Color(155,184,205)
                )
            }
        }
    }
}

