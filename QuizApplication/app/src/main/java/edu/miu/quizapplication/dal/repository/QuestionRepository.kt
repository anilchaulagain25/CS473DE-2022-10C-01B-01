package edu.miu.quizapplication.dal.repository

import android.app.Application
import androidx.lifecycle.LiveData
import edu.miu.quizapplication.dal.QuizDAO
import edu.miu.quizapplication.dal.database.QuizDatabase
import edu.miu.quizapplication.dal.models.Question

class QuestionRepository(application: Application) {

    private var noteDao: QuizDAO
    private var allNotes: LiveData<List<Question>>

    private val database = QuizDatabase.getInstance(application)

    init {
        noteDao = database.noteDao()
        allNotes = noteDao.getAllQuestions()
    }
    fun getAllQuestions(): LiveData<List<Question>> {
        return allNotes
    }
}