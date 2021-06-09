package com.example.aplikar

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Identitas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identitas)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val identitas: Button = findViewById(R.id.btn_identitas)
        val txNama: TextView = findViewById(R.id.et_nama)
        val txkelas: TextView = findViewById(R.id.et_kelas)

        identitas.setOnClickListener {
            if(txNama.text.toString().isEmpty()){
                Toast.makeText(this,"Silahkan isi nama anda",Toast.LENGTH_SHORT).show()
            } else if (txkelas.text.toString().isEmpty()){
                Toast.makeText(this, "Silahkan isi kelas anda",Toast.LENGTH_SHORT).show()
            } else{
                val intent = Intent(this, TahapSatu::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}