package com.proyecto.ecobogota

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.UserProfileChangeRequest

class PerfilFragment : Fragment() {

    private lateinit var auth: FirebaseAuth
    private lateinit var currentUser: FirebaseUser

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)

        auth = FirebaseAuth.getInstance()
        currentUser = auth.currentUser!!

        val nombreEditText = view.findViewById<TextInputEditText>(R.id.inpu_text_nombre)
        val emailEditText = view.findViewById<TextInputEditText>(R.id.inpu_text_email)
        val passwordEditText = view.findViewById<TextInputEditText>(R.id.inpu_text_password)
        val confirmPasswordEditText = view.findViewById<TextInputEditText>(R.id.etConfirmPassword)
        val actualizarButton = view.findViewById<Button>(R.id.actualizar_button)
        val cerrarSesionButton = view.findViewById<Button>(R.id.cerrar_button)

        nombreEditText.setText(currentUser.displayName)
        emailEditText.setText(currentUser.email)

        actualizarButton.setOnClickListener {
            val nombre = nombreEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()

            if (nombre.isNotEmpty()) {
                val profileUpdates = UserProfileChangeRequest.Builder()
                    .setDisplayName(nombre)
                    .build()

                currentUser.updateProfile(profileUpdates)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(requireContext(), "Nombre actualizado correctamente", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(requireContext(), "Error al actualizar nombre", Toast.LENGTH_SHORT).show()
                        }
                    }
            }

            if (email.isNotEmpty()) {
                currentUser.updateEmail(email)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(requireContext(), "Correo electrónico actualizado correctamente", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(requireContext(), "Error al actualizar correo electrónico", Toast.LENGTH_SHORT).show()
                        }
                    }
            }

            if (password.isNotEmpty() && password == confirmPassword) {
                currentUser.updatePassword(password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(requireContext(), "Contraseña actualizada correctamente", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(requireContext(), "Error al actualizar contraseña", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else if (password != confirmPassword) {
                Toast.makeText(requireContext(), "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            }
        }

        cerrarSesionButton.setOnClickListener {
            auth.signOut()
            requireActivity().finish()
        }

        return view
    }
}