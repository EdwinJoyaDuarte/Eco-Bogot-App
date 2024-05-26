package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PortaretratoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portaretrato)

            val backButton = findViewById<ImageView>(R.id.portaretrato_reutiliza)

            backButton.setOnClickListener{
                onBackPressed()

        }
    }
}