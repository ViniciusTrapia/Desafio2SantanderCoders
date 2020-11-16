package com.example.desafio2santandercoders

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        getSupportActionBar()?.title = "Register"
        val button = findViewById<Button>(R.id.btRegistrar)

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        button.setOnClickListener {
            startMain3(this@MainActivity2)
        }

        }
    fun startMain3(context: Context) {
        val intentHome = Intent(context, MainActivity3::class.java)
        startActivity(intentHome)

        }
    }
