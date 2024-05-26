package com.proyecto.ecobogota

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class BasicaActivity : AppCompatActivity() {

    private lateinit var expandableCard: CardView
    private lateinit var fondo1: ImageView
    private var isExpanded: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basica)

        val backButton = findViewById<ImageView>(R.id.basica_inicio)

        backButton.setOnClickListener {
            finish()
        }

        expandableCard = findViewById(R.id.expandableCard)
        fondo1 = findViewById(R.id.contenido1)

        expandableCard.setOnClickListener {
            toggleCardView(1)

        }
    }

    private fun toggleCardView(cardNumber1: Int) {
        when (cardNumber1) {
            1 -> {
                if (isExpanded) {
                    fondo1.visibility = View.GONE
                } else {
                    fondo1.visibility = View.VISIBLE
                }
                isExpanded = !isExpanded
            }
        }
    }
}







