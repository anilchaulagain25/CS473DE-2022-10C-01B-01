package com.example.lab3walmart

data class Product(
    var title: String,
    var price: Number,
    var color: String,
    var image // name of the image
    : Int,
    var itemid: String,
    var desc // Description of the product
    : String
)