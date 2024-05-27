package com.proyecto.ecobogota

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class CorreoActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correo)

        auth = FirebaseAuth.getInstance()

        val backButton = findViewById<ImageView>(R.id.correo_inicio)
        backButton.setOnClickListener {
            onBackPressed()
        }

        val emailEditText = findViewById<TextInputEditText>(R.id.rec_inp_text_nombre)
        val recuperarButton = findViewById<Button>(R.id.Recuperar_cuenta)

        recuperarButton.setOnClickListener {
            val email = emailEditText.text.toString()

            if (email.isNotEmpty()) {
                auth.sendPasswordResetEmail(email)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(
                                this@CorreoActivity,
                                "Se ha enviado un correo de recuperación a $email",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            Toast.makeText(
                                this@CorreoActivity,
                                "Error al enviar el correo de recuperación",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            } else {
                Toast.makeText(
                    this@CorreoActivity,
                    "Ingrese su correo electrónico",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}