package com.example.extra.Data

enum class SScreen{
    High,
    Medium,
    Low
}
data class Song (
    val imageUrl: String,
    val title: String,
    val artist: String,
    val duration: String,
    val media: String
)