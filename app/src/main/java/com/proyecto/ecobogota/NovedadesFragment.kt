package com.proyecto.ecobogota

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NovedadesFragment : Fragment(R.layout.fragment_novedades) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var turnoList: ArrayList<Turno>
    private lateinit var turnoAdapter: TurnoAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
    }

    private fun init(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        turnoList = ArrayList()

        addDataToList()

        turnoAdapter = TurnoAdapter(turnoList)
        recyclerView.adapter = turnoAdapter
    }

    private fun addDataToList() {
        turnoList.add(Turno(turnoNumero = getString(R.string.tituloturno1), turnolocalidades = getString(R.string.localidadesturno1)))
        turnoList.add(Turno(turnoNumero = getString(R.string.tituloturno2), turnolocalidades = getString(R.string.localidadesturno2)))
        turnoList.add(Turno(turnoNumero = getString(R.string.tituloturno3), turnolocalidades = getString(R.string.localidadesturno3)))
        turnoList.add(Turno(turnoNumero = getString(R.string.tituloturno4), turnolocalidades = getString(R.string.localidadesturno4)))
        turnoList.add(Turno(turnoNumero = getString(R.string.tituloturno5), turnolocalidades = getString(R.string.localidadesturno5)))
        turnoList.add(Turno(turnoNumero = getString(R.string.tituloturno6), turnolocalidades = getString(R.string.localidadesturno6)))
        turnoList.add(Turno(turnoNumero = getString(R.string.tituloturno7), turnolocalidades = getString(R.string.localidadesturno7)))
        turnoList.add(Turno(turnoNumero = getString(R.string.tituloturno8), turnolocalidades = getString(R.string.localidadesturno8)))
        turnoList.add(Turno(turnoNumero = getString(R.string.tituloturno9), turnolocalidades = getString(R.string.localidadesturno9)))
    }
}