package com.example.tplesson412

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button = findViewById<Button>(R.id.button3)


        button.setOnClickListener {
            button.setTextColor(ContextCompat.getColor(this,R.color.black))

            val intent = Intent(this, MediaService::class.java)
            stopService(intent)

        }

    }
}

