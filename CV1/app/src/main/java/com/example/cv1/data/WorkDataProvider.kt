package com.example.cv1.data

import android.content.Intent
import com.example.cv1.R
import com.example.cv1.model.AdditionalData
import com.example.cv1.model.CardItemModel
import com.example.cv1.model.CardItemWithImageModel

class WorkDataProvider {
    private val workInfo = arrayListOf(
        CardItemWithImageModel(
            "AAMVA", "Software Engineer", "02/2022 - Now\n" +
                    "Arlington, VA\n" +
                    "-Software Development\n" +
                    "-Software Deployment\n" +
                    "-Unit testing and integration testing",
            R.drawable.aamva,
            AdditionalData(Intent.ACTION_VIEW, "http://www.anilcahulagain.com.np")
        ),
        CardItemWithImageModel(
            "Verisk", "Software Engineer", "07/2020 - 04/2021\n" +
                    "Lalitpur, Nepal\n" +
                    "-Production Support\n" +
                    "-Software Deployment\n" +
                    "-Unit testing and integration testing",
            R.drawable.verisk
        ),
        CardItemWithImageModel(
            "InfoDevelopers", "Software Engineer", "05/2018 - 04/2020\n" +
                    "Lalitpur, Nepal\n" +
                    "-Team leading\n" +
                    "-Software Deployment\n" +
                    "-Unit testing and integration testing",
            R.drawable.infodevelopers
        )
    )


    fun workInfo() = workInfo


}