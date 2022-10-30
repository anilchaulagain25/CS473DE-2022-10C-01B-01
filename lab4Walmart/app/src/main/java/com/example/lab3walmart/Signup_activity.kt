package com.example.lab3walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Signup_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    fun onSignupClick(view: View) {
        val firstNameET = findViewById<EditText>(R.id.etFirstName)
        val lastNameET = findViewById<EditText>(R.id.etLastName)
        val emailET = findViewById<EditText>(R.id.etEmail)
        val pwdET = findViewById<EditText>(R.id.etPwd)

        val firstName = firstNameET.text.toString()
        val lastName = lastNameET.text.toString()
        val email = emailET.text.toString()
        val pwd = pwdET.text.toString()
        if (firstName.isNullOrBlank()) {
            Toast.makeText(this, "Please enter first name", Toast.LENGTH_LONG).show()
        } else if (lastName.isNullOrBlank()) {
            Toast.makeText(this, "Please enter last name", Toast.LENGTH_LONG).show()
        } else if (email.isNullOrBlank()) {
            Toast.makeText(this, "Please enter email", Toast.LENGTH_LONG).show()
        } else if (pwd.isNullOrBlank()) {
            Toast.makeText(this, "Please enter Password", Toast.LENGTH_LONG).show()
        } else {
            val user = User(firstName, lastName, email, pwd);
            MainActivity.users().add(user);
            Toast.makeText(this, "User created successfully", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}