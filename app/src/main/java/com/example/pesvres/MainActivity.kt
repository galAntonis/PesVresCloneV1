package com.example.pesvres

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var playTextView: TextView;
    private lateinit var settingsTextView: TextView;
    private lateinit var rulesTextView: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewIds()
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        playTextView.setOnClickListener{
            val intent = Intent(this, NewGameSettingsActivity::class.java)
            startActivity(intent)
        }
        settingsTextView.setOnClickListener(){
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        rulesTextView.setOnClickListener(){
            val intent = Intent(this, RulesActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setViewIds() {
        playTextView = findViewById(R.id.playTextView)
        settingsTextView = findViewById(R.id.settingsTextView)
        rulesTextView = findViewById(R.id.rulesTextView)
    }
}