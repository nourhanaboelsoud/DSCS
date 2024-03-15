package com.example.lidya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity5 : AppCompatActivity() {

    private lateinit var fab4: FloatingActionButton
    private lateinit var btn9: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        inialztion()
        
        fab4.setOnClickListener {
            val intent = (Intent(this, MainActivity::class.java))
            startActivity(intent)
        }

        btn9.setOnClickListener {
            val intent2 = (Intent(this, MainActivity6::class.java))
            startActivity(intent2)
        }

    }
            private fun inialztion() {
                fab4 = findViewById(R.id.fab4)
                btn9 = findViewById(R.id.btn9)
            }


    }


