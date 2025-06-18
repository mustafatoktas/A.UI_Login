package com.mustafatoktas.loginui.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.mustafatoktas.loginui.ui.anasayfa.AnasayfaScreen
import com.mustafatoktas.loginui.ui.giris.GirisScreen
import com.mustafatoktas.loginui.ui.main.MainScreen
import com.mustafatoktas.loginui.ui.main.viewmodel.MainViewModel
import com.mustafatoktas.loginui.ui.uye_ol.UyeOlScreen

@Composable
fun MainNavHost(
    mainNavController: NavHostController,
) {
    val mainViewModel: MainViewModel = hiltViewModel()

    NavHost(
        navController = mainNavController,
        startDestination = Graph.MainGraph
    ) {
        navigation<Graph.MainGraph>(
            startDestination = Destination.MainScreen
        ) {
            composable<Destination.MainScreen> {
                MainScreen(
                    mainNavController = mainNavController,
                    viewModel = mainViewModel,
                )
            }
            composable<Destination.GirisScreen> {
                GirisScreen(
                    mainNavController = mainNavController,
                )
            }
            composable<Destination.UyeOlScreen> {
                UyeOlScreen(
                    mainNavController = mainNavController,
                )
            }
            composable<Destination.AnasayfaScreen> {
                AnasayfaScreen(
                    mainNavController = mainNavController,
                )
            }
        }
    }
}