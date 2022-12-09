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
            "achaulagain@miu.edu", "anil123"
        ),
        UserInfo(
            "prajitaregmi25@gmail.com", "prajita123"
        ),
    )


    fun userInfo() = userInfo


}