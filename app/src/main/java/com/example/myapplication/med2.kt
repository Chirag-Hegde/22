package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class med2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_med2)

        val btn_restocking = findViewById<TextView>(R.id.btn_restocking)
        btn_restocking.setOnClickListener{
            val intent = Intent(this, med3::class.java)
            startActivity(intent)
            finish()
        }

        val btn_backtohome = findViewById<TextView>(R.id.btn_backtohome)
        btn_backtohome.setOnClickListener{
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }



    }
}