package com.giraffe.donutsapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.giraffe.donutsapp.R
import com.giraffe.donutsapp.ui.theme.Black
import com.giraffe.donutsapp.ui.theme.DonutsAppTheme
import com.giraffe.donutsapp.ui.theme.LightSalmon
import com.giraffe.donutsapp.ui.theme.PiggyPink
import com.giraffe.donutsapp.ui.theme.Salmon
import com.giraffe.donutsapp.ui.theme.White
import com.giraffe.donutsapp.ui.theme.fontFamily

@Composable
fun OnBoardScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(PiggyPink)
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.donuts),
            contentDescription = "donuts",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(horizontal = 40.dp, vertical = 46.dp)
                .align(Alignment.BottomCenter)
        ) {
            Text(
                modifier = Modifier.padding(bottom = 19.dp),
                text = "Gonuts\nwith\nDonuts",
                style = TextStyle(
                    fontSize = 54.sp,
                    fontWeight = FontWeight.Bold,
                    color = Salmon,
                    fontFamily = fontFamily
                )
            )
            Text(
                modifier = Modifier.padding(bottom = 60.dp),
                text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = LightSalmon,
                    fontFamily = fontFamily
                )
            )
            Button(
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors().copy(
                    containerColor = White,
                    contentColor = Black
                ),
                contentPadding = PaddingValues(vertical = 22.dp, horizontal = 90.dp),
                onClick = {}) {
                Text(
                    text = "Get Started",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Black,
                        fontFamily = fontFamily
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 428, heightDp = 926)
@Composable
fun OnBoardScreenPreview() {
    DonutsAppTheme {
        OnBoardScreen()
    }
}