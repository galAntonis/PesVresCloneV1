package com.example.pesvres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.GridView
import android.widget.TextView

class NewGameSettingsActivity : AppCompatActivity() {
    private lateinit var lowDifficultyCheckBox: CheckBox;
    private lateinit var mediumDifficultyCheckBox: CheckBox;
    private lateinit var highDifficultyCheckBox: CheckBox;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_game_settings)
        setViewIds()
        setOnClickListeners()
    }



    private fun setOnClickListeners() {
        lowDifficultyCheckBox.setOnCheckedChangeListener { _, _ -> controlCheckBoxes() }
        mediumDifficultyCheckBox.setOnCheckedChangeListener { _, _ -> controlCheckBoxes() }
        highDifficultyCheckBox.setOnCheckedChangeListener { _, _ -> controlCheckBoxes() }

    }

    private fun controlCheckBoxes() {
        when {
            highDifficultyCheckBox.isChecked && mediumDifficultyCheckBox.isChecked && lowDifficultyCheckBox.isChecked ->
                mediumDifficultyCheckBox.isEnabled = false
            mediumDifficultyCheckBox.isChecked && !highDifficultyCheckBox.isChecked && !lowDifficultyCheckBox.isChecked ->
                mediumDifficultyCheckBox.isEnabled = false
            !mediumDifficultyCheckBox.isChecked -> {
                highDifficultyCheckBox.isEnabled = false
                lowDifficultyCheckBox.isEnabled = false
            }
            else -> {
                highDifficultyCheckBox.isEnabled = true
                lowDifficultyCheckBox.isEnabled = true
                mediumDifficultyCheckBox.isEnabled = true
            }
        }

    }

    private fun setViewIds() {
        lowDifficultyCheckBox = findViewById(R.id.lowDifficultyCheckBox)
        mediumDifficultyCheckBox = findViewById(R.id.mediumDifficultyCheckBox)
        highDifficultyCheckBox = findViewById(R.id.highDifficultyCheckBox)

    }
}