package com.example.projectmobile8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun halLogin(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(intent)
    }

    fun halRegister(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@MainActivity, RegisterActivity::class.java)
        startActivity(intent)
    }

}