package com.example.lidya

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn3)
        val btn2 = findViewById<Button>(R.id.btn4)


        btn1.setOnClickListener {
            val intent = (Intent(this, MainActivity2::class.java))
            startActivity(intent)
        }


        btn2.setOnClickListener {
            val intent2 = (Intent(this, MainActivity5::class.java))
            startActivity(intent2)
        }
    }

    }
