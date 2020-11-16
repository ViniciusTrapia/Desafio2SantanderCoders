package com.example.desafio2santandercoders

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main4.*
import com.example.desafio2santandercoders.MainActivity3.Companion.KEY_INTENT_RESTAURANTE
class MainActivity4 : AppCompatActivity() {

    private var restaurante: Restaurante? = null




    override fun onCreate(savedInstanceState: Bundle?) {

        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)



        restaurante = intent.getParcelableExtra(KEY_INTENT_RESTAURANTE)

        setupRest()



        var pratos = mutableListOf<Prato>()







        pratos = restaurante?.pratos!!

        findViewById<RecyclerView>(R.id.rvCardapio).apply {
            layoutManager = GridLayoutManager(this@MainActivity4, 2)
            adapter = CardapioAdapter(pratos) { position ->
                val intent = Intent(this@MainActivity4, MainActivity5::class.java)
                intent.putExtra(KEY_INTENT_PRATO, pratos[position])
                startActivity(intent)
            }
        }
}

    private fun setupRest() {
        Glide.with(this).load(restaurante?.foto).into(ivCard)
        tvNomeRest.text = restaurante?.nome ?: ""


    }
    companion object {
        const val KEY_INTENT_PRATO = "prato"
    }


    }