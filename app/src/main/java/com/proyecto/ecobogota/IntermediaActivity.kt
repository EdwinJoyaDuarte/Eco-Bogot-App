package com.proyecto.ecobogota

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class IntermediaActivity : AppCompatActivity() {

    private lateinit var expandableCard: CardView
    private lateinit var expandableCard2: CardView
    private lateinit var fondo1: ImageView
    private lateinit var fondo2: ImageView
    private var isExpanded1: Boolean = false
    private var isExpanded2: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intermedia)

        val backButton = findViewById<ImageView>(R.id.intermedia_inicio)

        backButton.setOnClickListener {
            finish()
        }

        expandableCard = findViewById(R.id.expandableCard)
        expandableCard2 = findViewById(R.id.expandableCard2)
        fondo1 = findViewById(R.id.contenido1)
        fondo2 = findViewById(R.id.contenido2)

        expandableCard.setOnClickListener {
            toggleCardView(1)
        }

        expandableCard2.setOnClickListener {
            toggleCardView(2)
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
        }
    }
}