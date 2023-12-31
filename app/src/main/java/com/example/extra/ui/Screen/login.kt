@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.extra.ui.Screen

//import androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider.value
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun login(navigateToNext: () -> Unit)
{
    var password by rememberSaveable { mutableStateOf("") }
    var value by remember { mutableStateOf("") }
    Box(modifier = Modifier.background(Color(155,184,205))) {
        Text(
            text = "LOGIN",
            modifier = Modifier
                .padding(50.dp, 200.dp)
                .rotate(90f),
            color = Color.White,
            fontSize = 90.sp
        )
        Text(
            text = "here",
            modifier = Modifier
                .padding(190.dp, 210.dp, 0.dp, 0.dp)
                .rotate(90f),
            color = Color.White,
            fontSize = 50.sp
        )
        Column(
            modifier = Modifier.align(Alignment.Center)
        ) {
            TextField(
                value = value,
                onValueChange = { value = it },
                label = { Text("Enter Email Id") },
                maxLines = 2,
                textStyle = TextStyle(color = Color(155,184,205)),
                modifier = Modifier
                    .padding(0.dp, 290.dp, 0.dp, 0.dp)
                    .background(Color(155, 184, 205))
            )
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Enter password") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier
                    .padding(0.dp, 30.dp, 0.dp, 0.dp)
            )
            Row {
                Text(
                    text = "Forget Password",
                    modifier = Modifier
                        .padding(0.dp, 30.dp, 0.dp, 0.dp),
                    color = White,
                )
                Button(onClick = navigateToNext,
                    modifier = Modifier
                    .padding(100.dp, 15.dp, 0.dp, 0.dp),
                    colors = ButtonDefaults.buttonColors( Color.White)) {
                    Text(text = "Login",
                        color = Color(155,184,205))
                }
            }
        }
    }
}

