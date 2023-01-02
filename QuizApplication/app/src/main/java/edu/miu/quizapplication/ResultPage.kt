package edu.miu.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import edu.miu.quizapplication.dal.models.Question

class ResultPage : AppCompatActivity() {

    private lateinit var vm: QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_page)

        vm = ViewModelProviders.of(this)[QuizViewModel::class.java]

        vm.allQuestions().observe(this) {
            loadResults(it!!);
        }
    }

    private fun loadResults(questions: List<Question>) {
        val totalQuestions = questions.size;
        val correctAnswers = questions.filter { it.correct_answer == it.user_answer }.size;
        val wrongAnswers = questions.filter { it.correct_answer != it.user_answer }.size;

        findViewById<TextView>(R.id.tvTotalQuestionValue).text = totalQuestions.toString();
        findViewById<TextView>(R.id.tvCorrectAnswersValue).text = correctAnswers.toString();
        findViewById<TextView>(R.id.tvWrongAnswerValue).text = wrongAnswers.toString();
        findViewById<TextView>(R.id.tvYourScoreIsValue).text = "$correctAnswers / $totalQuestions"

    }

    fun onResultAnalysisClick(view: View) {
        var intent = Intent(this, ResultAnalysis::class.java)
        startActivity(intent);
    }
    fun onTryAgainClick(view: View) {
        var intent = Intent(this, QuizPage::class.java)
        startActivity(intent);
    }
}