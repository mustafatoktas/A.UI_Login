package com.mustafatoktas.loginui.ui.navigation

import kotlinx.serialization.Serializable

sealed class Graph {

    @Serializable
    data object MainGraph : Graph()
}

sealed class Destination {

    @Serializable
    data object MainScreen : Destination()

    @Serializable
    data object GirisScreen : Destination()

    @Serializable
    data object UyeOlScreen : Destination()

    @Serializable
    data object AnasayfaScreen : Destination()
}