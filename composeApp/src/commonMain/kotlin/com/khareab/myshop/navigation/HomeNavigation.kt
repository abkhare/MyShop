package com.khareab.myshop.navigation

import kotlinx.serialization.Serializable
import myshop.core.generated.resources.Res
import myshop.core.generated.resources.cart_selected
import myshop.core.generated.resources.cart_unselected
import myshop.core.generated.resources.home_selected
import myshop.core.generated.resources.home_unselected
import myshop.core.generated.resources.title_home_tab
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource


sealed class HomeNavigation {
    @Serializable
    data object Home : HomeNavigation()
    @Serializable
    data object Cart : HomeNavigation()
}

sealed class HomeBottomNavigation(
    val route: String,
    val title: StringResource,
    val selectedIcon: DrawableResource,
    val unselectedIcon: DrawableResource
) {
    data object Home : HomeBottomNavigation(
        route = HomeNavigation.Home.toString(),
        title = Res.string.title_home_tab,
        selectedIcon = Res.drawable.home_selected,
        unselectedIcon = Res.drawable.home_unselected
    )

    data object Cart : HomeBottomNavigation(
        route = HomeNavigation.Cart.toString(),
        title = Res.string.title_home_tab,
        selectedIcon = Res.drawable.cart_selected,
        unselectedIcon = Res.drawable.cart_unselected
    )
}
