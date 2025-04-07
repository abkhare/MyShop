package com.khareab.myshop.views.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.abkhare.core.theme.DefaultCardColorsTheme
import com.abkhare.core.theme.DefaultNavigationBarItemTheme
import com.abkhare.core.theme.LocalMyShopColors
import com.khareab.myshop.navigation.HomeBottomNavigation
import com.khareab.myshop.navigation.HomeNavigation
import com.khareab.myshop.views.ProductDetailsScreen
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun HomeNav() {
    val navigator = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationUI(navigator) }
    ) {
        NavHost(
            navController = navigator,
            startDestination = HomeNavigation.Home
        ) {
            composable<HomeNavigation.Home> {
                ProductDetailsScreen({}, {}, {})
            }
        }
    }
}

@Composable
fun BottomNavigationUI(
    navController: NavController
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Card(
        colors = DefaultCardColorsTheme(),
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(10.dp),
        shape = RoundedCornerShape(
            topStart = 16.dp,
            topEnd = 16.dp
        )
    ) {
        NavigationBar(
            containerColor = LocalMyShopColors.current.background1,
            contentColor = LocalMyShopColors.current.background2,
            tonalElevation = 8.dp
        ) {

            val items = listOf(
                HomeBottomNavigation.Home,
                HomeBottomNavigation.Cart
            )
            items.forEach {
                NavigationBarItem(
                    label = { Text(text = stringResource(it.title)) },
                    colors = DefaultNavigationBarItemTheme(),
                    selected = it.route == currentRoute,
                    icon = {
                        Icon(
                            painter = painterResource(if (it.route == currentRoute) it.selectedIcon else it.unselectedIcon),
                            contentDescription = stringResource(it.title)
                        )
                    },
                    onClick = {
                        if (currentRoute != it.route) {
                            navController.navigate(it.route) {
                                navController.graph.startDestinationRoute?.let { route ->
                                    popUpTo(route) {
                                        saveState = true
                                    }
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    })
            }
        }
    }
}