package com.deepdweller.main_menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NewGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_game)

        val exit = findViewById<Button>(R.id.b_exit)
        exit.setOnClickListener {
            val perehod = Intent(this, MainMenu::class.java)
            startActivity(perehod)
        }
    }
}