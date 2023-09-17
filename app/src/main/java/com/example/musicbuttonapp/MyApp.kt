package com.example.musicbuttonapp

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun myApp(context:Context){
    val mediaAudio: MediaPlayer = MediaPlayer.create(context,R.raw.vellakesong)
    val mediaAudio2: MediaPlayer = MediaPlayer.create(context,R.raw.afterhours)
    val mediaAudio3: MediaPlayer = MediaPlayer.create(context,R.raw.iwasthere)
    val mediaAudio4: MediaPlayer = MediaPlayer.create(context,R.raw.orenduprema)
    val mediaAudio5: MediaPlayer = MediaPlayer.create(context,R.raw.starboy)
LazyVerticalGrid(columns = GridCells.Fixed(4),
    content = {
        items(32){
          Box(modifier = Modifier
              .padding(9.dp)
              .aspectRatio(1f)
              .clip(RoundedCornerShape(5.dp))
              .background(Color.Green),
              contentAlignment = Alignment.Center){
              Button(onClick = { mediaAudio2.pause()}) {
Text(text = "mp3")
              }
              Button(onClick = { mediaAudio3.start()}) {
Text(text = "mp4")
              }
              Button(onClick = { mediaAudio5.start()}) {
Text(text = "mp3")
              }
          }
        }
    })
}


data class media1(
    val context: Context,
    val mediaPlayer: MediaPlayer,
    val mediaAudio: MediaPlayer = MediaPlayer.create(context,R.raw.vellakesong),
    val mediaAudio2: MediaPlayer = MediaPlayer.create(context,R.raw.afterhours),
    val mediaAudio3: MediaPlayer = MediaPlayer.create(context,R.raw.iwasthere),
    val mediaAudio4: MediaPlayer = MediaPlayer.create(context,R.raw.orenduprema),
    val mediaAudio5: MediaPlayer = MediaPlayer.create(context,R.raw.starboy)

)



@Composable
fun myreview(context: Context){
    val mediaAudio: MediaPlayer = MediaPlayer.create(context,R.raw.vellakesong)
    val mediaAudio2: MediaPlayer = MediaPlayer.create(context,R.raw.afterhours)
    val mediaAudio3: MediaPlayer = MediaPlayer.create(context,R.raw.iwasthere)
    val mediaAudio4: MediaPlayer = MediaPlayer.create(context,R.raw.orenduprema)
    val mediaAudio5: MediaPlayer = MediaPlayer.create(context,R.raw.starboy)

    LazyVerticalGrid(columns = GridCells.Fixed(4),
        content ={

            items(32){ Music ->
                Box(modifier = Modifier
                    .padding(9.dp)
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.Green),
                    contentAlignment = Alignment.Center){
                    Button(onClick = { mediaAudio2.start()}) {
                        Text(text = "mp1")
                    }
                    Button(onClick = { mediaAudio3.pause()}) {
                        Text(text = "mp2")
                    }
                    Button(onClick = { mediaAudio4.start()}) {
                        Text(text = "mp3")
                    }
                    Button(onClick = { mediaAudio5.start()}) {
                        Text(text = "mp4")
                    }
                    Button(onClick = { mediaAudio2.pause()}) {
                        Text(text = "mp5")
                    }
                    Button(onClick = { mediaAudio2.pause()}) {
                        Text(text = "mp6")
                    }
                }
            }

        } )
}

