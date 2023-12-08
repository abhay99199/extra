package com.example.mywishlist.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.extra.ui.Screen.ListingScreen
import com.example.extra.ui.Screen.NextScreen
import com.example.extra.ui.Screen.gender
import com.example.extra.ui.Screen.home
import com.example.extra.ui.Screen.login
import com.example.extra.ui.Screen.start
import com.example.extra.ui.theme.MyViewModel

enum class Screens {
    Main,
    Gender,
    Login,
    Start,
    Home,
    Detail
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
    NavHost(navController = navController, startDestination = Screens.Start.name){
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
                navController.navigate(Screens.Main.name)
            }
        }
        composable(Screens.Main.name){
            home {
                navController.navigate(Screens.Home.name)
            }
        }
        composable(Screens.Home.name){
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


