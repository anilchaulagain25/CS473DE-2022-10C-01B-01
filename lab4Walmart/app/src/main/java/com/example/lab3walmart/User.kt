package com.example.lab3walmart

class User(
    val _firstName: String,
    val _lastName: String,
    val _userName: String,
    val _password: String
) {
    // Member Variables
    var firstName: String
    var lastName: String
    var userName: String
    var password: String

    // Initializer Block
    init {
        this.firstName = _firstName
        this.lastName = _lastName
        this.userName = _userName
        this.password = _password
        println("First Name = $firstName")
        println("Last Name = $lastName")
        println("Username = $userName")
        println("Password = $password")
    }
}