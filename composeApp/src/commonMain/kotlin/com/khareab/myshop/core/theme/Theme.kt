package com.khareab.myshop.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

val LocalMyShopColors = staticCompositionLocalOf<MyShopColorScheme> {
    error("No CustomColorScheme provided")
}

val LocalMyShopTypography = staticCompositionLocalOf<MyShopTypography> {
    error("No CustomTypography provided")
}

val LocalMyShopDimensions = staticCompositionLocalOf<MyShopDimensions> {
    error("No CustomDimensions provided")
}

@Composable
fun MyShopTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val customColors = if (!useDarkTheme) {
        MyShopColorScheme.light
    } else {
        MyShopColorScheme.dark
    }

    CompositionLocalProvider(
        LocalMyShopColors provides customColors,
        LocalMyShopTypography provides getMyAppTypography(),
        LocalMyShopDimensions provides MyShopDimensions.myShopDimensions
    ) {
        content()
    }
} 