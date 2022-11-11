package net.pirrisdev.movinfo.ui.view.Main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.pirrisdev.movinfo.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            View()
        }
    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_2_XL
)
@Composable
fun View() {
    Column(modifier = Modifier.fillMaxSize()) {
        MovieItem()
    }
}

@Composable
fun MovieItem() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(150.dp)
            .height(200.dp)
    ) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .weight(1f)
                .background(color = Color.Red)
        ) {
            Image(
                painter = painterResource(id = R.drawable.app_icon),
                contentDescription = "Item Photo",
                alignment = Alignment.Center,
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize()
            )
            Image(
                painter = painterResource(id = R.drawable.play_circle),
                contentDescription = "Item Play Button",
                alignment = Alignment.Center,
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(64.dp)
            )
        }
        Text(
            text = "Title 9",
            fontSize = 26.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .clickable { /*TODO*/ }
        )
    }
}
