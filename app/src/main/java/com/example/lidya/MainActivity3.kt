package com.example.lidya

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity3 : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    private lateinit var btn5 : Button
    private lateinit var btn6 : Button
    private lateinit var fab2 : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        inialztion()

        btn6.setOnClickListener {
            val intent2 = (Intent(this, MainActivity5::class.java))
            startActivity(intent2)

        }

        btn5.setOnClickListener {
            val intent1 = (Intent(this, MainActivity6::class.java))
            startActivity(intent1)

        }

       fab2.setOnClickListener {
            val intent = (Intent(this, MainActivity2::class.java))
            startActivity(intent)
        }
    }
    private fun inialztion()
    {
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        fab2 = findViewById(R.id.fab2)

    }
    }

