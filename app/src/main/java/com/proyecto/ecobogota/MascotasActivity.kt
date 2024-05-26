package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MascotasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascotas)

        val backButton = findViewById<ImageView>(R.id.mascotas_reutiliza)

        backButton.setOnClickListener{
            onBackPressed()


        }
    }
}