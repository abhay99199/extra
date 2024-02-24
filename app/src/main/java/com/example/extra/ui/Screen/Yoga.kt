package com.example.extra.ui.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.extra.Data.FakeRepoYoga
import com.example.extra.Data.Item

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YogaScreen(
    modifier: Modifier = Modifier.background(Color(155, 184, 205)),
    navigateToNext: (ScreenName: String) -> Unit,
) {
    val yogacardscreen = FakeRepoYoga().getyogaScreen()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())



    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            MediumTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(27,26,85),
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(
                        "Yoga",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {navigateToNext("hhome")}) {
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
        LazyColumn(
            modifier = Modifier
                .padding(10.dp, 0.dp)
                .background(Color(83,92,145))
        ) {
            item {
                Column(modifier = Modifier.padding(0.dp,35.dp,0.dp,0.dp)) {
                    val offset = Offset(5.0f, 10.0f)
                    Text(
                        text = "FitGenes", color = Color.White,
                        modifier = Modifier.padding(149.dp, 15.dp),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
//                    shadow = Shadow(
//                        color = Color.Black, offset =offset , blurRadius = 3f
//                    )
                        )
                    )
                }
            }
            items(yogacardscreen) { item ->
                YogaCard(item = item, onClick = { navigateToNext(item.toString()) })
            }
        }
    }
}


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun YogaCard(item: Item, onClick: () -> Unit){
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 10.dp),
    ) {
        if (item.isImgLocal) {
            GlideImage(
                model = item.imgLocal,
                contentDescription = item.title,
                modifier = Modifier.padding(110.dp, 0.dp)
            )
        } else {
            GlideImage(
                model = item.img,
                contentDescription = item.title,
                contentScale = ContentScale.Fit,
                modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)
            )
        }
        Column(modifier = Modifier.padding(10.dp, 10.dp, 0.dp, 10.dp)) {
            Text(
                text = item.title,
                color = Color(155, 184, 205)
            )
            Text(
                text = item.min,
                color = Color(155, 184, 205)
            )
            Text(
                text = item.howto,
                color = Color(155, 184, 205)
            )
        }
    }
}