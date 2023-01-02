package edu.miu.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {
    private lateinit var vm: QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {


        vm = ViewModelProviders.of(this)[QuizViewModel::class.java]

        vm.getAllQuestions().observe(this,  {

                val len = it.size;

        })
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onStartClick(view: View) {
        var intent = Intent(this, QuizPage::class.java)
        startActivity(intent);
    }
}