package com.example.gdsc_ws2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val puanO1TextView = findViewById<TextView>(R.id.puanO1)
        val puanO2TextView = findViewById<TextView>(R.id.puanO2)
        val zarAtButonu = findViewById<Button>(R.id.zarAt)
        val resetButonu = findViewById<Button>(R.id.reset)

        var raund = 1
        var puan1 = 0
        var puan2 = 0
        zarAtButonu.setOnClickListener {
            if (raund == 4){
                puanO1TextView.text = "GG puan = " + puan1.toString()
                puanO2TextView.text = "GG puan = " + puan2.toString()
            }
            else{
                var rnd = Random.nextInt(1,6)
                if (raund % 2 != 0){
                    puan1 += rnd
                    puanO1TextView.text = "puan = " + puan1.toString()
                }
                else{
                    puan2 += rnd
                    puanO2TextView.text = "puan = " + puan2.toString()
                }
                zarGorselDegitir(rnd)
                raund += 1
            }
        }

        resetButonu.setOnClickListener {
            raund = 0
            puan1 = 0
            puan2 = 0

            puanO1TextView.text = "puan = 0"
            puanO2TextView.text = "puan = 0"
        }

    }


    fun zarGorselDegitir (deger: Int){
        val zarResimi = findViewById<ImageView>(R.id.zarResimi)
        when(deger) {
            1 -> zarResimi.setImageResource(R.drawable.dice_1)
            2 -> zarResimi.setImageResource(R.drawable.dice_2)
            3 -> zarResimi.setImageResource(R.drawable.dice_3)
            4 -> zarResimi.setImageResource(R.drawable.dice_4)
            5 -> zarResimi.setImageResource(R.drawable.dice_5)
            6 -> zarResimi.setImageResource(R.drawable.dice_6)
        }
    }
}