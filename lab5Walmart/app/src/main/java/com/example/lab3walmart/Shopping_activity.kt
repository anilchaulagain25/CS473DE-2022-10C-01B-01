package com.example.lab3walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class Shopping_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val username: String = intent.getStringExtra("username").toString()

        val welcome = findViewById<TextView>(R.id.tvWelcome)
        welcome.text = "Welcome, $username";
    }

    fun chooseCategory(view: View) {

        val intent = Intent(this, Items_activity::class.java)
        startActivity(intent)
    }
}