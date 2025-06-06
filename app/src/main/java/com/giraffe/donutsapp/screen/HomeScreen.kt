package com.giraffe.donutsapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.giraffe.donutsapp.R
import com.giraffe.donutsapp.composable.ButtonWithIcon
import com.giraffe.donutsapp.composable.DonutCard
import com.giraffe.donutsapp.composable.OfferCard
import com.giraffe.donutsapp.ui.theme.Black
import com.giraffe.donutsapp.ui.theme.DonutsAppTheme
import com.giraffe.donutsapp.ui.theme.Salmon
import com.giraffe.donutsapp.ui.theme.White
import com.giraffe.donutsapp.ui.theme.fontFamily

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(White),
    ) {
        Row(
            modifier = Modifier
                .padding(start = 35.dp, end = 35.dp, top = 38.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Column {
                Text(
                    modifier = Modifier.padding(bottom = 3.dp),
                    text = "Let’s Gonuts!",
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Salmon,
                        fontFamily = fontFamily
                    )
                )
                Text(
                    text = "Order your favourite donuts from here",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = Black.copy(alpha = .6f),
                        fontFamily = fontFamily
                    )
                )
            }
            ButtonWithIcon(modifier = Modifier.padding(top = 3.dp))
        }
        Text(
            modifier = Modifier.padding(start = 35.dp, top = 44.dp),
            text = "Today Offers",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Black,
                fontFamily = fontFamily
            )
        )
        LazyRow(
            modifier = Modifier
                .padding(top = 19.dp)
                .height(325.dp),
            contentPadding = PaddingValues(horizontal = 35.dp)
        ) {
            items(offers) {
                OfferCard(offer = it)
            }
        }
        Text(
            modifier = Modifier.padding(start = 35.dp, top = 32.dp),
            text = "Donuts",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Black,
                fontFamily = fontFamily
            )
        )
        LazyRow(
            modifier = Modifier.padding(top = 8.dp),
            contentPadding = PaddingValues(horizontal = 35.dp),
            horizontalArrangement = Arrangement.spacedBy(21.dp)
        ) {
            items(donuts) {
                DonutCard(donut = it)
            }
        }
        Row(
            modifier = Modifier
                .padding(vertical = 35.dp, horizontal = 40.dp)
                .height(35.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = Modifier.size(35.dp),
                painter = painterResource(R.drawable.home),
                contentDescription = null
            )
            Image(
                modifier = Modifier.size(35.dp),
                painter = painterResource(R.drawable.heart),
                contentDescription = null
            )
            Image(
                modifier = Modifier.size(35.dp),
                painter = painterResource(R.drawable.notification),
                contentDescription = null
            )
            Image(
                modifier = Modifier.size(35.dp),
                painter = painterResource(R.drawable.cart),
                contentDescription = null
            )
            Image(
                modifier = Modifier.size(35.dp),
                painter = painterResource(R.drawable.profile),
                contentDescription = null
            )
        }
    }
}

@Preview(widthDp = 428, heightDp = 926)
@Composable
fun HomeScreenPreview() {
    DonutsAppTheme {
        HomeScreen()
    }
}

data class Offer(
    val donutImgRes: Int = R.drawable.chocolate_donut,
    val name: String = "Chocolate Glaze",
    val description: String = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
    val price: Int = 16,
    val oldPrice: Int = 20,
    val backgroundColor: Color = Color(0xffFFC7D0)
)

val offers = listOf(
    Offer(
        name = "Strawberry Wheel",
        description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
        backgroundColor = Color(0xffD7E4F6)
    ),
    Offer(),
    Offer(
        name = "Strawberry Wheel",
        description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
        backgroundColor = Color(0xffD7E4F6)
    ),
    Offer(),
    Offer(
        name = "Strawberry Wheel",
        description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
        backgroundColor = Color(0xffD7E4F6)
    ),
    Offer(),
)

data class Donut(
    val donutImgRes: Int = R.drawable.chocolate_cherry_donut,
    val name: String = "Chocolate Cherry",
    val price: Int = 22,
)

val donuts = listOf(
    Donut(),
    Donut(),
    Donut(),
    Donut(),
    Donut(),
)