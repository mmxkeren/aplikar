package com.example.aplikar

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Hasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val tryagain: Button = findViewById(R.id.btn_tryagain)
        val hasiltomenu: Button = findViewById(R.id.btn_hasil_to_menu)

        tryagain.setOnClickListener {
            val intent = Intent(this, Identitas::class.java)
            startActivity(intent)
            finish()
        }

        hasiltomenu.setOnClickListener {
            val intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
            finish()
        }
    }
}