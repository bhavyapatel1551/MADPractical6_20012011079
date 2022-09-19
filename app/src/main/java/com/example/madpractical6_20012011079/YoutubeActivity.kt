package com.example.madpractical6_20012011079

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.webkit.WebView

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId="7qWiLzxkJVU"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val myWebView=findViewById<WebView>(R.id.webview)
        val settings=myWebView.settings
        settings.javaScriptEnabled =true
        settings.loadWithOverviewMode =true
        settings.useWideViewPort= true
        myWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")

    }
}