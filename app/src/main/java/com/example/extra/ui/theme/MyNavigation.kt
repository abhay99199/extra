package com.example.mywishlist.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.extra.ui.Screen.Home
import com.example.extra.ui.Screen.ListingScreen
import com.example.extra.ui.Screen.NextScreen
import com.example.extra.ui.Screen.gender
import com.example.extra.ui.Screen.login
import com.example.extra.ui.Screen.measure
import com.example.extra.ui.Screen.start
import com.example.extra.ui.theme.MyViewModel
import logo

enum class Screens {
    Crossfit,
    Main,
    Measure,
    Gender,
    Login,
    Start,
    Detail,
    Logo
}

@Composable
fun MyNavigation(){
    //viewModel object
    val viewModel= viewModel<MyViewModel>()
    // uiState Object
    val uiState = viewModel.uiState.collectAsState()
    //navigation logic
    val navController = rememberNavController()
    //navigation routes
    NavHost(navController = navController, startDestination = Screens.Logo.name){
        composable(Screens.Logo.name){
            logo {
                navController.navigate(Screens.Start.name)
            }
        }
        composable(Screens.Start.name){
            start {
                navController.navigate(Screens.Login.name)
            }
        }
        composable(Screens.Login.name){
            login {
                navController.navigate(Screens.Gender.name)
            }
        }
        composable(Screens.Gender.name){
            gender {
                navController.navigate(Screens.Measure.name)
            }
        }
        composable(Screens.Measure.name){
            measure {
                navController.navigate(Screens.Main.name)
            }
        }
        composable(Screens.Main.name){
//            home{
//                navController.navigate(Screens.Crossfit.name)
            Home {
               when (it){
                   "crossfit" -> navController.navigate(Screens.Crossfit.name)
               }
//                when (it){
//                    "gym" -> navController.navigate(Screens.Crossfit.name)
//                }
            }
        }
        composable(Screens.Crossfit.name){
            ListingScreen{
                viewModel.onItemSelected(it)
                navController.navigate(Screens.Detail.name)
            }
        }
        composable(Screens.Detail.name){
            NextScreen(uiState.value)
        }
    }
}




