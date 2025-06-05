package com.giraffe.donutsapp.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.giraffe.donutsapp.R
import com.giraffe.donutsapp.screen.Offer
import com.giraffe.donutsapp.ui.theme.Black
import com.giraffe.donutsapp.ui.theme.DonutsAppTheme
import com.giraffe.donutsapp.ui.theme.White
import com.giraffe.donutsapp.ui.theme.fontFamily

@Composable
fun OfferCard(
    modifier: Modifier = Modifier,
    offer: Offer = Offer(),
) {
    Box {
        Box(
            modifier = modifier
                .padding(end = 64.dp)
                .width(193.dp)
                .shadow(
                    15.dp,
                    shape = RoundedCornerShape(20.dp), spotColor = Black.copy(.2f),
                    clip = false
                )
                .background(offer.backgroundColor, RoundedCornerShape(20.dp))
        ) {
            Column(
                modifier = Modifier

                    .padding(horizontal = 20.dp, vertical = 17.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(35.dp)
                        .background(White, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier.padding(8.dp),
                        painter = painterResource(R.drawable.like),
                        contentDescription = "like"
                    )
                }
                Image(
                    modifier = Modifier
                        .padding(bottom = 17.dp)
                        //.size(137.dp)
                        .aspectRatio(1f)
                        .offset(84.dp),
                    painter = painterResource(offer.donutImgRes),
                    contentDescription = "donut",
                    contentScale = ContentScale.Crop
                )
                Text(
                    modifier = Modifier.padding(bottom = 9.dp),
                    text = offer.name,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Black,
                        fontFamily = fontFamily
                    )
                )
                Text(
                    modifier = Modifier.padding(bottom = 5.dp),
                    text = offer.description,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Black.copy(alpha = .6f),
                        fontFamily = fontFamily
                    )
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        modifier = Modifier.padding(end = 5.dp),
                        text = "$${offer.oldPrice}",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Black.copy(alpha = .6f),
                            fontFamily = fontFamily,
                            textDecoration = TextDecoration.LineThrough
                        )
                    )
                    Text(
                        text = "$${offer.price}",
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Black,
                            fontFamily = fontFamily
                        )
                    )

                }
            }
        }
    }
}

@Preview
@Composable
fun OfferCardPreview() {
    DonutsAppTheme {
        OfferCard()
    }
}