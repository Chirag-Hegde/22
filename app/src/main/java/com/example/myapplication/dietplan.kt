package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class dietplan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dietplan)

        val ic_excercise = findViewById<BottomNavigationItemView>(R.id.ic_excercise)
        ic_excercise.setOnClickListener{
            val intent = Intent(this, workout1::class.java)
            startActivity(intent)
            finish()
        }

        val ic_home = findViewById<BottomNavigationItemView>(R.id.ic_home)
        ic_home.setOnClickListener{
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()
        }
    }
}