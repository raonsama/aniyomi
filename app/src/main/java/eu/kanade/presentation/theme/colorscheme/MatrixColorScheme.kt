package eu.kanade.presentation.theme.colorscheme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

/**
 * Colors for Matrix theme
 * Original color scheme by LuftVerbot
 * M3 colors generated by Material Theme Builder (https://goo.gle/material-theme-builder-web)
 *
 * Key colors:
 * Primary 0xFFF38020
 * Secondary 0xFFF38020
 * Tertiary 0xFF1B1B22
 * Neutral 0xFF655C5A
 */
internal object MatrixColorScheme : BaseColorScheme() {

    override val darkScheme = darkColorScheme(
        primary = Color(0xFF00FF00),
        onPrimary = Color(0xFFFAFAFA),
        primaryContainer = Color(0xFF00FF00),
        onPrimaryContainer = Color(0xFFFAFAFA),
        secondary = Color(0xFF00FF00),
        onSecondary = Color(0xFFFAFAFA),
        secondaryContainer = Color(0xFF00FF00),
        onSecondaryContainer = Color(0xFFFAFAFA),
        tertiary = Color(0xFFFFFFFF),
        onTertiary = Color(0xFF00FF00),
        tertiaryContainer = Color(0xFFFFFFFF),
        onTertiaryContainer = Color(0xFF00FF00),
        background = Color(0xFF111111),
        onBackground = Color(0xFFFFFFFF),
        surface = Color(0xFF111111),
        onSurface = Color(0xFFFFFFFF),
        surfaceVariant = Color(0xFF212121),
        onSurfaceVariant = Color(0xFFD8FFFFFF),
        surfaceTint = Color(0xFF00FF00),
        inverseSurface = Color(0xFFFAFAFA),
        inverseOnSurface = Color(0xFF313131),
        outline = Color(0xFF00FF00),
        inversePrimary = Color(0xFF007700),
    )

    override val lightScheme = lightColorScheme(
        primary = Color(0xFF00FF00),
        onPrimary = Color(0xFF000000),
        primaryContainer = Color(0xFF00FF00),
        onPrimaryContainer = Color(0xFF000000),
        secondary = Color(0xFF00FF00),
        onSecondary = Color(0xFF000000),
        secondaryContainer = Color(0xFF00FF00),
        onSecondaryContainer = Color(0xFF000000),
        tertiary = Color(0xFF000000),
        onTertiary = Color(0xFF00FF00),
        tertiaryContainer = Color(0xFF000000),
        onTertiaryContainer = Color(0xFF00FF00),
        background = Color(0xFF000000),
        onBackground = Color(0xFFFFFFFF),
        surface = Color(0xFF000000),
        onSurface = Color(0xFFFFFFFF),
        surfaceVariant = Color(0xFF111111),
        onSurfaceVariant = Color(0xFFD849454E),
        surfaceTint = Color(0xFF00FF00),
        inverseSurface = Color(0xFF424242),
        inverseOnSurface = Color(0xFFFAFAFA),
        outline = Color(0xFF00FF00),
        inversePrimary = Color(0xFF007700),
    )
}