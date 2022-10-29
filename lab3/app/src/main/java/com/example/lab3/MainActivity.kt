package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onAddClick(view: View) {
        var versionET = findViewById<EditText>(R.id.version)
        var versionCodeET = findViewById<EditText>(R.id.code)
        var tableLayoutid = findViewById<TableLayout>(R.id.myTableLayout)

        val tableRow = TableRow(getApplicationContext()) // this
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setLayoutParams(layoutParams)
        var textView1 = TextView(this);
        textView1.text=versionET.text;
        textView1.setBackgroundResource(R.color.red);

        var textView2 = TextView(this);
        textView2.text=versionCodeET.text;
        textView2.setBackgroundResource(R.color.red);

        tableRow.addView(textView1)
        tableRow.addView(textView2)
        tableLayoutid.addView(tableRow)
    }
}