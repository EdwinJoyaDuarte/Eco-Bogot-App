package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class IntermediaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intermedia)

        val backButton = findViewById<ImageView>(R.id.intermedia_inicio)

        backButton.setOnClickListener {
            finish()
        }
    }
}