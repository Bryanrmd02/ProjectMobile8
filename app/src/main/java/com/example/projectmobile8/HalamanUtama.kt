package com.example.projectmobile8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)
    }

    fun halRekomendasi(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@HalamanUtama, RekomMakananUmur::class.java)
        startActivity(intent)
    }
//
//    fun halKalkulatorBeratIdeal(view: View) {
//        // Memulai aktivitas tujuan
//        val intent = Intent(this@HalamanUtama, KalkulatorBeratIdeal::class.java)
//        startActivity(intent)
//    }
//
//    fun halHitungGizi(view: View) {
//        // Memulai aktivitas tujuan
//        val intent = Intent(this@HalamanUtama, KalkulatorGiziAnak::class.java)
//        startActivity(intent)
//    }
//
//    fun halResep(view: View) {
//        // Memulai aktivitas tujuan
//        val intent = Intent(this@HalamanUtama, HalamanResep::class.java)
//        startActivity(intent)
//    }
//
//    fun halProfile(view: View) {
//        // Memulai aktivitas tujuan
//        val intent = Intent(this@HalamanUtama, ProfileActivity::class.java)
//        startActivity(intent)
//    }
//
//    fun halApel(view: View) {
//        // Memulai aktivitas tujuan
//        val intent = Intent(this@HalamanUtama, HalamanApel::class.java)
//        startActivity(intent)
//    }
}