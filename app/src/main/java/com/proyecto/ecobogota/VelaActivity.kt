package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class VelaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vela)

            val backButton = findViewById<ImageView>(R.id.vela_reutiliza)

            backButton.setOnClickListener{
                onBackPressed()
            }

    }
}