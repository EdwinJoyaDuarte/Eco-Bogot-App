package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class JarronesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jarrones)

        val backButton = findViewById<ImageView>(R.id.jarrones_reutiliza)

        backButton.setOnClickListener{
            onBackPressed()
        }
    }
}