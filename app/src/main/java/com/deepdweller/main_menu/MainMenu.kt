package com.deepdweller.main_menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Переход на активность Continue
        val continue_game = findViewById<Button>(R.id.b_continue)
        continue_game.setOnClickListener {
            val perehod = Intent(this, Continue::class.java)
            startActivity(perehod)
        }


        //Переход на активность NewGame
        val new_game = findViewById<Button>(R.id.b_new_game)
        new_game.setOnClickListener {
            val perehod = Intent(this, NewGame::class.java)
            startActivity(perehod)
        }


        //Переход на активность Loading
        val loading_game = findViewById<Button>(R.id.b_load_game)
        loading_game.setOnClickListener {
            val perehod = Intent(this, Loading::class.java)
            startActivity(perehod)
        }


        //Переход на активность Options
        val game_options = findViewById<Button>(R.id.b_options)
        game_options.setOnClickListener {
            val perehod = Intent(this, Options::class.java)
            startActivity(perehod)
        }



    }
}