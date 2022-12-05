package com.example.cv1.data

import com.example.cv1.R
import com.example.cv1.model.HomeInfo
import com.example.cv1.model.ItemWithImageModel

class HomeInfoDataProvider {
    private val homeInfo = arrayListOf(
        HomeInfo(
            "Career note", "Working as a full stack .NET developers in " +
                    "American Association of Motor Vehicle Administrators, Looking for Senior full stack .NET positions in Log Angeles (CA) bay area."
        ),
        HomeInfo(
            "Skills", "Language: C#, .NET, JavaScript\n" +
                    "Framework: .NET Core, Angular\n" +
                    "Tools: Visual Studio, Notepad++\n" +
                    "DataBase: MSSql, MySQL"
        )
    )

    fun get() = homeInfo

}