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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extra.R

@Composable
fun home(
    navigateToNext: () -> Unit
) {
    Box(modifier = Modifier.background(Color.Black))
    {
        Column {
            Text(
                text = "Logo name", color = Color.White,
                modifier = Modifier.padding(170.dp, 10.dp)
            )
            Text(
                text = "Good morning", color = Color.White,
                modifier = Modifier.padding(10.dp, 10.dp)
            )
            Text(
                text = "User", color = Color.White,
                modifier = Modifier.padding(10.dp, 0.dp)
            )
            Column {
                Card(
                    modifier = Modifier
                        .padding(horizontal = 15.dp, vertical = 20.dp)
                        .clickable(onClick = navigateToNext)
                )
                {
                    Row {
                        Text(
                            text = "CrossFit", color = Color.White,
                            modifier = Modifier.padding(50.dp, 50.dp, 0.dp, 0.dp),
                            fontSize = 20.sp
                        )
                        Image(
                            painter = painterResource(id = R.drawable.crossfit),
                            contentDescription = null, alignment = Alignment.BottomEnd,
                            modifier = Modifier.padding(165.dp, 10.dp, 30.dp, 10.dp),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(horizontal = 15.dp, vertical = 0.dp)
                        .clickable(onClick = navigateToNext)
                )
                {
                    Row {
                        Text(
                            text = "Gym", color = Color.White,
                            modifier = Modifier.padding(50.dp, 50.dp, 0.dp, 0.dp),
                            fontSize = 20.sp
                        )
                        Image(
                            painter = painterResource(id = R.drawable.gym),
                            contentDescription = null, alignment = Alignment.BottomEnd,
                            modifier = Modifier.padding(195.dp, 15.dp, 30.dp, 15.dp),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
                Row(modifier = Modifier.padding(7.dp, 0.dp)) {
                    Card(
                        modifier = Modifier
                            .padding(10.dp, 20.dp, 0.dp, 0.dp)
                            .clickable(onClick = navigateToNext)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.dumbbel),
                            contentDescription = null,
                            modifier = Modifier.padding(20.dp, 10.dp, 10.dp, 10.dp)
                        )
                        Text(
                            text = "Dumbbell",
                            color = Color.White,
                            modifier = Modifier
                                .padding(60.dp, 5.dp)
                        )
                    }
                    Card(
                        modifier = Modifier
                            .padding(20.dp, 20.dp, 0.dp, 0.dp)
                            .clickable(onClick = navigateToNext)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.yoga),
                            contentDescription = null,
                            modifier = Modifier.padding(20.dp, 10.dp, 10.dp, 10.dp)
                        )
                        Text(
                            text = "Yoga",
                            color = Color.White,
                            modifier = Modifier
                                .padding(75.dp, 5.dp)
                        )
                    }

                }
                Row(modifier = Modifier.padding(7.dp, 0.dp)) {
                    Card(
                        modifier = Modifier
                            .padding(10.dp, 20.dp, 0.dp, 0.dp)
                            .clickable(onClick = navigateToNext)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.focus),
                            contentDescription = null,
                            modifier = Modifier.padding(20.dp, 10.dp, 10.dp, 10.dp)
                        )
                        Text(
                            text = "Focus",
                            color = Color.White,
                            modifier = Modifier
                                .padding(72.dp, 5.dp)
                        )
                    }
                    Card(
                        modifier = Modifier
                            .padding(20.dp, 20.dp, 0.dp, 0.dp)
                            .clickable(onClick = navigateToNext)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.dumbbel),
                            contentDescription = null,
                            modifier = Modifier.padding(20.dp, 10.dp, 10.dp, 10.dp)
                        )
                        Text(
                            text = "Coming Soon...",
                            color = Color.White,
                            modifier = Modifier
                                .padding(45.dp, 5.dp)
                        )
                    }
                }
            }
            Scaffold(
                bottomBar = {
                    BottomAppBar(
                        actions = {

                            IconButton(onClick = { /* do something */ }) {
                                Icon(
                                    Icons.Filled.ShoppingCart,
                                    contentDescription = "Localized description",
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Icon(
                                    Icons.Filled.Edit,
                                    contentDescription = "Localized description"
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Icon(
                                    Icons.Filled.DateRange,
                                    contentDescription = "Localized description",
                                )
                            }

                        },
                        floatingActionButton = {
                            FloatingActionButton(
                                onClick = { /* do something */ },
                                containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                            ) {
                                Icon(Icons.Filled.AccountCircle, "Localized description")
                            }
                        }
                    )
                },
            ) { innerPadding ->
                Text(
                    modifier = Modifier.padding(innerPadding),
                    text = "Example of a scaffold with a bottom app bar."
                )
            }
        }
    }
}