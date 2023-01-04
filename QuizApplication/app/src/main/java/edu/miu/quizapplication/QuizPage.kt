package edu.miu.quizapplication

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProviders
import edu.miu.quizapplication.dal.models.Question

class QuizPage : AppCompatActivity() {
    private lateinit var vm: QuizViewModel


    private var questionId: Int = 0;
    private var userAnswer: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_page)
        vm = ViewModelProviders.of(this)[QuizViewModel::class.java]

        vm.getQuestion().observe(this) {
            if (it == null) {
                showResultPage();
            } else {
                resetSelectedOptions()
                fillQuestion(it)
            }

        }
        vm.getStep().observe(this) {
            fillProgressBar(it)
        }
    }

    private fun showResultPage() {
        startActivity(Intent(this, ResultPage::class.java))
    }

    fun fillProgressBar(pair: Pair<Int, Int>) {

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val tv_progress = findViewById<TextView>(R.id.tv_progress)
        progressBar.max = pair.second
        progressBar.progress = pair.first + 1

        val actualStep = pair.first + 1
        tv_progress.text = "$actualStep / ${pair.second}"
    }


    fun fillQuestion(question: Question) {
        questionId = question.id;
        val tv_question = findViewById<TextView>(R.id.tv_question)
        val tv_option_one = findViewById<TextView>(R.id.tv_option_one)
        val tv_option_two = findViewById<TextView>(R.id.tv_option_two)
        val tv_option_three = findViewById<TextView>(R.id.tv_option_three)
        val tv_option_four = findViewById<TextView>(R.id.tv_option_four)


        tv_question.text = question.question;
        tv_option_one.text = question.option_one;
        tv_option_two.text = question.option_two;
        tv_option_three.text = question.option_three;
        tv_option_four.text = question.option_four;
    }

    fun onOptionClick(view: View) {
        val selectedOptionId = view.id;
        resetSelectedOptions()

        val selectionOptionCtrl = findViewById<TextView>(selectedOptionId)
        selectionOptionCtrl.background = ContextCompat.getDrawable(
            this, R.drawable.correct_option_border_bg
        )
        selectionOptionCtrl.setTypeface(selectionOptionCtrl.typeface, Typeface.BOLD)

        userAnswer = when (selectionOptionCtrl.id) {
            R.id.tv_option_one -> 1
            R.id.tv_option_two -> 2
            R.id.tv_option_three -> 3
            R.id.tv_option_four -> 4
            else -> throw Error("Invalid option")
        }
    }

    fun resetSelectedOptions() {
        arrayOf(
            R.id.tv_option_one,
            R.id.tv_option_two,
            R.id.tv_option_three,
            R.id.tv_option_four,

            ).forEach {
            var ctrl = findViewById<TextView>(it);
            ctrl.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            );
            ctrl.setTypeface(null, Typeface.NORMAL)

        }
    }


    fun onNextClick(view: View) {
        if (userAnswer == 0) {
            Toast.makeText(this, "Please select option", Toast.LENGTH_SHORT).show()
        } else {
            vm.submitUserAnswer(questionId, userAnswer);
            resetSelectedOptions()
            this.userAnswer = 0
        }
    }
}