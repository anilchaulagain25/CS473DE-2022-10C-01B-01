package com.example.cv1.data

import com.example.cv1.model.CardItemModel

class HomeInfoDataProvider {
    private val getHomeInfo = arrayListOf(
        CardItemModel(
            "Career note", "Working as a full stack .NET developers in " +
                    "American Association of Motor Vehicle Administrators, Looking for Senior full stack .NET positions in Log Angeles (CA) bay area."
        ),
        CardItemModel(
            "Skills", "Language: C#, .NET, JavaScript\n" +
                    "Framework: .NET Core, Angular\n" +
                    "Tools: Visual Studio, Notepad++\n" +
                    "DataBase: MSSql, MySQL"
        )
    )

    fun getHomeInfo() = getHomeInfo

}