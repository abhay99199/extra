package com.example.extra.ui.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.extra.Data.FakeRepository
import com.example.extra.Data.Item

@Composable
fun ListingScreen(
    onItemSelected: (Item) -> Unit,
) {
    val homescreen = FakeRepository().gethomeScreen()
    LazyColumn(modifier = Modifier.padding(16.dp)){
        item{
            Column {
                Text(
                    text = "Logo name", color = Color.White,
                    modifier = Modifier.padding(170.dp, 10.dp)
                )
            }
        }
        items(homescreen){ item ->
            GymCard(item = item, onClick =  { onItemSelected(item) })
        }
    }
}



fun onItemSelected(item: Item) {

}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
@Composable
fun GymCard(item: Item, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(),
        modifier = Modifier.padding(0.dp,0.dp,0.dp,10.dp)
    ) {
        if (item.isImgLocal){
            GlideImage(model = item.imgLocal,
                contentDescription = item.title,
                modifier = Modifier.padding(110.dp,0.dp)
            )
        }
        else{
            GlideImage(model = item.img,
                contentDescription = item.title,
                contentScale = ContentScale.Fit,
                modifier = Modifier.padding(0.dp,10.dp,0.dp,0.dp)
            )
        }
        Column(modifier = Modifier.padding(10.dp,10.dp,0.dp,10.dp)) {
            Text(text = item.title)
        }

    }

}

