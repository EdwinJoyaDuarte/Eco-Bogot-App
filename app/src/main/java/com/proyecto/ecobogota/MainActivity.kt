package com.proyecto.ecobogota

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var inpEmail: TextInputEditText
    private lateinit var inpPassword: TextInputEditText
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
        setTheme(R.style.Theme_EcoBogota)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()

        inpEmail = findViewById(R.id.log_inp_text_nombre)
        inpPassword = findViewById(R.id.log_inp_text_password)

        val loginButton: Button = findViewById(R.id.log_cuenta)
        val registerTextView: TextView = findViewById(R.id.text_registro)
        val forgotPasswordTextView: TextView = findViewById(R.id.text_recuperar)

        loginButton.setOnClickListener { iniciarSesion() }
        registerTextView.setOnClickListener { irARegistro() }
        forgotPasswordTextView.setOnClickListener { irARestablecerPassword() }
    }

    private fun iniciarSesion() {
        val email = inpEmail.text.toString().trim()
        val password = inpPassword.text.toString().trim()

        if (TextUtils.isEmpty(email)) {
            inpEmail.error = "El email es obligatorio"
            return
        }

        if (TextUtils.isEmpty(password)) {
            inpPassword.error = "La contraseña es obligatoria"
            return
        }

        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {

                    Toast.makeText(
                        this,
                        "Error en el inicio de sesión: ${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }

    private fun irARegistro() {
        val intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
    }

    private fun irARestablecerPassword() {
        val intent = Intent(this, CorreoActivity::class.java)
        startActivity(intent)
    }
}