package com.mustafatoktas.loginui.ui.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.mustafatoktas.loginui.R
import com.mustafatoktas.loginui.common.CihazDurumu
import com.mustafatoktas.loginui.ui.main.components.MainContent
import com.mustafatoktas.loginui.ui.main.components.OtherContent
import com.mustafatoktas.loginui.ui.main.viewmodel.MainViewModel

@Composable
fun MainScreen(
    mainNavController: NavHostController,
    viewModel: MainViewModel,
) {
    val state = viewModel.state.value

    when (state.cihazDurumu) {
        CihazDurumu.Rootlu -> OtherContent(
            baslik = stringResource(R.string.root_tespit_edildi),
            icerik = stringResource(R.string.root_icerigi),
            resim = R.drawable.root,
        )
        CihazDurumu.Emulator -> OtherContent(
            baslik = stringResource(R.string.cihaz_bir_emulator_uzerinde_calisiyor),
            icerik = stringResource(R.string.emulator_icerigi),
            resim = R.drawable.emulator,
        )
        CihazDurumu.Normal -> MainContent(
            mainNavController = mainNavController,
        )
    }
}