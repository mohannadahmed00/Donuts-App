package com.giraffe.donutsapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.giraffe.donutsapp.R
import com.giraffe.donutsapp.composable.ButtonWithIcon
import com.giraffe.donutsapp.ui.theme.Black
import com.giraffe.donutsapp.ui.theme.DonutsAppTheme
import com.giraffe.donutsapp.ui.theme.PiggyPink
import com.giraffe.donutsapp.ui.theme.Salmon
import com.giraffe.donutsapp.ui.theme.White
import com.giraffe.donutsapp.ui.theme.fontFamily

@Composable
fun DonutDetailsScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(PiggyPink)
    ) {
        Column {
            Column(
                modifier = Modifier
                    .padding(horizontal = 32.dp, vertical = 45.dp)
                    .weight(436 / 490f)
            ) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(R.drawable.arrow),
                    contentDescription = "arrow"
                )
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(R.drawable.chocolate_donut),
                    contentDescription = "donut",
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(
                        White,
                        shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                    )
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 40.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Strawberry Wheel",
                            style = TextStyle(
                                fontSize = 30.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Salmon,
                                fontFamily = fontFamily
                            )
                        )
                        ButtonWithIcon(
                            modifier = Modifier
                                .offset(y = (-(35 + 25)).dp)
                                .shadow(
                                    15.dp,
                                    clip = false,
                                    shape = RoundedCornerShape(15.dp),
                                    spotColor = Black.copy(.2f)
                                ),
                            iconRes = R.drawable.like,
                            backgroundColor = White
                        )
                    }
                    Text(
                        modifier = Modifier.padding(top = 24.dp),
                        text = "About Gonut",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            color = Black.copy(alpha = .8f),
                            fontFamily = fontFamily
                        )
                    )
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Black.copy(alpha = .6f),
                            fontFamily = fontFamily
                        )
                    )
                    Text(
                        modifier = Modifier.padding(top = 24.dp, bottom = 16.dp),
                        text = "Quantity",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            color = Black.copy(alpha = .8f),
                            fontFamily = fontFamily
                        )
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        ButtonWithIcon(
                            modifier = Modifier
                                .shadow(
                                    15.dp,
                                    clip = false,
                                    shape = RoundedCornerShape(15.dp),
                                    spotColor = Black.copy(.2f)
                                ),
                            iconRes = R.drawable.minus,
                            tintColor = Black,
                            backgroundColor = White
                        )
                        Box(
                            modifier = Modifier
                                .size(45.dp)
                                .shadow(
                                    15.dp,
                                    clip = false,
                                    shape = RoundedCornerShape(15.dp),
                                    spotColor = Black.copy(.2f)
                                )
                                .background(White, shape = RoundedCornerShape(15.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "1",
                                style = TextStyle(
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Black,
                                    textAlign = TextAlign.Center,
                                    fontFamily = fontFamily
                                )
                            )
                        }

                        ButtonWithIcon(
                            modifier = Modifier
                                .shadow(
                                    15.dp,
                                    clip = false,
                                    shape = RoundedCornerShape(15.dp),
                                    spotColor = Black.copy(.2f)
                                ),
                            iconRes = R.drawable.plus,
                            tintColor = White,
                            backgroundColor = Black
                        )
                    }

                    Row(
                        modifier = Modifier.padding(top = 37.dp, bottom = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(26.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "£16",
                            style = TextStyle(
                                fontSize = 30.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Black,
                                fontFamily = fontFamily
                            )
                        )
                        Button(
                            modifier = Modifier.weight(1f),
                            colors = ButtonDefaults.buttonColors().copy(
                                containerColor = Salmon,
                                contentColor = White
                            ),
                            contentPadding = PaddingValues(vertical = 20.dp, horizontal = 60.dp),
                            onClick = {}) {
                            Text(
                                text = "Add to Cart",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = White,
                                    fontFamily = fontFamily
                                )
                            )
                        }
                    }
                }
            }
        }
    }

}

@Preview
@Composable
fun DonutDetailsScreenPreview() {
    DonutsAppTheme {
        DonutDetailsScreen()
    }
}