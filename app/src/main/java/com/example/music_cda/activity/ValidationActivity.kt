package com.example.music_cda.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.music_cda.MainActivity
import com.example.music_cda.R

class ValidationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validation)

        val extras: Bundle? = intent.extras
        val state = extras?.getString("state")
        val stateTextView = findViewById<TextView>(R.id.validation_state)
        stateTextView.text = state

        val goToHome = findViewById<Button>(R.id.start_home_activity_btn)
        goToHome.setOnClickListener {
            val intentHome = Intent(this, MainActivity::class.java)
            startActivity(intentHome)
        }

    }
}