//
//@OptIn(ExperimentalMaterial3Api::class)
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun sampletry(context: Context){
//    Scaffold() {
//        val mediaAudio: MediaPlayer = MediaPlayer.create(context,R.raw.vellakesong)
//        val mediaAudio2: MediaPlayer = MediaPlayer.create(context,R.raw.afterhours)
//        val mediaAudio3: MediaPlayer = MediaPlayer.create(context,R.raw.iwasthere)
//        val mediaAudio4: MediaPlayer = MediaPlayer.create(context,R.raw.orenduprema)
//        val mediaAudio5: MediaPlayer = MediaPlayer.create(context,R.raw.starboy)
//
//        LazyVerticalGrid(columns = GridCells.Fixed(2)){
//            items(musicviewItems.size){
//                Box(modifier = Modifier
//                    .padding(9.dp)
//                    .aspectRatio(1f)
//                    .clip(RoundedCornerShape(5.dp))
//                    .background(Color.Green),
//                    contentAlignment = Alignment.Center){
//                  Button(onClick = {mediaAudio2.start() }) {
//                      Text(text = "ada")
//                  }
//                    Button(onClick = {mediaAudio3.start() }) {
//                      Text(text = "ram")
//                  }
//                    Button(onClick = {mediaAudio4.start() }) {
//                      Text(text = "hyd")
//                  }
//                    }
//                }
//            }
//        }
//    }



@Composable
fun PlayAudio23(context: Context) {
    val mediaAudio: MediaPlayer = MediaPlayer.create(context, R.raw.vellakesong)
    val mediaAudio2: MediaPlayer = MediaPlayer.create(context, R.raw.afterhours)
    val mediaAudio3: MediaPlayer = MediaPlayer.create(context, R.raw.iwasthere)
    val mediaAudio4: MediaPlayer = MediaPlayer.create(context, R.raw.orenduprema)
    val mediaAudio5: MediaPlayer = MediaPlayer.create(context, R.raw.starboy)

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Box(modifier = Modifier
                .padding(9.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Green),
                contentAlignment = Alignment.Center){
            Button(
                onClick = { mediaAudio.start() },
                colors = ButtonDefaults.buttonColors(

                    contentColor = Color.Black, containerColor = Color.Green
                )){
                Text(text = "vellake song")
            }}}

        item {
            Box(modifier = Modifier
                .padding(9.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Green),
                contentAlignment = Alignment.Center){
                Button(onClick = { mediaAudio2.start() },
                    colors = ButtonDefaults.buttonColors(

                        contentColor = Color.Black, containerColor = Color.Green
                    )) {
                    Text(text = "after hours")
                }}}
        item {
            Box(modifier = Modifier
                .padding(9.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Green),
                contentAlignment = Alignment.Center){
            Button(onClick = { mediaAudio3.start() },
                colors = ButtonDefaults.buttonColors(

                    contentColor = Color.Black, containerColor = Color.Green
                )) {
                Text(text = "i was there")
            }}}
        item {
            Box(modifier = Modifier
                .padding(9.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Green),
                contentAlignment = Alignment.Center){
            Button(onClick = { mediaAudio4.start() },
                colors = ButtonDefaults.buttonColors(

                    contentColor = Color.Black, containerColor = Color.Green
                )) {
                Text(text = "orendu prema")
            }}}

        item {
            Box(modifier = Modifier
                .padding(9.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Green),
                contentAlignment = Alignment.Center){
                Button(onClick = { mediaAudio5.start() },
                    colors = ButtonDefaults.buttonColors(

                        contentColor = Color.Black, containerColor = Color.Green
                    )) {
                    Text(text = "starboy")
                }}}
        item {
            Box(modifier = Modifier
                .padding(9.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Green),
                contentAlignment = Alignment.Center){
                Button(onClick = { mediaAudio.pause() },
                    colors = ButtonDefaults.buttonColors(

                        contentColor = Color.Black, containerColor = Color.Green
                    )) {
                    Text(text = "Click me to 1 ")
                }}}

            item {
                Box(modifier = Modifier
                    .padding(9.dp)
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.Green),
                    contentAlignment = Alignment.Center){
                    Button(onClick = { mediaAudio4.pause() }, colors = ButtonDefaults.buttonColors(

                        contentColor = Color.Black, containerColor = Color.Green
                    )
                    ) {
                        Text(text = "Click me 4")
                    }}}
        item {
                Box(modifier = Modifier
                    .padding(9.dp)
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.Green),
                    contentAlignment = Alignment.Center){
                    Button(onClick = { mediaAudio3.pause() },
                        colors = ButtonDefaults.buttonColors(

                            contentColor = Color.Black, containerColor = Color.Green
                        )) {
                        Text(text = "Click me 3")
                    }}}
    }
}

