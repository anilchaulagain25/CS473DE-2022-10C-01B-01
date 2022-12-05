package com.example.cv1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cv1.adapter.HomeInfoAdapter
import com.example.cv1.data.HomeInfoDataProvider


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var myView =inflater.inflate(R.layout.fragment_home, container, false)
        val myDataSet = HomeInfoDataProvider().get();

        val recyclerView = myView.findViewById<RecyclerView>(R.id.homeFragmentRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(activity);
        recyclerView.adapter = HomeInfoAdapter(myDataSet)
        recyclerView.setHasFixedSize(true)

         return myView;
    }


}