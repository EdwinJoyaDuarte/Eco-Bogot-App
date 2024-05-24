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

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}
