package edu.miu.quizapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.miu.quizapplication.dal.models.Question


class ResultAnalysis : AppCompatActivity() {

    private lateinit var vm: QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_analysis)
        vm = ViewModelProviders.of(this)[QuizViewModel::class.java]

        vm.allQuestions().observe(this) {
            loadResults(it!!);
        }
    }

    private fun loadResults(questions: List<Question>) {
        // Lookup the recyclerview in activity layout
        val rvContacts = findViewById<RecyclerView>(R.id.rvResultAnalysis);
        val adapter = ResultAnalysisAdapter(questions)
        rvContacts.adapter = adapter
        rvContacts.layoutManager = LinearLayoutManager(this)
    }

    fun gotoHome(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent);
    }
}