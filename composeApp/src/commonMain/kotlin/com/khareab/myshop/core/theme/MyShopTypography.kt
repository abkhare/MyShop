package com.khareab.myshop.core.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import myshop.composeapp.generated.resources.Res
import myshop.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Immutable
data class MyShopTypography(
    // Heading Styles
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val h4: TextStyle,

    // Body Styles
    val bodyBold: TextStyle,
    val bodyRegular: TextStyle,
    val caption: TextStyle,

    // Label Styles
    val labelLarge: TextStyle,
    val labelMedium: TextStyle,
    val labelSmall: TextStyle
)

@Composable
fun getMyAppTypography(): MyShopTypography {
    val robotoFontFamily = FontFamily(
        Font(
            resource = Res.font.Roboto_Regular,
            weight = FontWeight.Normal
        ),
        Font(
            resource = Res.font.Roboto_Regular,
            weight = FontWeight.Medium
        ),
        Font(
            resource = Res.font.Roboto_Regular,
            weight = FontWeight.Bold
        )
    )
    // Heading Styles
    val h1 = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 32.sp,
        lineHeight = 48.sp,
        fontWeight = FontWeight(700)
    )

    val h2 = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight(700)
    )

    val h3 = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight(700)
    )

    val h4 = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight(700)
    )

    // Body Styles
    val bodyBold = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight(400)
    )

    val bodyRegular = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight(400)
    )

    val caption = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight(400)
    )

    // Label Styles
    val labelLarge = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.Medium
    )

    val labelMedium = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Medium
    )

    val labelSmall = TextStyle(
        fontFamily = robotoFontFamily,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Medium
    )

    return MyShopTypography(
        // Heading Styles
        h1 = h1,
        h2 = h2,
        h3 = h3,
        h4 = h4,

        // Body Styles
        bodyBold = bodyBold,
        bodyRegular = bodyRegular,
        caption = caption,

        // Label Styles
        labelLarge = labelLarge,
        labelMedium = labelMedium,
        labelSmall = labelSmall
    )
}