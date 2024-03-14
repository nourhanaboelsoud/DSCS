package com.example.lidya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {

    private lateinit var  btn10 : Button
    private lateinit var  btn11 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        inialztion()


        btn10.setOnClickListener {
            val intent = (Intent(this, MainActivity8::class.java))
            startActivity(intent)
        }

        btn11.setOnClickListener {
            val intent = (Intent(this, MainActivity6::class.java))
            startActivity(intent)
        }
    }

    private fun inialztion()
    {
        btn10 = findViewById(R.id.btn10)
        btn11 = findViewById(R.id.btn11)

    }
}
