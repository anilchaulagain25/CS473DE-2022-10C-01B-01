package edu.miu.quizapplication.dal.models

import androidx.room.Entity
//import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question")
data class Question(

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    var question: String,

    var option_one: String,
    var option_two: String,
    var option_three: String,
    var option_four: String,

    var correct_answer: String,
    var user_answer:String
)