package com.proyecto.ecobogota

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment



class InicioFragment : Fragment(R.layout.fragment_inicio) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar listeners de clics
        setupClickListeners()
    }

    private fun setupClickListeners() {
        // Asignar clic listener para la opción "Básica"
        view?.findViewById<View>(R.id.btnBasica)?.setOnClickListener {
            openBasicaActivity()
        }

        // Asignar clic listener para la opción "Intermedia"
        view?.findViewById<View>(R.id.btnIntermedia)?.setOnClickListener {
            openIntermediaActivity()
        }

        // Asignar clic listener para la opción "Intermedia"
        view?.findViewById<View>(R.id.btnAvanzada)?.setOnClickListener {
            openAvanzadaActivity()
        }
    }

    private fun openBasicaActivity() {
        // Iniciar la actividad BasicaActivity
        val intent = Intent(requireContext(), BasicaActivity::class.java)
        startActivity(intent)
    }

    private fun openIntermediaActivity() {
        // Iniciar la actividad IntermediaActivity
        val intent = Intent(requireContext(), IntermediaActivity::class.java)
        startActivity(intent)
    }

    private fun openAvanzadaActivity() {
        // Iniciar la actividad AvanzadaActivity
        val intent = Intent(requireContext(), AvanzadaActivity::class.java)
        startActivity(intent)
    }
}