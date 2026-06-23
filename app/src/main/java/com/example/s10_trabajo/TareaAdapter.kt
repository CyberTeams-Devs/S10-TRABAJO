package com.example.s10_trabajo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TareaAdapter(private val listaTareas: List<String>) :
    RecyclerView.Adapter<TareaAdapter.TareaViewHolder>() {

    class TareaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTarea: TextView = itemView.findViewById(R.id.tvTarea)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tarea, parent, false)
        return TareaViewHolder(view)

    }

    override fun onBindViewHolder(holder: TareaViewHolder, position: Int) {
        holder.tvTarea.text = listaTareas[position]
    }

    override fun getItemCount(): Int = listaTareas.size
}