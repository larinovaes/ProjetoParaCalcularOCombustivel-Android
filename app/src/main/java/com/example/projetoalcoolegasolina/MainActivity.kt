package com.example.projetoalcoolegasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun calculoDeGasolinaEAlcool(): String {
        val gasolina = findViewById<EditText>(R.id.activity_gasolina)
        val alcool = findViewById<EditText>(R.id.activity_alcool)

        val melhorCombustivel = gasolina.text.toString().toDouble() * 0.70
        val converterAlcool = alcool.text.toString().toDouble()

        return if (melhorCombustivel < converterAlcool) {
            "Gasolina é melhor"
        } else {
            "Alcool é melhor"
        }
    }
}