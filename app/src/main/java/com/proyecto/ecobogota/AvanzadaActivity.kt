package com.proyecto.ecobogota

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class AvanzadaActivity : AppCompatActivity() {

    private lateinit var expandableCard: CardView
    private lateinit var expandableCard2: CardView
    private lateinit var expandableCard3: CardView
    private lateinit var fondo1: ImageView
    private lateinit var fondo2: ImageView
    private lateinit var fondo3: ImageView
    private var isExpanded1: Boolean = false
    private var isExpanded2: Boolean = false
    private var isExpanded3: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avanzada)

        val backButton = findViewById<ImageView>(R.id.avanzada_inicio)
        backButton.setOnClickListener {
            finish()
        }

        expandableCard = findViewById(R.id.expandableCard)
        expandableCard2 = findViewById(R.id.expandableCard2)
        expandableCard3 = findViewById(R.id.expandableCard3)
        fondo1 = findViewById(R.id.contenido1)
        fondo2 = findViewById(R.id.contenido2)
        fondo3 = findViewById(R.id.contenido3)

        expandableCard.setOnClickListener {
            toggleCardView(1)
        }

        expandableCard2.setOnClickListener {
            toggleCardView(2)
        }

        expandableCard3.setOnClickListener {
            toggleCardView(3)
        }
    }

    private fun toggleCardView(cardNumber: Int) {
        when (cardNumber) {
            1 -> {
                if (isExpanded1) {
                    fondo1.visibility = View.GONE
                } else {
                    fondo1.visibility = View.VISIBLE
                }
                isExpanded1 = !isExpanded1
            }
            2 -> {
                if (isExpanded2) {
                    fondo2.visibility = View.GONE
                } else {
                    fondo2.visibility = View.VISIBLE
                }
                isExpanded2 = !isExpanded2
            }
            3 -> {
                if (isExpanded3) {
                    fondo3.visibility = View.GONE
                } else {
                    fondo3.visibility = View.VISIBLE
                }
                isExpanded3 = !isExpanded3
            }
        }
    }
}