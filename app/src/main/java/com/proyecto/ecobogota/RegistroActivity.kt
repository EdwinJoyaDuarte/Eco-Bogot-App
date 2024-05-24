package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val backButton = findViewById<ImageView>(R.id.registro_inicio)
        backButton.setOnClickListener {
            onBackPressed()

        }
    }
}