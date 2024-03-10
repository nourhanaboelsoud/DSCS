package com.example.lidya

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity2 : AppCompatActivity() {
   lateinit var  btn3 : Button
   lateinit var  btn4 : Button
   lateinit var fab1 : FloatingActionButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

      inialztion()


        btn3.setOnClickListener {
            val intent = (Intent(this, MainActivity3::class.java))
            startActivity(intent)
        }


        btn4.setOnClickListener {
            val intent2 = (Intent(this, MainActivity4::class.java))
            startActivity(intent2)
        }
        fab1.setOnClickListener {
            val intent = (Intent(this, MainActivity::class.java))
            startActivity(intent)
        }

        }
        private fun inialztion()
        {
            btn3 = findViewById(R.id.btn3)
            btn4 = findViewById(R.id.btn4)
            fab1 = findViewById(R.id.fab1)

        }
    }









