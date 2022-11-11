package net.pirrisdev.movinfo.ui.view.Main.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = DarkBlueDefault,
    primaryVariant = DarkBlueVariantDefault,
    secondary = DarkYellowDefault,
    background = DarkBlueBackground,
    surface = DarkYellowDefault,
)

private val LightColorPalette = lightColors(
    primary = LightBlueDefault,
    primaryVariant = LightBlueVariantDefault,
    secondary = LightGreenDefault,
    background = LightWhiteBackground,
    surface = LightWhiteBackground,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MovinfoTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
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