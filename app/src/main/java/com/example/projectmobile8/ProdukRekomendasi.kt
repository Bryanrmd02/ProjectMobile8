package com.example.projectmobile8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProdukRekomendasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk_rekomendasi)
    }

    fun kembali(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@ProdukRekomendasi, RekomMakananUmur::class.java)
        startActivity(intent)
    }

    fun halResepMakanan(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@ProdukRekomendasi, ResepMakanan::class.java)
        startActivity(intent)
    }
}