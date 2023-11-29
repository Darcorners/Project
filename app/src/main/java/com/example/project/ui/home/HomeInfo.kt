package com.example.project.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.project.R

class HomeInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_info)
        setTitle("Информация о доме")



        val buttonId = intent.getIntExtra("buttonId", 0)
        val Ecount = findViewById<TextView>(R.id.textView5)
        val Pcount = findViewById<TextView>(R.id.textView3)

        when (buttonId) {
            1 -> {
                Pcount.setText("7")
                Ecount.setText("13")
            }
            2 -> {
                Pcount.setText("3")
                Ecount.setText("13")
            }
            3 -> {
                Pcount.setText("3")
                Ecount.setText("9")
            }
            4 -> {
                Pcount.setText("2")
                Ecount.setText("16")
            }
        }

    }
}