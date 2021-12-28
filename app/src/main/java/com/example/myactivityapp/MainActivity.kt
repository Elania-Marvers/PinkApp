package com.example.myactivityapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.start_activity_pink_button)
        button.setOnClickListener {
            println("Yeay !")
            val intent = Intent(this, PinkActivity::class.java) // je déclare l'envie de lancer la pinkActivity
            startActivity(intent) // je l'active
            
        }
    }
}