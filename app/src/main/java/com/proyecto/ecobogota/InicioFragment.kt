package com.proyecto.ecobogota

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment



class InicioFragment : Fragment(R.layout.fragment_inicio) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListeners()
    }

    private fun setupClickListeners() {

        view?.findViewById<View>(R.id.btnBasica)?.setOnClickListener {
            openBasicaActivity()
        }


        view?.findViewById<View>(R.id.btnIntermedia)?.setOnClickListener {
            openIntermediaActivity()
        }


        view?.findViewById<View>(R.id.btnAvanzada)?.setOnClickListener {
            openAvanzadaActivity()
        }

    }

    private fun openBasicaActivity() {

        val intent = Intent(requireContext(), BasicaActivity::class.java)
        startActivity(intent)
    }

    private fun openIntermediaActivity() {

        val intent = Intent(requireContext(), IntermediaActivity::class.java)
        startActivity(intent)
    }

    private fun openAvanzadaActivity() {

        val intent = Intent(requireContext(), AvanzadaActivity::class.java)
        startActivity(intent)
    }
}