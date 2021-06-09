package com.example.aplikar

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Biografi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biografi)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val bioToMenuUtama: Button = findViewById(R.id.btn_biografi_to_menu)

        bioToMenuUtama.setOnClickListener {
            val intent = Intent(this, MenuUtama::class.java)
            startActivity(intent)
            finish()
        }
    }
}