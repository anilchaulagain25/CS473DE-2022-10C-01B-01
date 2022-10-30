package com.example.lab3walmart

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
        when (view.id){
            R.id.ivElectronics->
                Toast.makeText(this,"You have chosen the Electronics category of shopping",Toast.LENGTH_LONG).show()
            R.id.ivClothes->
                Toast.makeText(this,"You have chosen the Clothing category of shopping",Toast.LENGTH_LONG).show()
            R.id.ivBeauty->
                Toast.makeText(this,"You have chosen the Beauty category of shopping",Toast.LENGTH_LONG).show()
            R.id.ivFood->
                Toast.makeText(this,"You have chosen the Food category of shopping",Toast.LENGTH_LONG).show()
        }
    }
}