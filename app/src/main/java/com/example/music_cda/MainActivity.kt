package com.example.music_cda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.music_cda.activity.FavoriteActivity
import com.example.music_cda.activity.PolicyActivity
import com.example.music_cda.activity.ProfileActivity
import com.example.music_cda.parcelable.Favorite
import com.example.music_cda.parcelable.Policy
import com.example.music_cda.parcelable.Profile

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profile = Profile("Tim", 27, "J'apprend Kotlin en musique", "Rap")
        val goToProfile = findViewById<Button>(R.id.start_profile_activity_btn)
        goToProfile.setOnClickListener {
            val intentProfile = Intent(this, ProfileActivity::class.java)
            intentProfile.putExtra("profile", profile)
            startActivity(intentProfile)
        }

        val policy = Policy("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum")
        val goToPolicy = findViewById<Button>(R.id.start_policy_activity_btn)
        goToPolicy.setOnClickListener {
            val intentPolicy = Intent(this, PolicyActivity::class.java)
            intentPolicy.putExtra("policy", policy)
            startActivity(intentPolicy)
        }

        val favorite = Favorite("A7", "4:44", "Rap", "SCH")
        val goToFavorite = findViewById<Button>(R.id.start_favorite_activity_btn)
        goToFavorite.setOnClickListener {
            val intentFavorite = Intent(this, FavoriteActivity::class.java)
            intentFavorite.putExtra("favorite", favorite)
            startActivity(intentFavorite)
        }
    }
}