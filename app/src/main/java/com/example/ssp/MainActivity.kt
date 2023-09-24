package com.example.ssp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

enum class Options(s: String) {
        STONE("Камень"),
        SCISSORS("Ножницы"),
        PAPER("Бумага")

}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_stone = findViewById<ImageButton>(R.id.btn_stone)
        val btn_scissors = findViewById<ImageButton>(R.id.btn_scissors)
        val btn_paper = findViewById<ImageButton>(R.id.btn_paper)
        btn_stone.setOnClickListener { logics(Options.STONE) }
        btn_scissors.setOnClickListener { logics(Options.SCISSORS) }
        btn_paper.setOnClickListener { logics(Options.PAPER) }


    }
    fun logics(playerChoice: Options){
        val computerChoice = Options.values().random()
        val result = when {
            playerChoice == computerChoice -> "Ничья!"
            playerChoice == Options.STONE && computerChoice == Options.SCISSORS -> "Вы победили!"
            playerChoice == Options.SCISSORS && computerChoice == Options.PAPER -> "Вы победили!"
            playerChoice == Options.PAPER && computerChoice == Options.STONE -> "Вы победили!"
            else -> "Компьютер победил!"
        }
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
    }




}