package com.example.cv1.data

import com.example.cv1.R
import com.example.cv1.model.CardItemModel
import com.example.cv1.model.CardItemWithImageModel

class AboutMeDataProvider {
    private val educationInfo = arrayListOf(
        CardItemWithImageModel(
            "Maharishi International University", "MSc. Computer Science", "05/2021 - 12/2023",
            R.drawable.miu
        ),
        CardItemWithImageModel(
            "Tribhuvan University", "BSc.CSIT", "09/2014 - 09/2018",
            R.drawable.tu
        )
    )
    private val certificationInfo = arrayListOf(
        CardItemWithImageModel(
            "Exam AZ-204: Azure Certification", "11/2022", "",
            R.drawable.azure204
        ),
        CardItemWithImageModel(
            "AWS Architect Certification", "12/2022", "",
            R.drawable.aws
        )
    )
    private val aboutMeInfo = arrayListOf(
        CardItemModel(
            "About Me", "Motivated Full Stack .NET Developer with 4.5 years of hands-on professional experience leading teams in creating effective technical solutions that streamline business operations and improve processes. "
        )
    )

    fun educationInfo() = educationInfo

    fun aboutMeInfo() = aboutMeInfo

    fun certificationInfo() = certificationInfo



}