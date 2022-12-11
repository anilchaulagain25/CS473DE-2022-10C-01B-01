package com.example.cv1.data

import android.content.Intent
import com.example.cv1.R
import com.example.cv1.model.AdditionalData
import com.example.cv1.model.CardItemModel
import com.example.cv1.model.CardItemWithImageModel
import com.example.cv1.model.UserInfo

class UserInfoDataProvider {
    private val userInfo = arrayListOf(
        UserInfo(
            1, "achaulagain@miu.edu", "anil123", "Anil Chaulagain","Software Engineer"
        ),
        UserInfo(
            2, "prajitaregmi25@gmail.com", "prajita123", "Prajita Regmi","Account Controller"
        ),
    )


    fun userInfo() = userInfo


}