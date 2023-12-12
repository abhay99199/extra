package com.example.extra.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extra.R

@Composable
fun Home(
    navigateToNext: (ScreenName: String) -> Unit,
) {
    Box(modifier = Modifier.background(Color.White))
    {
        Column {
            val offset = Offset(5.0f, 10.0f)
            Text(
                text = "FitGenes", color = Color(155,184,205),
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
                text = "Good morning", color =  Color(155,184,205),
                modifier = Modifier.padding(10.dp, 5.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
//                    shadow = Shadow(
//                        color = Color.Black, offset =offset , blurRadius = 3f
//                    )
                )
            )


            Scaffold(
                containerColor = Color(155,184,205),
                bottomBar = {
                    BottomAppBar(
                        containerColor = Color.White,
                        actions = {

                            IconButton(onClick = { /* do something */ }) {
                                Icon(
                                    Icons.Filled.Home,
                                    contentDescription = "Localized description",
                                    tint = Color.Black
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Icon(
                                    Icons.Filled.ShoppingCart,
                                    contentDescription = "Localized description",
                                    tint = Color.Black
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Icon(
                                    Icons.Filled.DateRange,
                                    contentDescription = "Localized description",
                                    tint = Color.Black
                                )
                            }

                        },
                        floatingActionButton = {
                            FloatingActionButton(
                                contentColor = Color(155,184,205) ,
                                onClick = { /* do something */ },
                                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                            ) {
                                Icon(Icons.Filled.AccountCircle, "Localized description",
                                    tint = Color.Black)
                            }
                        }
                    )
                },
            )
            { innerPadding ->
                Text(
                    modifier = Modifier
                        .padding(innerPadding)
                        .padding(10.dp, 0.dp),
                    text = ""
                )
                Column(modifier = Modifier.background(Color(155,184,205))) {
                    Card(
                        modifier = Modifier
                            .padding(15.dp, 11.dp)

                            .clickable(onClick = { navigateToNext("crossfit") })
                    )
                    {
                        Box {
                            val image = painterResource(id = R.drawable.crossfit)
                            Image(
                                painter = image,
                                contentDescription = null, alignment = Alignment.BottomEnd,
                                modifier = Modifier.alpha(0.8f),
                            )
                            val offset = Offset(5.0f, 10.0f)
                            Text(
                                text = "CROSSFIT",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.Center),
                                style = TextStyle(
                                    fontSize = 35.sp,
                                    fontWeight = FontWeight.Bold,
                                    shadow = Shadow(
                                        color = Color.Black, offset =offset , blurRadius = 3f
                                    )
                                )
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 15.dp, vertical = 0.dp)
                            .clickable(onClick = { navigateToNext("gym") })
                    )
                    {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.gym),
                                contentDescription = null, alignment = Alignment.BottomEnd,
                                modifier = Modifier.alpha(0.8f),
                                )
                            val offset = Offset(5.0f, 10.0f)
                            Text(
                                text = "GYM",
                                color = Color.White,
                                modifier = Modifier.align(Alignment.Center),
                                style = TextStyle(
                                    fontSize = 35.sp,
                                    fontWeight = FontWeight.Bold,
                                    shadow = Shadow(
                                        color = Color.Black, offset =offset , blurRadius = 3f
                                    )
                                )
                            )
                        }
                    }
                    Row(modifier = Modifier.padding(7.dp, 0.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(10.dp, 11.dp)
                                .clickable(onClick = { navigateToNext("dumbbell") })
                        ) {
                            Box() {
                                Image(
                                    painter = painterResource(id = R.drawable.dumbbell),
                                    contentDescription = null,
                                    modifier = Modifier.alpha(0.8f)
                                )
                                val offset = Offset(5.0f, 10.0f)
                                Text(
                                    text = "DUMBBELL",
                                    color = Color.White,
                                    modifier = Modifier.align(Alignment.Center),
                                    style = TextStyle(
                                        fontSize = 35.sp,
                                        fontWeight = FontWeight.Bold,
                                        shadow = Shadow(
                                            color = Color.Black, offset =offset , blurRadius = 3f
                                        )
                                    )
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .padding(11.dp, 11.dp)
                                .clickable(onClick = { navigateToNext("Yoga") })
                        ) {
                            Box() {
                                Image(
                                    painter = painterResource(id = R.drawable.yoga),
                                    contentDescription = null,
                                    modifier = Modifier.alpha(0.8f)
                                )
                                val offset = Offset(5.0f, 10.0f)
                                Text(
                                    text = "YOGA",
                                    color = Color.White,
                                    modifier = Modifier.align(Alignment.Center),
                                    style = TextStyle(
                                        fontSize = 35.sp,
                                        fontWeight = FontWeight.Bold,
                                        shadow = Shadow(
                                            color = Color.Black, offset =offset , blurRadius = 3f
                                        )
                                    )
                                )
                            }
                        }

                    }
                    Row(modifier = Modifier.padding(7.dp, 0.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(10.dp, 0.dp)
                                .clickable(onClick = { navigateToNext("focus") })
                        ) {
                            Box() {
                                Image(
                                    painter = painterResource(id = R.drawable.music),
                                    contentDescription = null,
                                    modifier = Modifier.alpha(0.8f)
                                )
                                val offset = Offset(5.0f, 10.0f)
                                Text(
                                    text = "FOCUS",
                                    color = Color.White,
                                    modifier = Modifier.align(Alignment.Center),
                                    style = TextStyle(
                                        fontSize = 35.sp,
                                        fontWeight = FontWeight.Bold,
                                        shadow = Shadow(
                                            color = Color.Black, offset =offset , blurRadius = 3f
                                        )
                                    )
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .padding(11.dp, 0.dp)
                                .clickable(onClick = { navigateToNext("Coming Soon") })
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.coming),
                                contentDescription = null,
                            )
                        }
                    }
                }
            }
        }
    }
}