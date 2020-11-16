package com.example.desafio2santandercoders

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main4.view.*
import kotlinx.android.synthetic.main.item_cardapio.view.*

class CardapioAdapter(

    private val listaPratos: List<Prato>,
    private val onItemClicked: (Int) -> Unit
) : RecyclerView.Adapter<CardapioAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardapioAdapter.ViewHolder {
        Log.i("RecyclerView", "onCreateViewHolder")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardapio, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardapioAdapter.ViewHolder, position: Int) {
        Log.i("RecyclerView", "onBindViewHolder - $position")
        holder.bind(listaPratos[position], onItemClicked)


    }

    override fun getItemCount(): Int {
        return listaPratos.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(prato: Prato, onItemClicked: (Int) -> Unit) = with(itemView) {

            Glide.with(itemView.context).load(prato.foto).into(bannerCard)
            tvTituloCard.text = prato.nome


            main2Container.setOnClickListener {
                onItemClicked(this@ViewHolder.adapterPosition)
            }
        }
    }


}