package com.example.cv1.model

data class CardItemWithImageModel(
    val title: String,
    val subTitle: String,
    val description: String,
    val imgId: Int,
    var additionalData: AdditionalData? = null
) {
}

data class AdditionalData(val intent: String, val url: String)