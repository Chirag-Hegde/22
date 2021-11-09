package com.example.myapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.ButtonBarLayout
import androidx.fragment.app.Fragment
import com.example.myapplication.fragments.FavouriteFragment
import com.example.myapplication.fragments.HomeFragment
import com.example.myapplication.fragments.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import org.w3c.dom.Text
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


class home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val HomeFragment = HomeFragment()
        val FavouriteFragment = FavouriteFragment()
        val SettingFragment = SettingFragment()

        makeCurrentFragment(HomeFragment)
        val bottom_Navigation = findViewById(R.id.bottom_navigation)  as com.google.android.material.bottomnavigation.BottomNavigationView

        bottom_Navigation.setOnNavigationItemSelectedListener{
            when (it.itemId) {
                R.id.ic_home -> makeCurrentFragment (HomeFragment)
                R.id.ic_excercise -> makeCurrentFragment(FavouriteFragment)
                R.id.ic_dietplan -> makeCurrentFragment(SettingFragment)
            }
            true
        }

        val btn_add = findViewById<TextView>(R.id.btn_add)
        btn_add.setOnClickListener{
            val intent = Intent(this, med2::class.java)
            startActivity(intent)
            finish()
        }

        val ic_dietplan = findViewById<BottomNavigationItemView>(R.id.ic_dietplan)
        ic_dietplan.setOnClickListener{
            val intent = Intent(this, dietplan::class.java)
            startActivity(intent)
            finish()
        }

        val ic_excercise = findViewById<BottomNavigationItemView>(R.id.ic_excercise)
        ic_excercise.setOnClickListener{
            val intent = Intent(this, workout1::class.java)
            startActivity(intent)
            finish()

        }

        //trial()

    }

    /*private fun trial() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val date = c.get(Calendar.DAY_OF_MONTH)
        val day = c.get(Calendar.DAY_OF_YEAR)

        val tv_date = findViewById<TextView>(R.id.tv_date)
        tv_date.setText(date.toString())

        val tv_month = findViewById<TextView>(R.id.tv_month)
        tv_month.setText(month.toString())

        val tv_day = findViewById<TextView>(R.id.tv_day)
        tv_day.setText(day.toString())

        val tv_year = findViewById<TextView>(R.id.tv_year)
        tv_year.setText(year.toString())

    }*/

    private fun makeCurrentFragment(fragment: Fragment) =

    supportFragmentManager.beginTransaction().apply {
        replace(R.id.fl_wrapper, fragment)
        commit()
    }


}