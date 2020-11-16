package com.example.desafio2santandercoders

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.widget.ImageViewCompat
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main5.*
import com.example.desafio2santandercoders.MainActivity4.Companion.KEY_INTENT_PRATO
import kotlinx.android.synthetic.main.activity_main4.*


class MainActivity5 : AppCompatActivity(){

    var  prato: Prato? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        prato = intent.getParcelableExtra(KEY_INTENT_PRATO)


        Glide.with(this).load(prato?.foto).into(ivPrato)
        tvPratoNome.text = prato?.nome ?: ""
        tvPratoDescricao.text = prato?.descrição ?:  ""


}
    }
