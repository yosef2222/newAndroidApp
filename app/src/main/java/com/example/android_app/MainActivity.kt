package com.example.android_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1EditText = findViewById<EditText>(R.id.num1EditText)
        val num2EditText = findViewById<EditText>(R.id.num2EditText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        calculateButton.setOnClickListener {
            val num1 = num1EditText.text.toString().toDouble()
            val num2 = num2EditText.text.toString().toDouble()

            val sum = num1 + num2
            val diff = num1 - num2
            val product = num1 * num2
            val quotient = num1 / num2

            resultTextView.text = "Sum: $sum\nDifference: $diff\nProduct: $product\nQuotient: $quotient"
        }

    }
}