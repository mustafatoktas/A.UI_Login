package com.mustafatoktas.loginui.ui.uye_ol

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.mustafatoktas.loginui.R
import com.mustafatoktas.loginui.common.sayfayaGit
import com.mustafatoktas.loginui.ui.general_components.AuthenticationScreenTemplate
import com.mustafatoktas.loginui.ui.navigation.Destination
import com.mustafatoktas.loginui.ui.theme.PrimaryViolet
import com.mustafatoktas.loginui.ui.theme.PrimaryVioletDark
import com.mustafatoktas.loginui.ui.theme.PrimaryVioletLight

@Composable
fun UyeOlScreen(
    modifier: Modifier = Modifier,
    mainNavController: NavHostController,
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to PrimaryViolet,
            1f to PrimaryVioletDark
        ),
        imgRes = R.drawable.img_coder_w,
        title = "Hi there!",
        subtitle = "Let's Get Started",
        mainActionButtonTitle = "Create an Account",
        secondaryActionButtonTitle = "Log In",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryVioletDark,
            contentColor = Color.White
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryVioletLight,
            contentColor = Color.White
        ),
        actionButtonShadow = PrimaryVioletDark,
        onMainActionButtonClicked = {
            mainNavController.sayfayaGit(Destination.AnasayfaScreen)
        },
        onSecondaryActionButtonClicked = {
            mainNavController.sayfayaGit(Destination.GirisScreen)
        },
    )
}