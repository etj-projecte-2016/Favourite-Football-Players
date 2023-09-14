package com.example.favouritefootballplayers.usecases.launch

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.favouritefootballplayers.R
import com.example.favouritefootballplayers.ui.theme.FavouriteFootballPlayersTheme
import java.time.format.TextStyle

class LaunchActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            FavouriteFootballPlayersTheme() {

                MyComponent()

            }

        }
    }
}

@Composable
fun MyTexts(){

    Column(modifier = Modifier.padding(start = 8.dp)) {
        MyText(text = "hola que tal estas", MaterialTheme.colorScheme.secondary, MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))
        MyText(text = "sfdsdfs", MaterialTheme.colorScheme.onBackground, MaterialTheme.typography.titleSmall)

    }

}

@Composable
fun MyText(text: String, color: Color, style: androidx.compose.ui.text.TextStyle){
    
    Text(text = text, color = color, style = style)

}

@Composable
fun MyImage(){

    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Imagen de test", modifier = Modifier
            .clip(
                CircleShape
            )
            .size(64.dp)
            .background(MaterialTheme.colorScheme.primary))

}

@Composable
fun MyComponent(){

    Row(modifier = Modifier.background(MaterialTheme.colorScheme.background).padding(8.dp)) {

        MyImage()
        MyTexts()

    }

}
@Preview()
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewComponent(){
    MyComponent()
}
