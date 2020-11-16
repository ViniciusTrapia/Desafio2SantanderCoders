package com.example.desafio2santandercoders

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Prato(
    val foto: String,
    val nome: String,
    val descrição: String
) : Parcelable
