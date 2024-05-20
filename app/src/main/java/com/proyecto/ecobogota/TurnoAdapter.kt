package com.proyecto.ecobogota


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TurnoAdapter(private val turnoList: List<Turno>) :


    RecyclerView.Adapter<TurnoAdapter.TurnoViewHolder>() {

    class TurnoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val turnoNumeroView: TextView = itemView.findViewById(R.id.turnotitulo1)
        val turnolocalidadesView: TextView = itemView.findViewById(R.id.turnoparrafo1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TurnoViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.novedades_turnos, parent, false)
        return TurnoViewHolder(view)

    }

    override fun getItemCount(): Int {

        return turnoList.size

    }

    override fun onBindViewHolder(holder: TurnoViewHolder, position: Int) {

        val turno = turnoList[position]
        holder.turnoNumeroView.text = turno.turnoNumero
        holder.turnolocalidadesView.text = turno.turnolocalidades

    }


}