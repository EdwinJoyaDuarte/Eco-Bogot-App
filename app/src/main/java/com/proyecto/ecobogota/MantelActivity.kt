package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MantelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mantel)


            val backButton = findViewById<ImageView>(R.id.mantel_reutiliza)

            backButton.setOnClickListener{
                onBackPressed()


            }
    }
}