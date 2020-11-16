package com.example.desafio2santandercoders

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurante(
    val foto: String,
    val nome: String,
    val ende: String,
    val horario: String,
    val pratos: MutableList<Prato> = mutableListOf<Prato>()
): Parcelable

