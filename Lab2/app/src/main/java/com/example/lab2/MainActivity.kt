package com.example.lab2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //availableFoods=arrayOf("")
    var availableFoods = arrayListOf<String>(
        "Hamburger", "Pizza",
        "Mexican", "American", "Chinese"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDecideClick(view: View) {
        val tvFoodName = findViewById<TextView>(R.id.tvFoodName);
        tvFoodName.text = availableFoods.random();
    }

    fun onAddFood(view: View) {
        var editTextFoodName   = findViewById<EditText>(R.id.editTextFoodName);
        availableFoods.add(editTextFoodName.text.toString());
    }
}