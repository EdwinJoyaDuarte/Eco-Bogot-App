package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MacetasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_macetas)

            val backButton = findViewById<ImageView>(R.id.macetas_reutiliza)

            backButton.setOnClickListener{
                onBackPressed()

        }
    }
}