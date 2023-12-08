package com.example.extra.Data

class FakeRepository {
    fun gethomeScreen(): List<Item> {
        return listOf(
            Item(
                title = "CrossFit",
                img = "crossfit.png",
                priority = Screen.High
            ),
            Item(
                title = "Gym",
                img = "gym.png",
                priority = Screen.High
            ),
            Item(
                title = "Dumbbell",
                img = "dumbbel.png",
                priority = Screen.High
            ),
            Item(
                title = "Yoga",
                img = "yoga.png",
                priority = Screen.High
            ),
            Item(
                title = "Focus",
                img = "focus.png",
                priority = Screen.High
            ),
            Item(
                title = "Coming Soon...",
                img = "dumbbel.png",
                priority = Screen.High
            ),
        )
    }
}