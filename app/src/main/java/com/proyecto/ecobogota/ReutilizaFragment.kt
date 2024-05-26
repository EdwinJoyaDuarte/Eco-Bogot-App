package com.proyecto.ecobogota

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.proyecto.ecobogota.databinding.FragmentReutilizaBinding

class ReutilizaFragment : Fragment(R.layout.fragment_reutiliza) {

    private var _binding: FragmentReutilizaBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentReutilizaBinding.bind(view)

        binding.button1.setOnClickListener {
            startActivity(Intent(requireContext(), VelaActivity::class.java))
        }

        binding.button2.setOnClickListener {
            startActivity(Intent(requireContext(), JarronesActivity::class.java))
        }

        binding.button3.setOnClickListener {
            startActivity(Intent(requireContext(), PortalapicesActivity::class.java))
        }

        binding.button4.setOnClickListener {
            startActivity(Intent(requireContext(), CajaActivity::class.java))
        }

        binding.button5.setOnClickListener {
            startActivity(Intent(requireContext(), MacetasActivity::class.java))
        }

        binding.button6.setOnClickListener {
            startActivity(Intent(requireContext(), PortaretratoActivity::class.java))
        }

        binding.button7.setOnClickListener {
            startActivity(Intent(requireContext(), MantelActivity::class.java))
        }

        binding.button8.setOnClickListener {
            startActivity(Intent(requireContext(), MascotasActivity::class.java))
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}
