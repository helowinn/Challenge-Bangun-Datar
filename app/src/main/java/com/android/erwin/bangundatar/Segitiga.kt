package com.android.erwin.bangundatar

class Segitiga (private val tinggi : Double,private val sisi : Double,private val alas : Double) : FormulaBangunDatar() {

    override fun luas(): Double {
        return (tinggi * alas) * 1/2
    }

    override fun keliling(): Double {
        return (sisi + sisi + sisi)
    }
}