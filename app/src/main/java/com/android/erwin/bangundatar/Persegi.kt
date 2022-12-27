package com.android.erwin.bangundatar

class Persegi(private val tinggi : Double,private val lebar : Double) : FormulaBangunDatar() {

    override fun luas(): Double {
        return tinggi * lebar
    }

    override fun keliling(): Double {
        return (tinggi + lebar) * 4
    }
}