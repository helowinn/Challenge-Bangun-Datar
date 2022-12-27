package com.android.erwin.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val tvLuasPersegi: TextView by lazy {
        findViewById(R.id.tv_luas_persegi)
    }

    private val tvKelilingPersegi: TextView by lazy {
        findViewById(R.id.tv_keliling_persegi)
    }

    private val tvLuasPersegiPanjang: TextView by lazy {
        findViewById(R.id.tv_luas_persegi_panjang)
    }

    private val tvKelilingPersegiPanjang: TextView by lazy {
        findViewById(R.id.tv_keliling_persegi_panjang)
    }

    private val tvLuasSegitiga: TextView by lazy {
        findViewById(R.id.tv_luas_segitiga)
    }

    private val tvKelilingSegitiga: TextView by lazy {
        findViewById(R.id.tv_keliling_segitiga)
    }

    private val persegi: Persegi by lazy {
        Persegi(5.0, 5.0)
    }

    private val persegiPanjang: PersegiPanjang by lazy {
        PersegiPanjang(10.0, 5.0)
    }

    private val segitiga: Segitiga by lazy {
        Segitiga(7.0, 9.0,10.0)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Persegi
        val luasPersegi = persegi.luas()
        val kelilingPersegi = persegi.keliling()

        tvLuasPersegi.text = "$luasPersegi"
        tvKelilingPersegi.text = "$kelilingPersegi"


        //Persegi Panjang
        val luasPersegiPanjang = persegiPanjang.luas()
        val kelilingPersegiPanjang = persegiPanjang.keliling()

        tvLuasPersegiPanjang.text = "$luasPersegiPanjang"
        tvKelilingPersegiPanjang.text = "$kelilingPersegiPanjang"

        //Segitiga
        val luasSegitiga = segitiga.luas()
        val kelilingSegitiga = segitiga.keliling()

        tvLuasSegitiga.text = "$luasSegitiga"
        tvKelilingSegitiga.text = "$kelilingSegitiga"
    }
}