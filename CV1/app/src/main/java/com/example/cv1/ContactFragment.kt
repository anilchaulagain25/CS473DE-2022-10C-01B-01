package com.example.cv1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cv1.adapter.CardItemWithImageAdapter
import com.example.cv1.data.ContactDataProvider
import com.example.cv1.data.WorkDataProvider

class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var myView =inflater.inflate(R.layout.fragment_contact, container, false)

        //workInfo info
        val myDataSet = ContactDataProvider().contactInfo();
        val recyclerView = myView.findViewById<RecyclerView>(R.id.rvContactMe)
        recyclerView.layoutManager = LinearLayoutManager(activity);
        recyclerView.adapter = CardItemWithImageAdapter(myDataSet)
        recyclerView.setHasFixedSize(true)
        return myView;
    }

}