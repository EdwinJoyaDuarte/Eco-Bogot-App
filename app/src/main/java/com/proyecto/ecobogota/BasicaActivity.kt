package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BasicaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basica)

        val backButton = findViewById<ImageView>(R.id.basica_inicio)

        backButton.setOnClickListener {
            finish()
        }
    }
}