package com.example.lab3walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_item_details.*

class Item_Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_details)

        if(intent.hasExtra("title") &&
            intent.hasExtra("price")&&
            intent.hasExtra("color")&&
            intent.hasExtra("description")&&
            intent.hasExtra("image")){
            var title =intent.getStringExtra("title")
            var price = intent.getStringExtra("price")
            var color = intent.getStringExtra("color")
            var description = intent.getStringExtra("description")
            val image = intent.getIntExtra("image",0);
            textView13.text = title;
           // textView15.text = price;
            textView17.text = color;
            editTextTextMultiLine.setText(description)
            imageView3.setImageResource(image)

        }
    }
}