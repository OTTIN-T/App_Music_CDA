package com.example.music_cda.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.music_cda.MainActivity
import com.example.music_cda.R
import com.example.music_cda.parcelable.Profile

class ProfileActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profile = intent.getParcelableExtra<Profile>("profile")

        val imgImageView = findViewById<ImageView>(R.id.profile_img)
        val nameTextView = findViewById<TextView>(R.id.profile_name)
        val ageTextView = findViewById<TextView>(R.id.profile_age)
        val styleTextView = findViewById<TextView>(R.id.profile_style)
        val bioTextView = findViewById<TextView>(R.id.profile_bio)
        imgImageView.setImageDrawable(resources.getDrawable(R.drawable.luffy))
        nameTextView.text = "Nom: ${profile?.name}"
        ageTextView.text = "Age: ${profile?.age}"
        styleTextView.text = "Style: ${profile?.style}"
        bioTextView.text = "Bio: ${profile?.bio}"

        val goToHome = findViewById<Button>(R.id.start_home_activity_btn)
        goToHome.setOnClickListener {
            val intentHome = Intent(this, MainActivity::class.java)
            startActivity(intentHome)
        }
    }
}