package edu.miu.quizapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import edu.miu.quizapplication.dal.models.Question
import edu.miu.quizapplication.dal.repository.QuestionRepository

class QuizViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = QuestionRepository(application)
    private val allQuestions = repository.getAllQuestions()

    fun getAllQuestions(): LiveData<List<Question>> {
        return allQuestions
    }
}