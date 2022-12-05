package com.example.cv1.data

import com.example.cv1.R
import com.example.cv1.model.HomeInfo
import com.example.cv1.model.ItemWithImageModel

class AboutMeDataProvider {
    private val educationInfo = arrayListOf(
        ItemWithImageModel(
            "Maharishi International University", "Master of Science in Computer Science", "05/2021 - 12/2023",
            R.drawable.miu
        ),
        ItemWithImageModel(
            "Tribhuvan University", "Bachelor of Science in Computer Science and Information Technology", "09/2014 - 09/2018",
            R.drawable.tu
        )
    )

    fun educationInfo() = educationInfo



}