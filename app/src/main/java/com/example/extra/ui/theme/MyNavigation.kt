package com.example.mywishlist.ui.theme

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.extra.ui.Screen.CrossFitScreen
import com.example.extra.ui.Screen.Home
import com.example.extra.ui.Screen.NextScreen
import com.example.extra.ui.Screen.PhaseOne
import com.example.extra.ui.Screen.PhaseTwo
import com.example.extra.ui.Screen.WeekEight
import com.example.extra.ui.Screen.WeekFive
import com.example.extra.ui.Screen.WeekOne
import com.example.extra.ui.Screen.WeekProgramScreen
import com.example.extra.ui.Screen.WeekSeven
import com.example.extra.ui.Screen.WeekSix
import com.example.extra.ui.Screen.Weekfour
import com.example.extra.ui.Screen.Weekthree
import com.example.extra.ui.Screen.Weektwo
import com.example.extra.ui.Screen.YogaScreen
import com.example.extra.ui.Screen.gender
import com.example.extra.ui.Screen.login
import com.example.extra.ui.Screen.measure
import com.example.extra.ui.Screen.start
import com.example.extra.ui.theme.MyViewModel
import logo

enum class Screens {
    Week8,
    Week7,
    Week6,
    Week5,
    Week4,
    Week3,
    Week2,
    Week1,
    Phase2,
    Phase1,
    Yoga,
    WeekProgram,
    Crossfit,
    Main,
    Measure,
    Gender,
    Login,
    Start,
    Detail,
    Logo
}

@SuppressLint("ComposableDestinationInComposeScope")
@Composable
fun MyNavigation() {
    //viewModel object
    val viewModel = viewModel<MyViewModel>()
    // uiState Object
    val uiState = viewModel.uiState.collectAsState()
    //navigation logic
    val navController = rememberNavController()
    //navigation routes
    NavHost(navController = navController, startDestination = Screens.Logo.name) {
        composable(Screens.Logo.name) {
            logo {
                navController.navigate(Screens.Start.name)
            }
        }
        composable(Screens.Start.name) {
            start {
                navController.navigate(Screens.Login.name)
            }
        }
        composable(Screens.Login.name) {
            login {
                navController.navigate(Screens.Gender.name)
            }
        }
        composable(Screens.Gender.name) {
            gender {
                navController.navigate(Screens.Measure.name)
            }
        }
        composable(Screens.Measure.name) {
            measure {
                navController.navigate(Screens.Main.name)
            }
        }
        composable(Screens.Main.name) {
//            home{
//                navController.navigate(Screens.Crossfit.name)
            Home {
                when (it) {
                    "crossfit" -> navController.navigate(Screens.Crossfit.name)
                }
                when (it) {
                    "8WeekProgram" -> navController.navigate(Screens.WeekProgram.name)
                }
                when (it) {
                    "yoga" -> navController.navigate(Screens.Yoga.name)
                }
            }
        }
        composable(Screens.Yoga.name) {
            YogaScreen {
                navController.navigate(Screens.Main.name)

                when (it) {
                    "hhome" -> navController.navigate(Screens.Main.name)
                }
            }
        }
        composable(Screens.WeekProgram.name) {
            WeekProgramScreen {
                navController.navigate(Screens.Main.name)
                when (it) {
                    "hhome" -> navController.navigate(Screens.Main.name)
                }
                when (it) {
                    "phase1" -> navController.navigate(Screens.Phase1.name)
                }
                when (it) {
                    "phase2" -> navController.navigate(Screens.Phase2.name)
                }
            }
        }
        composable(Screens.Phase1.name) {
            PhaseOne {
                navController.navigate(Screens.WeekProgram.name)
                when (it) {
                    "WeekProgram" -> navController.navigate(Screens.WeekProgram.name)
                }
                when (it){
                    "week1" -> navController.navigate(Screens.Week1.name)
                }
                when (it){
                    "week2" -> navController.navigate(Screens.Week2.name)
                }
                when (it){
                    "week3" -> navController.navigate(Screens.Week3.name)
                }
                when (it){
                    "week4" -> navController.navigate(Screens.Week4.name)
                }
            }
        }
        composable(Screens.Week1.name){
            WeekOne {
                navController.navigate(Screens.Phase1.name)
                when (it) {
                    "phase1" -> navController.navigate(Screens.Phase1.name)
                }
            }
        }
        composable(Screens.Week2.name){
            Weektwo {
                navController.navigate(Screens.Phase1.name)
                when (it) {
                    "phase1" -> navController.navigate(Screens.Phase1.name)
                }
            }
        }
        composable(Screens.Week3.name){
            Weekthree {
                navController.navigate(Screens.Phase1.name)
                when (it) {
                    "phase1" -> navController.navigate(Screens.Phase1.name)
                }
            }
        }
        composable(Screens.Week4.name){
            Weekfour {
                navController.navigate(Screens.Phase1.name)
                when (it) {
                    "phase1" -> navController.navigate(Screens.Phase1.name)
                }
            }
        }
        composable(Screens.Phase2.name) {
            PhaseTwo {
                navController.navigate(Screens.WeekProgram.name)
                when (it) {
                    "WeekProgram" -> navController.navigate(Screens.WeekProgram.name)
                }
                when (it){
                    "week5" -> navController.navigate(Screens.Week5.name)
                }
                when (it){
                    "week6" -> navController.navigate(Screens.Week6.name)
                }
                when (it){
                    "week7" -> navController.navigate(Screens.Week7.name)
                }
                when (it){
                    "week8" -> navController.navigate(Screens.Week8.name)
                }
            }
        }
        composable(Screens.Week5.name){
            WeekFive {
                navController.navigate(Screens.Phase2.name)
                when (it) {
                    "phase2" -> navController.navigate(Screens.Phase2.name)
                }
            }
        }
        composable(Screens.Week6.name){
            WeekSix {
                navController.navigate(Screens.Phase2.name)
                when (it) {
                    "phase2" -> navController.navigate(Screens.Phase2.name)
                }
            }
        }
        composable(Screens.Week7.name){
            WeekSeven {
                navController.navigate(Screens.Phase2.name)
                when (it) {
                    "phase2" -> navController.navigate(Screens.Phase2.name)
                }
            }
        }
        composable(Screens.Week8.name){
            WeekEight {
                navController.navigate(Screens.Phase2.name)
                when (it) {
                    "phase2" -> navController.navigate(Screens.Phase2.name)
                }
            }
        }
        composable(Screens.Crossfit.name) {
            CrossFitScreen {
                navController.navigate(Screens.Detail.name)
                when (it) {
                    "hhome" -> navController.navigate(Screens.Main.name)
                }
            }
        }
        composable(Screens.Detail.name) {
            NextScreen(uiState.value)
        }

    }
}







