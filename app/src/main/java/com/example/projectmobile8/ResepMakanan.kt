package com.example.projectmobile8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ResepMakanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resep_makanan)
    }

    fun kembali(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@ResepMakanan, ProdukRekomendasi::class.java)
        startActivity(intent)
    }
}