package com.example.projectmobile8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun halLogin(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@LoginActivity, HalamanUtama::class.java)
        startActivity(intent)
    }
    fun halRegister(view: View) {
        // Memulai aktivitas tujuan
        val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
        startActivity(intent)
    }
}