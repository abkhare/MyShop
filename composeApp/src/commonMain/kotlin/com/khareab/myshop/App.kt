package com.khareab.myshop

import androidx.compose.runtime.Composable
import com.abkhare.core.theme.MyShopTheme
import com.khareab.myshop.views.home.HomeNav
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MyShopTheme {
        HomeNav()
    }
}