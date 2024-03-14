package com.example.lidya

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity8 : AppCompatActivity() {

    private lateinit var fab6: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        inialztion()

        fab6.setOnClickListener {
            val intent = (Intent(this, MainActivity6::class.java))
            startActivity(intent)
        }
    }


        private fun inialztion() {
            fab6 = findViewById(R.id.fab6)
        }
}