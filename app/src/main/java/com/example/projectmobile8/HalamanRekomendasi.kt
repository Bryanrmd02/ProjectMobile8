package com.example.projectmobile8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanRekomendasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_rekomendasi)
    }

    fun kembali(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@HalamanRekomendasi, HalamanUtama::class.java)
        startActivity(intent)
    }

    fun halProdukRekomendasi(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@HalamanRekomendasi, ProdukRekomendasi::class.java)
        startActivity(intent)
    }
}