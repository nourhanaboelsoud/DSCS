package com.example.lidya

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btn6 = findViewById<Button>(R.id.btn6)
        val btn8 = findViewById<TextView>(R.id.btn8)


        btn6.setOnClickListener {
            val intent2 = (Intent(this, MainActivity6::class.java))
            startActivity(intent2)

        }

        btn8.setOnClickListener {
            val intent1 = (Intent(this, MainActivity5::class.java))
            startActivity(intent1)


        }
    }
}