package edu.miu.quizapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import edu.miu.quizapplication.dal.models.Question
import edu.miu.quizapplication.dal.repository.QuestionRepository


class QuizViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = QuestionRepository(application)
    private val allQuestions = repository.getAllQuestions()


    private var question: Question? = null;
    private var questionLiveData = MutableLiveData<Question>()


    private var step: Int = 0
    private var stepLiveData = MutableLiveData<Pair<Int, Int>>()


    open fun getStep(): MutableLiveData<Pair<Int, Int>> {
        stepLiveData.value = Pair(step, allQuestions.size)
        return stepLiveData
    }


    open fun getQuestion(): MutableLiveData<Question> {
        questionLiveData.value = allQuestions[step]
        return questionLiveData
    }


    open fun submitUserAnswer(questionId: Int, userAnswer: Int) {
        repository.updateUserAnswer(questionId, userAnswer);
        step++
        stepLiveData.value = Pair(step, allQuestions.size)
        question = if (step == allQuestions.size) {
            null;
        } else {
            allQuestions[step];
        }
        questionLiveData.value = question
    }


    fun allQuestions(): LiveData<List<Question>> {
        return MutableLiveData(repository.getAllQuestions());
    }
}