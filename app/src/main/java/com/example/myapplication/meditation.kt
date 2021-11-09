package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meditation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation)

        val button = findViewById<TextView>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
    }
}