package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            this.rollDice()
        }
    }

    private fun getRandomNum() = Random().nextInt(6) + 1

    private fun getDrawableDice(index: Number) = when (index) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    private fun getDrawableResources() = this.getDrawableDice(this.getRandomNum())

    private fun rollDice() {
        val diceImage1: ImageView = findViewById(R.id.dice_image_1)
        val diceImage2: ImageView = findViewById(R.id.dice_image_2)

        diceImage1.setImageResource(this.getDrawableResources())
        diceImage2.setImageResource(this.getDrawableResources())
    }
}