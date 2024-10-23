package com.mustafatoktas.loginui.ui.anasayfa

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.mustafatoktas.loginui.R
import com.mustafatoktas.loginui.common.KonfettiUtil
import com.mustafatoktas.loginui.common.sayfayaGit
import com.mustafatoktas.loginui.ui.anasayfa.components.Greetings
import com.mustafatoktas.loginui.ui.general_components.ActionButton
import com.mustafatoktas.loginui.ui.navigation.Destination
import com.mustafatoktas.loginui.ui.theme.PrimaryGreen
import com.mustafatoktas.loginui.ui.theme.PrimaryGreenDark
import com.mustafatoktas.loginui.ui.theme.PrimaryPinkDark
import com.mustafatoktas.loginui.ui.theme.PrimaryViolet
import nl.dionsegijn.konfetti.compose.KonfettiView

@Composable
fun AnasayfaScreen(
    modifier: Modifier = Modifier,
    mainNavController: NavHostController,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.run {
                    verticalGradient(
                        0f to PrimaryViolet,
                        1f to PrimaryGreen
                    )
                }
            )
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier = Modifier.weight(weight = 1f)
        )
        Greetings()
        Spacer(
            modifier = Modifier.weight(weight = 1f)
        )
        ActionButton(
            text = stringResource(R.string.press_to_restart),
            isNavigationArrowVisible = false,
            onClicked = {
                mainNavController.sayfayaGit(Destination.MainScreen)
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryGreenDark,
                contentColor = Color.White
            ),
            shadowColor = PrimaryPinkDark,
            modifier = Modifier.padding(24.dp)
        )
    }
    KonfettiView(
        modifier = Modifier.fillMaxSize(),
        parties = KonfettiUtil.gosteri()
    )
}