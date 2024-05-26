package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CajaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caja)

        val backButton = findViewById<ImageView>(R.id.caja_reutiliza)

        backButton.setOnClickListener{
            onBackPressed()

        }
    }
}