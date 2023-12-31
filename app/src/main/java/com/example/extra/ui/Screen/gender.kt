package com.example.extra.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
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
    var checked by remember { mutableStateOf(true) }
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
            Image(painter = painterResource(id = R.drawable.genderrr), contentDescription = null,
                modifier = Modifier.padding(100.dp,100.dp))
            Text(
                text = "What's your Gender?",
                color = Color.White,
                modifier = Modifier.padding(140.dp, 10.dp, 0.dp, 0.dp)
            )
            Row(modifier = Modifier.padding(180.dp, 80.dp, 0.dp, 0.dp)) {
                Switch(
                    modifier = Modifier.scale(2.5f),
                    checked = checked,
                    onCheckedChange = {
                        checked = it
                    },
                    thumbContent = if (checked) {
                        {
                            Image(painter = painterResource(id = R.drawable.test_female), contentDescription = "Female")

                        }
                    } else {
                        {
                            Image(painter = painterResource(id = R.drawable.test_male), contentDescription = "Male")
                        }

                    }
                )
            }
//            Row {
//                AnimatedVisibility(visible = checked) {
//                    Text(
//                        text = "FEMALE", color = Color.White,
//                        modifier = Modifier.padding(110.dp, 0.dp, 0.dp, 0.dp)
//                    )
//
//                }
//                Text(
//                    text = "MALE", color = Color.White,
//                    modifier = Modifier.padding(130.dp, 0.dp, 0.dp, 0.dp)
//                )
//            }
            Button(
                onClick = navigateToNext,
                modifier = Modifier
                    .padding(70.dp, 155.dp)
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