package com.example.extra.ui.Screen

//import com.example.focesmusic.ui.screens.MediaPlayerCard
//import com.example.focesmusic.ui.screens.SongCard
//import com.example.focesmusic.ui.screens.SongsList
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.extra.Data.Song

//import com.example.focesmusic.data.Song
//import com.example.focesmusic.data.songsList
//import com.example.focesmusic.ui.helper.SongHelper

@Composable
fun FocusScreen(
    modifier: Modifier = Modifier.background(Color(155, 184, 205)),
    navigateToNext: () -> Unit,
    songsList: List<Song>
) {
    var selectedSong by remember { mutableStateOf<Song?>(null) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(PaddingValues(0.dp,0.dp))
            .background(Color.White)
    ) {
        SongsList(songsList = songsList, onSongSelected = { song ->
            selectedSong = song
        })
        selectedSong?.let {
            MediaPlayerCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .background(Color.Transparent),
                it
            )
        }

    }
}
