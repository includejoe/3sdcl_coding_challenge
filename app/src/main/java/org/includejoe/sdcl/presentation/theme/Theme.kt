package org.includejoe.sdcl.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Primary,
    secondary = SecondaryFontColor,
    error = Error,
    onPrimary = White,
)

private val LightColorPalette = lightColors(
    primary = Primary,
    background = Background,
    secondary = SecondaryFontColor,
    error = Error,
    onPrimary = White,
    onBackground = PrimaryFontColor
)

@Composable
fun SdclTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}