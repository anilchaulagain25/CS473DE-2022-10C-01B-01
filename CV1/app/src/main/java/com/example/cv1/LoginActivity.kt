package com.example.cv1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cv1.data.UserInfoDataProvider
import com.example.cv1.model.UserInfo


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun login(view: View) {
        val emailTV = findViewById<TextView>(R.id.etEmail)
        val passwordTV = findViewById<TextView>(R.id.editTextTextPassword)

        val email = emailTV.text
        val pwd = passwordTV.text

        var errMsg: String? = null;
        if (email == null || email.trim() == "") {
            errMsg = "Please enter email";
        } else if (pwd == null) {
            errMsg = "Please enter email";
        } else if (email.length < 5) {
            errMsg = "Email length must be equal or greater than 5 characters"
        } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            errMsg = "Incorrect email address format"
        } else if (pwd.length < 5) {
            errMsg = "Password length must be equal or greater than 5 characters"
        }
        if (errMsg != null) {
            Toast.makeText(this, errMsg, Toast.LENGTH_SHORT).show();
            return;
        }
        var users = UserInfoDataProvider().userInfo();
        val userInfo =
            users.filter { it.email == email && it.pwd == pwd }

        if (userInfo == null || userInfo.isEmpty()) {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            return;
        } else {


            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

        }


    }
}