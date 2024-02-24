package com.example.extra.ui.Screen

import android.annotation.SuppressLint
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
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.material3.rememberTopAppBarState
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
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extra.Data.FRGym
import com.example.extra.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeekProgramScreen(
    modifier: Modifier = Modifier.background(Color(7,15,25)),
    navigateToNext: (ScreenName: String) -> Unit,
) {

    val weekprogramcardscreen = FRGym().getgymScreen()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())



    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            MediumTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(27, 26, 85),
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(
                        "8 Week Program",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navigateToNext("hhome") }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },
    ) {
        Box(modifier = Modifier.background(Color(83,92,145)))
        {
            Column(
                modifier = Modifier
                    .background(Color(83,92,145))
                    .padding(0.dp, 120.dp, 0.dp, 410.dp)
            ) {
                Card(
                    modifier = Modifier
                        .padding(15.dp, 11.dp)
                        .clickable(onClick = { navigateToNext("phase1")})
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
                            text = "Phase 1: Your First 4 Weeks",
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
                        .clickable(onClick = { navigateToNext("phase2")})
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
                            text = "Phase 2: Your Next 4 Weeks",
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
        }
        ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
        modifier = Modifier
            .size(width = 400.dp, height = 960.dp)
            .padding(12.dp, 795.dp, 0.dp, 15.dp),
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

