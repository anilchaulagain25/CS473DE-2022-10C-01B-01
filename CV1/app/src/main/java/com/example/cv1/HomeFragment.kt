package com.example.cv1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cv1.adapter.CardItemAdapter
import com.example.cv1.data.HomeInfoDataProvider


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var myView =inflater.inflate(R.layout.fragment_home, container, false)
        val myDataSet = HomeInfoDataProvider().getHomeInfo();

        val recyclerView = myView.findViewById<RecyclerView>(R.id.homeFragmentRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(activity);
        recyclerView.adapter = CardItemAdapter(myDataSet)
        recyclerView.setHasFixedSize(true)

         return myView;
    }


}