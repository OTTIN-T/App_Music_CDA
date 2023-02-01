package com.example.music_cda.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.music_cda.R
import com.example.music_cda.parcelable.Policy

class PolicyActivity:  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_policy)

        val profile = intent.getParcelableExtra<Policy>("policy")
        val policyTextView = findViewById<TextView>(R.id.policy_text)
        policyTextView.text = "Nom: ${profile?.policy}"

        val goToValidationActivity = findViewById<Button>(R.id.start_validation_activity_btn)
        goToValidationActivity.setOnClickListener {
            val intentValidationActivity = Intent(this, ValidationActivity::class.java)
            intentValidationActivity.action = Intent.ACTION_VIEW
            intentValidationActivity.addCategory("validation")
            intentValidationActivity.putExtra("state", "Validé")
            startActivity(intentValidationActivity)
        }
    }
}