package com.mustafatoktas.loginui.ui.giris

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.mustafatoktas.loginui.R
import com.mustafatoktas.loginui.common.sayfayaGit
import com.mustafatoktas.loginui.ui.general_components.AuthenticationScreenTemplate
import com.mustafatoktas.loginui.ui.navigation.Destination
import com.mustafatoktas.loginui.ui.theme.PrimaryPink
import com.mustafatoktas.loginui.ui.theme.PrimaryPinkBlended
import com.mustafatoktas.loginui.ui.theme.PrimaryPinkDark
import com.mustafatoktas.loginui.ui.theme.PrimaryPinkLight

@Composable
fun GirisScreen(
    modifier: Modifier = Modifier,
    mainNavController: NavHostController,
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to PrimaryPinkBlended,
            1f to PrimaryPink
        ),
        imgRes = R.drawable.img_coder_m,
        title = stringResource(R.string.welcome_back),
        subtitle = stringResource(R.string.please_log_in),
        mainActionButtonTitle = stringResource(R.string.ccontinue),
        secondaryActionButtonTitle = stringResource(R.string.create_an_account),
        mainActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkDark,
            contentColor = Color.White
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkLight,
            contentColor = Color.White
        ),
        actionButtonShadow = PrimaryPinkDark,
        onMainActionButtonClicked = {
            mainNavController.sayfayaGit(Destination.AnasayfaScreen)
        },
        onSecondaryActionButtonClicked = {
            mainNavController.sayfayaGit(Destination.UyeOlScreen)
        },
    )
}