package edu.miu.quizapplication

//import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.miu.quizapplication.dal.models.Question


class ResultAnalysisAdapter(private val questions: List<Question>) :
    RecyclerView.Adapter<ResultAnalysisAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvResultAnalysis_QuestionValue =
            itemView.findViewById<TextView>(R.id.tvResultAnalysis_QuestionValue)
        val tvResultAnalysis_YourAnswerValue =
            itemView.findViewById<TextView>(R.id.tvResultAnalysis_YourAnswerValue)
        val tvResultAnalysis_CorrectAnswerValue =
            itemView.findViewById<TextView>(R.id.tvResultAnalysis_CorrectAnswerValue)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ResultAnalysisAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.activity_result_analysis_item, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(viewHolder: ResultAnalysisAdapter.ViewHolder, position: Int) {
        val question: Question = questions.get(position)

        val tvResultAnalysis_QuestionValue = viewHolder.tvResultAnalysis_QuestionValue
        val tvResultAnalysis_YourAnswerValue = viewHolder.tvResultAnalysis_YourAnswerValue
        val tvResultAnalysis_CorrectAnswerValue = viewHolder.tvResultAnalysis_CorrectAnswerValue

        tvResultAnalysis_QuestionValue.text = question.question;
        tvResultAnalysis_YourAnswerValue.text = getValue(question.user_answer, question);
        tvResultAnalysis_CorrectAnswerValue.text = getValue(question.correct_answer, question);

    }

    private fun getValue(ans: String, question: Question): CharSequence? {
        return when (ans) {
            "1" -> question.option_one
            "2" -> question.option_two
            "3" -> question.option_three
            "4" -> question.option_four
            else -> "NA"
        }
    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return questions.size
    }
}