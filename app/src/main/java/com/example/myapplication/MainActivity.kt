package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        /*val btn_start = findViewById<TextView>(R.id.btn_start)
        val til_password = findViewById<TextView>(R.id.til_password)

        btn_start.setOnClickListener {
            val et_username = findViewById<TextView>(R.id.et_username)
            if (et_username.text.toString().isEmpty()) {
                Toast.makeText(this, "Please Enter your username",
                    Toast.LENGTH_SHORT).show()
            } else if (til_password.text.toString().isEmpty()) {
                Toast.makeText(this, "Please Enter your Password",
                    Toast.LENGTH_SHORT).show()
            } else {
                /*val intent = Intent(this, signup::class.java)
                startActivity(intent)
                finish()*/
            }

            btn_start.setOnTouchListener { v, event ->
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                        v.invalidate()
                    }
                    MotionEvent.ACTION_UP -> {
                        v.background.clearColorFilter()
                        v.invalidate()
                    }
                }
                false
            }*/
        val btn_login = findViewById<TextView>(R.id.btn_login)

        btn_login.setOnClickListener{
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
            finish()
        }

        val btn_start = findViewById<TextView>(R.id.btn_start)
        btn_start.setOnClickListener{
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }



}}