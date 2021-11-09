package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class workout1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout1)

        val doneButton = findViewById<TextView>(R.id.doneButton)
        doneButton.setOnClickListener{
            val intent = Intent(this, meditation::class.java)
            startActivity(intent)
            finish()
        }

        val ic_dietplan = findViewById<BottomNavigationItemView>(R.id.ic_dietplan)
        ic_dietplan.setOnClickListener{
            val intent = Intent(this, dietplan::class.java)
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