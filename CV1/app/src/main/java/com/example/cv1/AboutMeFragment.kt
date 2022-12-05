package com.example.cv1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cv1.adapter.HomeInfoAdapter
import com.example.cv1.adapter.ItemWithImageAdapter
import com.example.cv1.data.AboutMeDataProvider
import com.example.cv1.data.HomeInfoDataProvider


class AboutMeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var myView =inflater.inflate(R.layout.fragment_about_me, container, false)
        val myDataSet = AboutMeDataProvider().educationInfo();

        val recyclerView = myView.findViewById<RecyclerView>(R.id.rvEducationAboutMe)

        recyclerView.layoutManager = LinearLayoutManager(activity);
        recyclerView.adapter = ItemWithImageAdapter(myDataSet)
        recyclerView.setHasFixedSize(true)

        return myView;
    }
}