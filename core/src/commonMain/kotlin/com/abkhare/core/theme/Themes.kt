package com.abkhare.core.theme

import androidx.compose.material3.CardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable


@Composable
fun DefaultCardColorsTheme() = CardColors(
    containerColor = LocalMyShopColors.current.background1,
    contentColor = LocalMyShopColors.current.background2,
    disabledContainerColor = LocalMyShopColors.current.background1,
    disabledContentColor = LocalMyShopColors.current.background2,
)


@Composable
fun DefaultNavigationBarItemTheme() = NavigationBarItemDefaults.colors(
    selectedIconColor = LocalMyShopColors.current.primary,
    unselectedIconColor = LocalMyShopColors.current.primaryDisabled,
    unselectedTextColor = LocalMyShopColors.current.textBodySubtle,
    selectedTextColor = LocalMyShopColors.current.textBody,
    indicatorColor = LocalMyShopColors.current.textCaption,
)