package com.example.lidya

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity4 : AppCompatActivity() {

    private lateinit var btn7 : Button
    private lateinit var btn8 : Button
    private lateinit var fab3: FloatingActionButton

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        inialztion()



        btn7.setOnClickListener {
            val intent2 = (Intent(this, MainActivity6::class.java))
            startActivity(intent2)

        }

        btn8.setOnClickListener {
            val intent1 = (Intent(this, MainActivity5::class.java))
            startActivity(intent1)


        }

       fab3.setOnClickListener {
            val intent = (Intent(this, MainActivity2::class.java))
            startActivity(intent)
        }
    }

    private fun inialztion() {
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        fab3 = findViewById(R.id.fab3)
    }
}


