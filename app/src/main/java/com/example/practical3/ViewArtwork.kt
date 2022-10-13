package com.example.practical3

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class ViewArtwork : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_artwork)
        val imageView = findViewById<ImageView>(R.id.imageView2)
        if (intent.getIntExtra("artNum",1) == 2){
            imageView.setImageResource(R.drawable.art2)
        }
        else if (intent.getIntExtra("artNum",1) == 3){
            imageView.setImageResource(R.drawable.art3)
        }
    }
    fun goBack(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}

