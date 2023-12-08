package com.example.extra.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.extra.R

@Composable
fun start(navigateToNext: () -> Unit) {
    var isPlaying by rememberSaveable { mutableStateOf(false) }
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.hey))
    val progress by animateLottieCompositionAsState(composition)


    Box(modifier = Modifier.background(Color.Black))
    {

        Column(
            modifier = Modifier
                .padding(0.dp, 100.dp, 0.dp, 0.dp)
                .align(Alignment.Center)
        ) {
            Image(
                painter = painterResource(id = R.drawable.birds),
                contentDescription = null,
                modifier = Modifier
                    .padding(150.dp, 60.dp)
            )
            Text(
                text = "Hey ! Welcome to your personalized fitness training." +
                        " Achieve your goals with expert guidance, tailored workouts," +
                        " and progress tracking.",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(5.dp, 0.dp)
            )
            Text(
                text = "Let’s transform together!",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(65.dp, 20.dp)
            )
            Row(modifier = Modifier.padding(100.dp, 0.dp)) {
                Text(
                    text = "If you have account. Please",
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "sign in",
                    color = Color.Blue,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(6.dp, 0.dp),
                )
            }
            Button(
                onClick = navigateToNext,
                modifier = Modifier
                    .padding(150.dp, 30.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text(
                    text = "Let's Start",
                    color = Color.White
                )
            }
        }
    }
}

private fun Any.navigate() {
    TODO("Not yet implemented")
}

