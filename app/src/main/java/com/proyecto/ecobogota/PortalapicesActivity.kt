package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PortalapicesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portalapices)

        val backButton = findViewById<ImageView>(R.id.portalapices_reutiliza)

        backButton.setOnClickListener{
            onBackPressed()

        }
    }
}