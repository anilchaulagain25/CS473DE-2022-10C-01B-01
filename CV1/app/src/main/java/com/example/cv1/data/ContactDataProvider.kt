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
            "mail@anilc.com.np", "Email", "",
            R.drawable.mail,
            AdditionalData(Intent.ACTION_VIEW, "mail:anilchaulagain25@gmail.com")
        ),
        CardItemWithImageModel(
            "anilchaulagain.com.np/", "Website", "",
            R.drawable.website,
            AdditionalData(Intent.ACTION_VIEW, "https://anilchaulagain.com.np/")
        ),
        CardItemWithImageModel(
            "in/anil-chaulagain", "Linkedin", "",
            R.drawable.linkedin,
            AdditionalData(Intent.ACTION_VIEW, "https://www.linkedin.com/in/anil-chaulagain/")

        ),
        CardItemWithImageModel(
            "@anilchaulagain25", "Github", "",
            R.drawable.github,
            AdditionalData(Intent.ACTION_VIEW, "https://github.com/anilchaulagain25")
        ),
        CardItemWithImageModel(
            "Resume.pdf", "Resume", "",
            R.drawable.resume,
            AdditionalData(Intent.ACTION_VIEW, "https://www.linkedin.com/in/anil-chaulagain/")
        )
    )


    fun contactInfo() = contactInfo


}