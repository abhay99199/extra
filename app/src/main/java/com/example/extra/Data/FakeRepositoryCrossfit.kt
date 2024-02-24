package com.example.extra.Data

import com.example.extra.R

class FakeRepositoryCrossfit {
    fun getcrossfitScreen(): List<Item> {
        return listOf(

            Item(
                title = "Mountain Climber",
                imgLocal = R.drawable.exersice_1,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Sit-Ups",
                imgLocal = R.drawable.exersice_2,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Tricep Dips",
                imgLocal = R.drawable.exersice_3,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Bicycle Crunches",
                imgLocal = R.drawable.exersice_4,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Legs Up the Wall pose",
                imgLocal = R.drawable.exersice_5,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Alternate Heel Touchers",
                imgLocal = R.drawable.exersice_6,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Crunch",
                imgLocal = R.drawable.exersice_7,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Sit Up on Bench",
                imgLocal = R.drawable.exersice_8,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Opposite hand to Opposite Foot Crunch",
                imgLocal = R.drawable.exersice_9,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Side Plank",
                imgLocal = R.drawable.exersice_10,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Alternate leg raises",
                imgLocal = R.drawable.exersice_11,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Twist",
                imgLocal = R.drawable.exersice_12,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Bridge",
                imgLocal = R.drawable.exersice_13,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "V-Sit",
                imgLocal = R.drawable.exersice_14,
                isImgLocal = true,
                priority = Screen.High
            ),Item(
                title = "Arm touch to Foot",
                imgLocal = R.drawable.exersice_15,
                isImgLocal = true,
                priority = Screen.High
            ),
        )
    }
}