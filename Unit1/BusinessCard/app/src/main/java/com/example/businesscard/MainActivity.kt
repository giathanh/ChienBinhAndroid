package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

//private fun BusinessCardIcon(): Icon {
//    return Icon(Icons.Rounded.Phone, "Phone")
//}

@Composable
fun BusinessCardApp() {
//    val MyAppIcon = Icons.Rounded
    Column(
        modifier = Modifier.background(Color(0, 59, 74))
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            Modifier.width(100.dp)
        )
        Text(
            text = "Gia Thanh",
            color = Color.White,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Android Developer",
            color = Color.White,
            textAlign = TextAlign.Center
        )
        InfoCard(
            Icons.Rounded.Phone,
            "070 480 7374"
        )
        InfoCard(
            Icons.Rounded.Share,
            "@giathanh"
        )
        InfoCard(
            Icons.Rounded.Email,
            "chaulaigiathanh@gmail.com"
        )
//        Row {
//            Text(text = "@giathanh")
//            Text(text = "chaulaigiathanh@gmail.com")
//        }
    }
}

@Composable
private fun InfoCard(icon: ImageVector, text: String) {
    Row(
        modifier = Modifier.padding(start = 24.dp)
    ) {
        Icon(
            icon,
            contentDescription = null,
            tint = Color.White
        )
        Text(
            text = text,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}