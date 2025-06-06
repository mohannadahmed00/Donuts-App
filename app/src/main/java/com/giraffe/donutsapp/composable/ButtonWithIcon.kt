package com.giraffe.donutsapp.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.donutsapp.R
import com.giraffe.donutsapp.ui.theme.DonutsAppTheme
import com.giraffe.donutsapp.ui.theme.PiggyPink
import com.giraffe.donutsapp.ui.theme.Salmon

@Composable
fun ButtonWithIcon(
    modifier: Modifier = Modifier,
    iconRes: Int = R.drawable.search,
    tintColor: Color = Salmon,
    backgroundColor: Color = PiggyPink,
) {
    Box(
        modifier = modifier
            .size(45.dp)
            .background(backgroundColor, shape = RoundedCornerShape(15.dp)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.size(24.dp),
            painter = painterResource(iconRes),
            contentDescription = "icon",
            colorFilter = ColorFilter.tint(tintColor)
        )
    }
}

@Preview
@Composable
fun ButtonWithIconPreview() {
    DonutsAppTheme {
        ButtonWithIcon()
    }
}