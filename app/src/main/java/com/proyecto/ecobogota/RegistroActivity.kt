package com.proyecto.ecobogota

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException


class RegistroActivity : AppCompatActivity() {

    private lateinit var inpNombre: TextInputEditText
    private lateinit var inpEmail: TextInputEditText
    private lateinit var inpPassword: TextInputEditText
    private lateinit var etConfirmPassword: TextInputEditText
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        mAuth = FirebaseAuth.getInstance()

        inpNombre = findViewById(R.id.inp_text_nombre)
        inpEmail = findViewById(R.id.inp_text_email)
        inpPassword = findViewById(R.id.inp_text_password)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)

        val registroButton: Button = findViewById(R.id.registration_button)
        registroButton.setOnClickListener { registrarUsuario() }

        val backButton = findViewById<ImageView>(R.id.registro_inicio)
        backButton.setOnClickListener {
            onBackPressed()

        }

    }
    private fun registrarUsuario() {

        val nombre = inpNombre.text.toString().trim()
        val email = inpEmail.text.toString().trim()
        val password = inpPassword.text.toString().trim()
        val confirmPassword = etConfirmPassword.text.toString().trim()

        if (TextUtils.isEmpty(nombre)) {
            inpNombre.error = "El nombre es obligatorio"
            return
        }

        if (TextUtils.isEmpty(email)) {
            inpEmail.error = "El email es obligatorio"
            return
        }

        if (TextUtils.isEmpty(password)) {
            inpPassword.error = "La contraseña es obligatoria"
            return
        }

        if (password.length < 6) {
            inpPassword.error = "La contraseña debe tener al menos 6 caracteres"
            return
        }

        if (!password.equals(confirmPassword)) {
            etConfirmPassword.error = "Las contraseñas no coinciden"
            return

        }

        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()

                } else {

                    try {
                        throw task.exception!!
                    } catch (e: FirebaseAuthWeakPasswordException) {
                        inpPassword.error = "La contraseña es demasiado débil"
                    } catch (e: FirebaseAuthUserCollisionException) {
                        inpEmail.error = "Ya existe una cuenta con este email"
                    } catch (e: Exception) {
                        Toast.makeText(this, "Error en el registro: ${e.message}", Toast.LENGTH_SHORT).show()
                    }
                }
            }
    }
}
