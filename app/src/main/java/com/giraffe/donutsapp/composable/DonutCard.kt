package com.giraffe.donutsapp.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.giraffe.donutsapp.screen.Donut
import com.giraffe.donutsapp.ui.theme.Black
import com.giraffe.donutsapp.ui.theme.DonutsAppTheme
import com.giraffe.donutsapp.ui.theme.Salmon
import com.giraffe.donutsapp.ui.theme.White
import com.giraffe.donutsapp.ui.theme.fontFamily

@Composable
fun DonutCard(
    modifier: Modifier = Modifier,
    donut: Donut = Donut()
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .padding(top = 56.dp)
                .shadow(
                    15.dp,
                    clip = false,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    ), spotColor = Black.copy(.2f)
                )
                .background(
                    White,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    )
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                modifier = Modifier.padding(start = 9.dp, end = 9.dp, top = 47.dp, bottom = 10.dp),
                text = donut.name,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Black.copy(alpha = .6f),
                    fontFamily = fontFamily
                )
            )
            Text(
                modifier = Modifier.padding(bottom = 20.dp),
                text = "$${donut.price}",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Salmon,
                    fontFamily = fontFamily
                )
            )


        }
        Image(
            modifier = Modifier
                .width(104.dp)
                .height(112.dp),
            painter = painterResource(donut.donutImgRes),
            contentDescription = "donut"
        )
    }
}

@Preview
@Composable
fun DonutCardPreview() {
    DonutsAppTheme {
        DonutCard()
    }
}