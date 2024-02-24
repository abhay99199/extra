package com.example.extra.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    navigateToNext: (ScreenName: String) -> Unit,
) {
//    val sheetState = rememberModalBottomSheetState()
//    val scope = rememberCoroutineScope()
//    var showBottomSheet by remember { mutableStateOf(false) }

    Box(modifier = Modifier.background(Color.Black))
    {
        Column {
            val offset = Offset(5.0f, 10.0f)
            Text(
                text = "FitGenes", color = Color(155, 184, 205),
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
                text = "Good morning", color = Color(155, 184, 205),
                modifier = Modifier.padding(10.dp, 5.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
//                    shadow = Shadow(
//                        color = Color.Black, offset =offset , blurRadius = 3f
//                    )
                )
            )

            Column(
                modifier = Modifier
                    .background(Color.Black)
                    .padding(0.dp, 20.dp)
            ) {
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
                                    color = Color.Black, offset = offset, blurRadius = 3f
                                )
                            )
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(horizontal = 15.dp, vertical = 0.dp)
                        .clickable(onClick = { navigateToNext("8WeekProgram") })
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
                            text = "8 WEEK PROGRAM",
                            color = Color.White,
                            modifier = Modifier.align(Alignment.Center),
                            style = TextStyle(
                                fontSize = 35.sp,
                                fontWeight = FontWeight.Bold,
                                shadow = Shadow(
                                    color = Color.Black, offset = offset, blurRadius = 3f
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
                                        color = Color.Black, offset = offset, blurRadius = 3f
                                    )
                                )
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .padding(11.dp, 11.dp)
                            .clickable(onClick = { navigateToNext("yoga") })
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
                                        color = Color.Black, offset = offset, blurRadius = 3f
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
                                        color = Color.Black, offset = offset, blurRadius = 3f
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
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 400.dp, height = 200.dp)
                    .padding(12.dp, 0.dp, 0.dp, 15.dp),
                colors = CardDefaults.elevatedCardColors(Color.Black)
            )
            {
                Row() {
                    Column(
                        modifier = Modifier
                            .padding(start = 10.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Home, contentDescription = null,
                            modifier = Modifier
                                .size(35.dp)
                                .padding(top = 10.dp)
                                .clickable { }
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 70.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart, contentDescription = null,
                            modifier = Modifier
                                .size(35.dp)
                                .padding(top = 10.dp)
                                .clickable { },
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 75.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = null,
                            modifier = Modifier
                                .size(35.dp)
                                .padding(top = 10.dp)
                                .clickable { }
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 55.dp)
                    ) {
                        val sheetState = rememberModalBottomSheetState()
                        val scope = rememberCoroutineScope()
                        var showBottomSheet by remember { mutableStateOf(false) }
                        Scaffold(
                            modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 0.dp),
                            containerColor = Color.Black,
                            contentColor = Color.White,
                            floatingActionButton = {
                                FloatingActionButton(
                                    containerColor = Color.Black,
                                    onClick = {
                                        showBottomSheet = true
                                    },
                                    modifier = Modifier
                                        .padding(0.dp, 0.dp, 10.dp, 0.dp)
                                        .size(30.dp)
                                ) {
                                    Icon(Icons.Default.AccountCircle, contentDescription = null)
                                }
                            }
                        ) { contentPadding ->
                            // Screen content
                            Box(modifier = Modifier.padding(contentPadding)) { }
                            if (showBottomSheet) {
                                ModalBottomSheet(
                                    onDismissRequest = {
                                        showBottomSheet = false
                                    },
                                    sheetState = sheetState,
                                    modifier = Modifier.background(Color.Transparent),
                                    containerColor = Color(7,15,25)
                                ) {
                                    Column(modifier = Modifier.padding(bottom = 60.dp)) {
                                        Text(
                                            text = "Do more with Fitgenes",
//                                            textAlign = TextAlign.Center,
                                            modifier = Modifier
                                                .padding(120.dp, 0.dp, 0.dp, 0.dp),
                                            color = Color(146,144,195),
                                            style = TextStyle(
                                                fontSize = 22.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        )
                                        Card(
                                            onClick = { navigateToNext("crossfit") },
                                            modifier = Modifier
                                                .padding(0.dp, 10.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color(146,144,195)
                                            )
                                        ) {
                                            Text(
                                                text = "CrossFit", modifier = Modifier
                                                    .padding(120.dp, 10.dp, 10.dp, 10.dp),
                                                color = Color(7,15,43),
                                                style = TextStyle(
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            )
                                        }
                                        Card(
                                            onClick = { /*TODO*/ },
                                            modifier = Modifier
                                                .padding(0.dp, 10.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color(146,144,195)
                                            )
                                        ) {
                                            Text(
                                                text = "8 Week Program", modifier = Modifier
                                                    .padding(120.dp, 10.dp, 10.dp, 10.dp),
                                                color = Color(7,15,43),
                                                style = TextStyle(
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            )
                                        }
                                        Card(
                                            onClick = { navigateToNext("yoga") },
                                            modifier = Modifier
                                                .padding(0.dp, 10.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color(146,144,195)
                                            )
                                        ) {
                                            Text(
                                                text = "Yoga", modifier = Modifier
                                                    .padding(120.dp, 10.dp, 10.dp, 10.dp),
                                                color = Color(7,15,43),
                                                style = TextStyle(
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            )
                                        }
                                        Card(
                                            onClick = { /*TODO*/ },
                                            modifier = Modifier
                                                .padding(0.dp, 10.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color(146,144,195)
                                            )
                                        ) {
                                            Text(
                                                text = "Balanced Diet", modifier = Modifier
                                                    .padding(120.dp, 10.dp, 10.dp, 10.dp),
                                                color = Color(7,15,43),
                                                style = TextStyle(
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

