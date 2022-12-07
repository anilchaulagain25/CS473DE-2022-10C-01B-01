package com.example.cv1.data

import android.content.Intent
import com.example.cv1.R
import com.example.cv1.model.AdditionalData
import com.example.cv1.model.CardItemWithImageModel

class ContactDataProvider {
    private val contactInfo = arrayListOf(
        CardItemWithImageModel(
            "+1-641-819-1494", "Phone", "",
            R.drawable.resume,
            AdditionalData(Intent.ACTION_CALL, "tel:6418191494")
        ),
        CardItemWithImageModel(
            "anilchaulagain25@gmail.com", "Email", "",
            R.drawable.mail,
            AdditionalData(Intent.ACTION_VIEW, "mail:https://anilchaulagain.com.np/")
        ),
        CardItemWithImageModel(
            "https://anilchaulagain.com.np/", "Website", "",
            R.drawable.website,
            AdditionalData(Intent.ACTION_VIEW, "https://anilchaulagain.com.np/")
        ),
        CardItemWithImageModel(
            "https://www.linkedin.com/in/anil-chaulagain/", "Linkedin", "",
            R.drawable.linkedin,
            AdditionalData(Intent.ACTION_VIEW, "https://www.linkedin.com/in/anil-chaulagain/")

        ),
        CardItemWithImageModel(
            "https://github.com/anilchaulagain25", "Github", "",
            R.drawable.github,
            AdditionalData(Intent.ACTION_VIEW, "https://github.com/anilchaulagain25")
        ),
        CardItemWithImageModel(
            "Anil Chaulagain Resume.pdf", "Resume", "",
            R.drawable.resume,
            AdditionalData(Intent.ACTION_VIEW, "https://www.linkedin.com/in/anil-chaulagain/")
        )
    )


    fun contactInfo() = contactInfo


}