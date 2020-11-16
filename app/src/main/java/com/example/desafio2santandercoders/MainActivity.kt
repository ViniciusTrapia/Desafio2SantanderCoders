package com.example.desafio2santandercoders

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.title = "Digital House Foods"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button  = findViewById<Button>(R.id.btRegister)
        val button1 = findViewById<Button>(R.id.btLogin)

        button1.setOnClickListener {
            startMain3(this@MainActivity)
        }

        button.setOnClickListener {
            startMain2(this@MainActivity)
        }

    }

    fun startMain2(context: Context) {
        val intent = Intent(context, MainActivity2::class.java)
        startActivity(intent)

}

    fun startMain3(context: Context) {
        val intentHome = Intent(context, MainActivity3::class.java)
        startActivity(intentHome)

    }

    }