package com.example.lidya

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity3 : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main3)


            val btn7 = findViewById<Button>(R.id.btn6)
              val  btn5 = findViewById<Button>(R.id.btn8)


            btn7.setOnClickListener {
                val intent2 = (Intent(this, MainActivity6::class.java))
                startActivity(intent2)

            }

        btn5.setOnClickListener {
            val intent1 = (Intent(this, MainActivity5::class.java))
            startActivity(intent1)

        }

        }
    }

