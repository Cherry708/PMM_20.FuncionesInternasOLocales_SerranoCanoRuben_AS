package com.example.pmm_20funcionesinternasolocales_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private fun multiple(number0:Int, multipleOf:Int):Boolean{
        return (number0 % multipleOf) == 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber0 = findViewById<EditText>(R.id.etNumber10)
        val etNumber1 = findViewById<EditText>(R.id.etNumber11)
        val etNumber2 = findViewById<EditText>(R.id.etNumber12)
        val tvResult = findViewById<TextView>(R.id.tvResult10)

        val btnCalculate = findViewById<Button>(R.id.btnCalculate10)
        btnCalculate.setOnClickListener {
            val number0 = etNumber0.text.toString().toInt()
            val number1 = etNumber1.text.toString().toInt()
            val number2 = etNumber2.text.toString().toInt()

            var twoMultipleCounter = 0
            var fiveMultipleCounter = 0

            if(multiple(number0,2))
                twoMultipleCounter++
            if(multiple(number0,5))
                fiveMultipleCounter++
            if(multiple(number1,2))
                twoMultipleCounter++
            if(multiple(number1,5))
                fiveMultipleCounter++
            if(multiple(number2,2))
            twoMultipleCounter++
            if(multiple(number2,2))
            fiveMultipleCounter++


            val result = "There are $twoMultipleCounter multiples of 2 and $fiveMultipleCounter multiples of 5"
            tvResult.text = result

        }

    }
}
