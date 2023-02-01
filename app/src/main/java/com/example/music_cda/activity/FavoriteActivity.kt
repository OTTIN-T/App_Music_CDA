package com.example.music_cda.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.music_cda.MainActivity
import com.example.music_cda.R
import com.example.music_cda.parcelable.Favorite

class FavoriteActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val favorite = intent.getParcelableExtra<Favorite>("favorite")
        val tittleTextView = findViewById<TextView>(R.id.favorite_title)
        val durationTextView = findViewById<TextView>(R.id.favorite_duration)
        val styleTextView = findViewById<TextView>(R.id.favorite_style)
        val artistTextView = findViewById<TextView>(R.id.favorite_artist)
        val coverImageView = findViewById<ImageView>(R.id.favorite_cover)
        tittleTextView.text = "Titre: ${favorite?.title}"
        durationTextView.text = "Durée: ${favorite?.duration}"
        styleTextView.text = "Style: ${favorite?.style}"
        artistTextView.text = "Artiste: ${favorite?.artist}"
        coverImageView.setImageDrawable(resources.getDrawable(R.drawable.a7))
        val goToHome = findViewById<Button>(R.id.start_home_activity_btn)
        goToHome.setOnClickListener {
            val intentHome = Intent(this, MainActivity::class.java)
            startActivity(intentHome)
        }
    }
}