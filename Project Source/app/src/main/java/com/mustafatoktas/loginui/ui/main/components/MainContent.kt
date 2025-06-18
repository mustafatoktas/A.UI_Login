package com.mustafatoktas.loginui.ui.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.mustafatoktas.loginui.R
import com.mustafatoktas.loginui.common.sayfayaGit
import com.mustafatoktas.loginui.ui.general_components.ActionButton
import com.mustafatoktas.loginui.ui.navigation.Destination
import com.mustafatoktas.loginui.ui.theme.DarkTextColor
import com.mustafatoktas.loginui.ui.theme.PrimaryPinkBlended
import com.mustafatoktas.loginui.ui.theme.PrimaryYellow
import com.mustafatoktas.loginui.ui.theme.PrimaryYellowDark
import com.mustafatoktas.loginui.ui.theme.PrimaryYellowLight

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    mainNavController: NavHostController,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryPinkBlended,
                    0.6f to PrimaryYellowLight,
                    1f to PrimaryYellow
                )
            )
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = R.drawable.img_welcome,
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(top = 32.dp)
        )
        Spacer(
            modifier = Modifier.height(24.dp)
        )
        Text(
            text = stringResource(R.string.lets_start_codding),
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Black,
            modifier = Modifier.padding(horizontal = 24.dp),
            color = DarkTextColor
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            text = stringResource(R.string.create_a_beautiful_login_app),
            modifier = Modifier.padding(horizontal = 24.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = DarkTextColor
        )
        Spacer(
            modifier = Modifier.weight(weight = 1f)
        )
        ActionButton(
            text = stringResource(R.string.next),
            isNavigationArrowVisible = true,
            onClicked = {
                mainNavController.sayfayaGit(Destination.GirisScreen)
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryYellowDark,
                contentColor = DarkTextColor
            ),
            shadowColor = PrimaryYellowDark,
            modifier = Modifier.padding(24.dp)
        )
    }
}