package com.example.extra.ui.Screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.extra.Data.Song
import com.example.extra.ui.helper.SongHelper
//import com.example.focesmusic.data.Song
//import com.example.focesmusic.data.songsList
//import com.example.focesmusic.ui.helper.SongHelper

@Composable
fun SongsList(songsList: List<Song>, onSongSelected: (song: Song) -> Unit) {
    var isSongSelected by remember { mutableStateOf(false) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                bottom = if (isSongSelected) {
                    48.dp
                } else {
                    4.dp
                }
            )
    ) {
        items(songsList) { song ->
            SongCard(song = song) {
                isSongSelected = true
                SongHelper.stopStream()
                onSongSelected(song)
            }
        }
    }
}
