package com.mustafatoktas.loginui.ui.main.viewmodel

import com.mustafatoktas.loginui.common.CihazDurumu

data class MainState(
    val cihazDurumu: CihazDurumu = CihazDurumu.Normal,
    )