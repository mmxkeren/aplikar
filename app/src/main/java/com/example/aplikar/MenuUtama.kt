package com.example.aplikar

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MenuUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val biografi: Button = findViewById(R.id.btn_biografi)
        val tentang: Button = findViewById(R.id.btn_tentang)
        val petunjuk: Button = findViewById(R.id.btn_petunjuk)
        val karier: Button = findViewById(R.id.btn_karier)
        val off: Button = findViewById(R.id.btn_off)

        biografi.setOnClickListener {
            val intent = Intent(this, Biografi::class.java)
            startActivity(intent)
            finish()
        }

        tentang.setOnClickListener {
            val intent = Intent(this, Tentang::class.java)
            startActivity(intent)
            finish()
        }

        petunjuk.setOnClickListener {
            val intent = Intent(this, Petunjuk::class.java)
            startActivity(intent)
            finish()
        }

        karier.setOnClickListener {
            val intent = Intent(this, Karier::class.java)
            startActivity(intent)
            finish()
        }

        off.setOnClickListener {
            onDestroy()
            finish()
        }


    }
}