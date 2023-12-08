package com.example.extra.Data

enum class Screen{
    High,
    Medium,
    Low
}

data class Item(
    val title: String,
    val img:String ="",
    val priority: Screen=Screen.Low
)