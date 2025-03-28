package com.khareab.myshop.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.dp

@Immutable
data class MyShopDimensions(
    // Define different corner radius sizes
    // Corner Radius
    val radiusSmall: CornerRadius,
    val radiusMedium: CornerRadius,
    val radiusLarge: CornerRadius,
    val radiusExtraLarge: CornerRadius,
    val radiusRound: CornerRadius,

    // Stroke Width
    val strokeThin: StrokeWidth,
    val strokeRegular: StrokeWidth,
    val strokeThick: StrokeWidth
) {
    // Define default values for dimensions
    companion object {
        val myShopDimensions = MyShopDimensions(
            // Corner Radius
            radiusSmall = CornerRadius(2.dp),
            radiusMedium = CornerRadius(4.dp),
            radiusLarge = CornerRadius(8.dp),
            radiusExtraLarge = CornerRadius(16.dp),
            radiusRound = CornerRadius(999.dp),

            // Stroke Width
            strokeThin = StrokeWidth(1.dp),
            strokeRegular = StrokeWidth(2.dp),
            strokeThick = StrokeWidth(3.dp)
        )
    }
}

// Define data class for corner radius with a Dp value
@Immutable
data class CornerRadius(
    val value: androidx.compose.ui.unit.Dp
)

// Define data class for stroke width with a Dp value
@Immutable
data class StrokeWidth(
    val value: androidx.compose.ui.unit.Dp
) 