package com.example.gdsc_ws1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arttirButon = findViewById<Button>(R.id.arttir)
        val azaltButon = findViewById<Button>(R.id.azalt)
        val counterText = findViewById<TextView>(R.id.counterText)
        var sayac = 0
        var sayacYazi = "Sayaç = "
""
        arttirButon.setOnClickListener {
            sayac += 1
            counterText.text = sayacYazi + sayac.toString()
        }

        azaltButon.setOnClickListener {
            sayac -= 1
            counterText.text = sayacYazi + sayac.toString()
        }
    }
}