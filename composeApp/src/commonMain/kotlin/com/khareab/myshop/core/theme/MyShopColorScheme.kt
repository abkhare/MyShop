package com.khareab.myshop.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class MyShopColorScheme(
    // Primary Colors
    val primary: Color,
    val primaryHover: Color,
    val primaryActive: Color,
    val primaryDisabled: Color,
    val primarySubtle: Color,
    val primaryStrong: Color,

    // Secondary Colors
    val secondary: Color,
    val secondaryHover: Color,
    val secondaryActive: Color,
    val secondaryDisabled: Color,
    val secondarySubtle: Color,
    val secondaryStrong: Color,

    // Success Colors
    val success: Color,
    val successHover: Color,
    val successActive: Color,
    val successDisabled: Color,

    // Information Colors
    val info: Color,
    val infoHover: Color,
    val infoActive: Color,
    val infoDisabled: Color,

    // Warning Colors
    val warning: Color,
    val warningHover: Color,
    val warningActive: Color,
    val warningDisabled: Color,

    // Danger Colors
    val danger: Color,
    val dangerHover: Color,
    val dangerActive: Color,
    val dangerDisabled: Color,

    // Text Colors
    val textTitle: Color,
    val textBody: Color,
    val textBodySubtle: Color,
    val textCaption: Color,

    // Background Colors
    val background1: Color,
    val background2: Color,
    val background3: Color,

    // Stroke Colors
    val stroke1: Color,
    val stroke2: Color,
    val stroke3: Color
) {
    companion object {
        val light = MyShopColorScheme(
            // Primary Colors
            primary = lightPrimary,
            primaryHover = lightPrimaryHover,
            primaryActive = lightPrimaryActive,
            primaryDisabled = lightPrimaryDisabled,
            primarySubtle = lightPrimarySubtle,
            primaryStrong = lightPrimaryStrong,

            // Secondary Colors
            secondary = lightSecondary,
            secondaryHover = lightSecondaryHover,
            secondaryActive = lightSecondaryActive,
            secondaryDisabled = lightSecondaryDisabled,
            secondarySubtle = lightSecondarySubtle,
            secondaryStrong = lightSecondaryStrong,

            // Success Colors
            success = lightSuccess,
            successHover = lightSuccessHover,
            successActive = lightSuccessActive,
            successDisabled = lightSuccessDisabled,

            // Information Colors
            info = lightInfo,
            infoHover = lightInfoHover,
            infoActive = lightInfoActive,
            infoDisabled = lightInfoDisabled,

            // Warning Colors
            warning = lightWarning,
            warningHover = lightWarningHover,
            warningActive = lightWarningActive,
            warningDisabled = lightWarningDisabled,

            // Danger Colors
            danger = lightDanger,
            dangerHover = lightDangerHover,
            dangerActive = lightDangerActive,
            dangerDisabled = lightDangerDisabled,

            // Text Colors
            textTitle = lightTextTitle,
            textBody = lightTextBody,
            textBodySubtle = lightTextBodySubtle,
            textCaption = lightTextCaption,

            // Background Colors
            background1 = lightBackground1,
            background2 = lightBackground2,
            background3 = lightBackground3,

            // Stroke Colors
            stroke1 = lightStroke1,
            stroke2 = lightStroke2,
            stroke3 = lightStroke3
        )

        val dark = MyShopColorScheme(
            // Primary Colors
            primary = darkPrimary,
            primaryHover = darkPrimaryHover,
            primaryActive = darkPrimaryActive,
            primaryDisabled = darkPrimaryDisabled,
            primarySubtle = darkPrimarySubtle,
            primaryStrong = darkPrimaryStrong,

            // Secondary Colors
            secondary = darkSecondary,
            secondaryHover = darkSecondaryHover,
            secondaryActive = darkSecondaryActive,
            secondaryDisabled = darkSecondaryDisabled,
            secondarySubtle = darkSecondarySubtle,
            secondaryStrong = darkSecondaryStrong,

            // Success Colors
            success = darkSuccess,
            successHover = darkSuccessHover,
            successActive = darkSuccessActive,
            successDisabled = darkSuccessDisabled,

            // Information Colors
            info = darkInfo,
            infoHover = darkInfoHover,
            infoActive = darkInfoActive,
            infoDisabled = darkInfoDisabled,

            // Warning Colors
            warning = darkWarning,
            warningHover = darkWarningHover,
            warningActive = darkWarningActive,
            warningDisabled = darkWarningDisabled,

            // Danger Colors
            danger = darkDanger,
            dangerHover = darkDangerHover,
            dangerActive = darkDangerActive,
            dangerDisabled = darkDangerDisabled,

            // Text Colors
            textTitle = darkTextTitle,
            textBody = darkTextBody,
            textBodySubtle = darkTextBodySubtle,
            textCaption = darkTextCaption,

            // Background Colors
            background1 = darkBackground1,
            background2 = darkBackground2,
            background3 = darkBackground3,

            // Stroke Colors
            stroke1 = darkStroke1,
            stroke2 = darkStroke2,
            stroke3 = darkStroke3
        )
    }
} 