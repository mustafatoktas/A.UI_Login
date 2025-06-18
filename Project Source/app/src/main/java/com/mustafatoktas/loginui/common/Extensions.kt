package com.mustafatoktas.loginui.common

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.mustafatoktas.loginui.ui.navigation.Destination

fun NavHostController.sayfayaGit(destination: Destination) {
    this.navigate(destination) {
        popUpTo(this@sayfayaGit.graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}