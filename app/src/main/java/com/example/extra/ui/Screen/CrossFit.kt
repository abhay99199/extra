package com.example.extra.ui.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.extra.Data.FakeRepository
import com.example.extra.Data.Item



@Composable
fun CrossFit(onItemSelected: (Item) -> Unit,)
{
    val CrossfitList = FakeRepository().gethomeScreen()
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        item {
            Text(
                text = "My WishList",
                style = MaterialTheme.typography.headlineLarge
            )
        }
        items(CrossfitList) { item ->
            ItemCard(item = item) { onItemSelected(item) }
        }
    }
}

fun onItemSelected(item: Int) {

}
@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
@Composable
fun ItemCard(item: Item, onClick: () -> Unit) {
    Card(onClick = onClick)
    {
        if (item.isImgLocal){
            GlideImage(model = item.imgLocal,
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(250.dp)
            )
        }
        else{
            GlideImage(model = item.img,
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(250.dp)
            )
        }
        Column (modifier = Modifier.padding(16.dp)){
            Text(text = item.title)
        }
    }
}
