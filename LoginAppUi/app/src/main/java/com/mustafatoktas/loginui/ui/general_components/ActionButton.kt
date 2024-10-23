package com.mustafatoktas.loginui.ui.general_components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustafatoktas.loginui.ui.theme.LoginUITheme
import com.mustafatoktas.loginui.ui.theme.PrimaryPink

@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
    text: String,
    isNavigationArrowVisible: Boolean,
    onClicked: () -> Unit,
    colors: ButtonColors,
    shadowColor: Color
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(62.dp)
            .shadow(
                elevation = 24.dp,
                shape = RoundedCornerShape(percent = 50),
                spotColor = shadowColor
            ),
        onClick = onClicked,
        colors = colors
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )
            if (isNavigationArrowVisible) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun ActionButtonPreview_NavigationVisible() {
    LoginUITheme {
        ActionButton(
            text = "Action text",
            isNavigationArrowVisible = true,
            onClicked = {},
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = PrimaryPink
            ),
            shadowColor = PrimaryPink
        )
    }
}

@Preview
@Composable
private fun ActionButtonPreview() {
    LoginUITheme {
        ActionButton(
            text = "Action text",
            isNavigationArrowVisible = false,
            onClicked = {},
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = PrimaryPink
            ),
            shadowColor = PrimaryPink
        )
    }
}