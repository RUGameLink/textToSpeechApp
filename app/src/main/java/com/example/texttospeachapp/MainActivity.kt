package com.example.texttospeachapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var toSpeechText: EditText
    private lateinit var playButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        var height = displayMetrics.heightPixels
        Toast.makeText(this, height.toString(), Toast.LENGTH_SHORT).show()
        toSpeechText.layoutParams.height = height / 2
    }

    private fun init(){
        toSpeechText = findViewById(R.id.toSpeechText)
        playButton = findViewById(R.id.playButton)
    }
}