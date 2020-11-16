package com.example.desafio2santandercoders

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.tste_item.view.*

class MainAdapter(
    private val restauranteList: List<Restaurante>,
    private val onItemClicked: (Int) -> Unit
) : RecyclerView.Adapter<MainAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        Log.i("RecyclerView", "onCreateViewHolder")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.tste_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        Log.i("RecyclerView", "onBindViewHolder - $position")
        holder.bind(restauranteList[position], onItemClicked)
    }

    override fun getItemCount(): Int {
        return restauranteList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(restaurante: Restaurante, onItemClicked: (Int) -> Unit) = with(itemView) {

            Glide.with(itemView.context).load(restaurante.foto).into(banner)

            tvTitulo.text = restaurante.nome
            tvEnde.text = restaurante.ende
            tvHora.text = restaurante.horario

            mainContainer.setOnClickListener {
                onItemClicked(this@ViewHolder.adapterPosition)
            }
        }
    }
}