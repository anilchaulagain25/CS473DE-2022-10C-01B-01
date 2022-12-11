package com.example.cv1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cv1.data.UserInfoDataProvider
import com.example.cv1.model.Constants
import com.example.cv1.model.Constants.isLoggedIn
import com.example.cv1.model.Constants.sharedPreferenceName
import com.example.cv1.model.Constants.userEmail
import com.example.cv1.model.Constants.userId
import com.example.cv1.model.Constants.userName
import com.example.cv1.model.Constants.userPwd
import com.example.cv1.model.Constants.userTitle
import com.example.cv1.model.UserInfo
import java.util.*


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val sharedPref = getSharedPreferences(sharedPreferenceName, 0)
        if (sharedPref.getBoolean(isLoggedIn, false)) {
            openMainPage()
        } else {
            initSharedPref(null, false);
        }
    }

    private fun openMainPage() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun initSharedPref(
        username: String?,
        isLoggedInUser: Boolean,
        name: String? = null,
        id: Int? = null,
        title: String? = null,
    ) {
        val sharedPref = getSharedPreferences(sharedPreferenceName, 0)
        val editor = sharedPref.edit()
        editor.putString(userEmail, username)
        editor.putString(userName, name)
        editor.putString(userTitle, title)
        editor.putString(userId, id.toString())
        editor.putBoolean(isLoggedIn, isLoggedInUser)
        editor.apply()
    }


    fun login(view: View) {
        val emailTV = findViewById<TextView>(R.id.etEmail)
        val passwordTV = findViewById<TextView>(R.id.editTextTextPassword)

        val email = emailTV.text.toString()
        val pwd = passwordTV.text.toString()

        val errMsg: String? = validate(email, pwd);
        if (errMsg != null) {
            Toast.makeText(this, errMsg, Toast.LENGTH_SHORT).show();
            return;
        }


        var users = UserInfoDataProvider().userInfo();
        val userInfo: UserInfo? =
            users.find { u ->
                u.email.lowercase() == email.lowercase() && u.pwd == pwd
            }

        if (userInfo == null) {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            return;
        } else {
            initSharedPref(
                email, true, userInfo.name, userInfo.id, userInfo.title
            );
            openMainPage();
        }
    }


    private fun validate(email: String, pwd: String): String? {
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
        return errMsg;

    }
}