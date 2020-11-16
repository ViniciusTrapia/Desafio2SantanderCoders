package com.example.desafio2santandercoders

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.title = "Digital House Foods"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val prato1 = Prato(
            "https://img.cybercook.com.br/receitas/71/salada-primavera-6-623x350.jpeg",
            "Salada com molho de gengibre",
            "Deliciosa salada temperada com molho de gengibre"
        )
        val prato2 = Prato(
            "https://img.itdg.com.br/tdg/images/recipes/000/169/681/146793/146793_original.jpg?mode=crop&width=710&height=400",
            "Carne assada",
            "Deliciosa carne assada ao forno"
        )
        val prato3 = Prato(
            "https://st2.depositphotos.com/3957801/5642/i/950/depositphotos_56423065-stock-photo-bacon-burger.jpg",
            "Hamburguer",
            "Delicioso hamburguer da casa"
        )
        val prato4 = Prato(
            "https://img.cybercook.com.br/receitas/731/lasanha-3-623x350.jpeg",
            "Lasanha",
            "Deliciosa lasanha a bolonhesa"
        )
        val prato5 = Prato(
            "https://i.pinimg.com/564x/d7/37/91/d73791eeffd97e9fe3eda79cd1091c38.jpg",
            "Hot Dog Osasquense",
            "Delicioso hot dog à moda de Osasco"
        )

        val prato6 = Prato(
            "https://i.pinimg.com/564x/d7/37/91/d73791eeffd97e9fe3eda79cd1091c38.jpg",
            "Hot Dog Osasquense",
            "Delicioso hot dog à moda de Osasco"
        )

        val prato7 = Prato(
            "https://i.pinimg.com/564x/d7/37/91/d73791eeffd97e9fe3eda79cd1091c38.jpg",
            "Hot Dog Osasquense",
            "Delicioso hot dog à moda de Osasco"
        )

        val prato8 = Prato(
            "https://i.pinimg.com/564x/d7/37/91/d73791eeffd97e9fe3eda79cd1091c38.jpg",
            "Hot Dog Osasquense",
            "Delicioso hot dog à moda de Osasco"
        )

        val prato9 = Prato(
            "https://i.pinimg.com/564x/d7/37/91/d73791eeffd97e9fe3eda79cd1091c38.jpg",
            "Hot Dog Osasquense",
            "Delicioso hot dog à moda de Osasco"
        )

        val prato10 = Prato(
            "https://i.pinimg.com/564x/d7/37/91/d73791eeffd97e9fe3eda79cd1091c38.jpg",
            "Hot Dog Osasquense",
            "Delicioso hot dog à moda de Osasco"
        )

        val prato11 = Prato(
            "https://i.pinimg.com/564x/d7/37/91/d73791eeffd97e9fe3eda79cd1091c38.jpg",
            "Hot Dog Osasquense",
            "Delicioso hot dog à moda de Osasco"
        )


        val restaurantes = mutableListOf<Restaurante>()

        val restaurante1 = Restaurante("https://st2.depositphotos.com/3957801/5642/i/950/depositphotos_56423065-stock-photo-bacon-burger.jpg","Tony Roma's","Av. Lavandisca, 717 - Indianópolis, São Paulo","Fecha às 22:00")
        val restaurante2 = Restaurante("https://img.cybercook.com.br/receitas/71/salada-primavera-6-623x350.jpeg","Aoyama - Moema","Alameda dos Arapanés, 532 - Moema","Fecha às 00:00")
        val restaurante3 = Restaurante("https://st2.depositphotos.com/3957801/5642/i/950/depositphotos_56423065-stock-photo-bacon-burger.jpg","Outback - Moema","asdasfafasfd","Fecha às 00:00",)
        restaurante1.pratos.addAll(listOf(prato1,prato2,prato3,prato4,prato5,prato6,prato7))
        restaurante2.pratos.addAll(listOf(prato5,prato4,prato3,prato2,prato1,prato7,prato6))
        restaurante3.pratos.addAll(listOf(prato3,prato5,prato4,prato2,prato1,prato10,prato11))
        restaurantes.addAll(listOf(restaurante1,restaurante2,restaurante3))


        findViewById<RecyclerView>(R.id.rvRestaurante).apply {
            layoutManager = LinearLayoutManager(this@MainActivity3)
            adapter = MainAdapter(restaurantes) { position ->
                val intent = Intent(this@MainActivity3, MainActivity4::class.java)
                intent.putExtra(KEY_INTENT_RESTAURANTE, restaurantes[position])
                startActivity(intent)
            }
        }


    }

    companion object {
 const val KEY_INTENT_RESTAURANTE = "restaurante"
    }
}
