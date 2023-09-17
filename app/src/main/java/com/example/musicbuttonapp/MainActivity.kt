package com.example.musicbuttonapp

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicbuttonapp.ui.theme.MusicButtonAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicButtonAppTheme {
//                // A surface container using the 'background' color from the theme
PlayAudio23(context = this)
//                myApp(context = this)
////                myreview(context = this)
//                sampletry(context = this)

            }
        }
    }
}



@Composable
fun playAudio(context: Context){
    val mediaAudio:MediaPlayer = MediaPlayer.create(context,R.raw.vellakesong)
    val mediaAudio2:MediaPlayer = MediaPlayer.create(context,R.raw.afterhours)
    val mediaAudio3:MediaPlayer = MediaPlayer.create(context,R.raw.iwasthere)
    val mediaAudio4:MediaPlayer = MediaPlayer.create(context,R.raw.orenduprema)
    val mediaAudio5:MediaPlayer = MediaPlayer.create(context,R.raw.starboy)
    Column(
        modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       Column {

            Button(onClick = {mediaAudio.start() },modifier= Modifier.size(90.dp)) {
                Text(text = "CLick me1")
            }
            Button(onClick = {mediaAudio3.start() },modifier= Modifier.size(90.dp)) {
                Text(text = "CLick me2")
            }
            Button(onClick = {mediaAudio2.start() },modifier= Modifier.size(90.dp)) {
                Text(text = "CLick me3")
            }
            Button(onClick = {mediaAudio4.start() },modifier= Modifier.size(90.dp)) {
                Text(text = "CLick me4")
            }
            Button(onClick = {mediaAudio5.start() },modifier= Modifier.size(90.dp)) {
                Text(text = "CLick me5")
            }

        }
    }
}


