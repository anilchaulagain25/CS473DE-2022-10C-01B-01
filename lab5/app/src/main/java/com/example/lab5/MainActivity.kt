package com.example.lab5

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var submitBtn = findViewById<Button>(R.id.button)
        var clearBtn = findViewById<Button>(R.id.button2)




        clearBtn.setOnClickListener {
            findViewById<RadioGroup>(R.id.radioGroup).clearCheck()
            findViewById<CheckBox>(R.id.checkBox).isChecked = false
            findViewById<CheckBox>(R.id.checkBox2).isChecked = false
            findViewById<CheckBox>(R.id.checkBox3).isChecked = false
            findViewById<CheckBox>(R.id.checkBox4).isChecked = false
            Toast.makeText(this, "cleared", Toast.LENGTH_SHORT).show()
        }

        submitBtn.setOnClickListener {
            var marks = 0
            var radioGroup = findViewById<RadioGroup>(R.id.radioGroup).checkedRadioButtonId
            var printLnRadio = findViewById<RadioButton>(R.id.radioButton)
            if (findViewById<RadioButton>(radioGroup) == printLnRadio) {
                marks += 50;
            }

            var chkBox1 = findViewById<CheckBox>(R.id.checkBox)
            var chkBox2 = findViewById<CheckBox>(R.id.checkBox2)
            var chkBox3 = findViewById<CheckBox>(R.id.checkBox3)
            var chkBox4 = findViewById<CheckBox>(R.id.checkBox4)

            if (chkBox1.isChecked &&
                !chkBox2.isChecked &&
                chkBox3.isChecked &&
                !chkBox4.isChecked
            ) {
                marks += 50;
            }
            var message = "";
            message = if (marks == 0) {
                " Sorry! You submitted on ${Date()}, Your achieved $marks%"
            } else {
                " Congratulations! You submitted on ${Date()}, Your achieved $marks%"
            }
            val dialogBuilder = AlertDialog.Builder(this)
              Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

            dialogBuilder.setMessage(message)
                .setCancelable(true)
                .setPositiveButton("Ok") { dialog, id ->
                    finish()
                }

            // create dialog box
            val alert = dialogBuilder.create()
            // set title for alert dialog box
            alert.setTitle("Your Quiz Result")
            // show alert dialog
            alert.show()
        }
    }
}