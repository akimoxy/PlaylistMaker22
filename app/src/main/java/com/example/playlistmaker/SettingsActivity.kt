package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val buttonBackInSettings = findViewById<Button>(R.id.back_button)
        buttonBackInSettings.setOnClickListener {
            val buttonBackInSettingsIntent = Intent(this, MainActivity::class.java)
            startActivity(buttonBackInSettingsIntent)
        }
    }
}