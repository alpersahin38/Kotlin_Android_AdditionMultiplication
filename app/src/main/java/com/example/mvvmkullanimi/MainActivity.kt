package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarım:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarım = DataBindingUtil.setContentView(this,R.layout.activity_main)

        tasarım.textViewResult.text = "0"
        tasarım.buttonCollection.setOnClickListener{
            val tonumber1 = tasarım.editTextNumber1.text.toString();
            val tonumber2 = tasarım.editTextNumber2.text.toString();

            val number1 = tonumber1.toInt()
            val number2 = tonumber2.toInt()

            val resultInt = number1 + number2

            val result = resultInt.toString()

            tasarım.textViewResult.text = result



        }

        tasarım.buttonMultiplication.setOnClickListener{
            val canumber1 = tasarım.editTextNumber1.text.toString();
            val canumber2 = tasarım.editTextNumber2.text.toString();

            val number1 = canumber1.toInt()
            val number2 = canumber2.toInt()

            val resultInt = number1 * number2

            val result = resultInt.toString()

            tasarım.textViewResult.text = result
        }
    }
}