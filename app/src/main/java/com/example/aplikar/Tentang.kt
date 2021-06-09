package com.example.aplikar

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Tentang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val tentangToMenuUtama: Button = findViewById(R.id.btn_tentang_to_menu)

        tentangToMenuUtama.setOnClickListener {
            val intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
            finish()
        }
    }
}