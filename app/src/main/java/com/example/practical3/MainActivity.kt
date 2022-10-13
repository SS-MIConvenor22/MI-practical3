package com.example.practical3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textCount1).text = "Viewed " + ArtworkApplication.counter1.toString() + " times"
        findViewById<TextView>(R.id.textCount2).text = "Viewed " + ArtworkApplication.counter2.toString() + " times"
        findViewById<TextView>(R.id.textCount3).text = "Viewed " + ArtworkApplication.counter3.toString() + " times"
    }
    fun viewArt(view: View){
        val intent = Intent(this,ViewArtwork::class.java)
        when (view.id){
            R.id.viewArt1 ->{
                ArtworkApplication.counter1++
                intent.putExtra("artNum",1)
            }
            R.id.viewArt2 -> {
                ArtworkApplication.counter2++
                intent.putExtra("artNum",2)
            }
            R.id.viewArt3 -> {
                ArtworkApplication.counter3++
                intent.putExtra("artNum",3)
            }
        }
        startActivity(intent)
    }
}