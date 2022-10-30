package com.example.lab3walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object {

        fun users(): ArrayList<User> {

            return arrayListOf<User>(
                User("Anil", "Chaulagain", "achaulagain@miu.edu", "Anil123"),
                User("Sushil", "Chaulagain", "achaulagain@miu.edu", "Anil123"),
                User("Sujana", "Chaulagain", "sujchaulagain@miu.edu", "Sujanal123"),
                User("Samjhana", "Chaulagain", "sachaulagain@miu.edu", "Samjhana123"),
                User("TaRam", "Chaulagain", "taramchaulagain@miu.edu", "TaRam123")
            )

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun logInOnClick(view: View) {
        var username = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var password = findViewById<EditText>(R.id.editTextTextPassword)
        var user: User? =
            MainActivity.users()
                .find { it.userName.equals(username.text.toString()) && it.password.equals(password.text.toString()) }
        if (user == null) {
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Correct credentials", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Shopping_activity::class.java)
            intent.putExtra("username", username.text.toString())
            startActivity(intent)
        }
    }

    fun goToSignup(view: View) {
        val intent = Intent(this, Signup_activity::class.java)
        startActivity(intent)
    }
}