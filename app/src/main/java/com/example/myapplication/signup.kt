package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.lang.reflect.Array.get

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val btn_signup = findViewById<TextView>(R.id.btn_signup)

        btn_signup.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}

/*class FirstFragment : Fragment() {

    private var binding :FragmentFirstBinding? = null
    private  var binding = get() = binding!!

    override fun onCreateView(
        inflator : LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflator,container,false)
        val genders = resources.getStringArray(R.array.genders)
    }*/

