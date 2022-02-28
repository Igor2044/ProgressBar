package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar


class MainActivity : AppCompatActivity() {
    val button = findViewById<Button>(R.id.buttonA)
    val maxNum = findViewById<EditText>(R.id.maxNumber)
    val progressB = findViewById<ProgressBar>(R.id.progressB)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var maxN: Int = maxNum.text.toString().toInt()
            progressB.max = maxN
            progressB.visibility = View.VISIBLE
        }
    }
}