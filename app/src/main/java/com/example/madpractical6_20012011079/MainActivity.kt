package com.example.madpractical6_20012011079

import android.content.Intent
import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController=android.widget.MediaController(this)
        val uri:Uri=Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        val myVideoView=findViewById<VideoView>(R.id.vidview)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()
        val button=findViewById<FloatingActionButton>(R.id.floatingbtn1)
        button.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).apply { startActivity(this) }

        }

    }

}