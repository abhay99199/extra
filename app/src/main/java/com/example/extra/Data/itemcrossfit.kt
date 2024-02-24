package com.example.extra.Data

enum class Screen{
    High,
    Medium,
    Low
}

data class Item(
    val title: String,
    val img:String ="",
    val imgLocal:Int = 0,
    val priority: Screen=Screen.Low,
    val isImgLocal: Boolean = false,
    val min: String="",
    val howto: String= "",
)