package com.example.cv1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cv1.adapter.CardItemAdapter
import com.example.cv1.adapter.CardItemWithImageAdapter
import com.example.cv1.data.AboutMeDataProvider


class AboutMeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var myView =inflater.inflate(R.layout.fragment_about_me, container, false)

        //AboutMe info
        val aboutMeInfo = AboutMeDataProvider().aboutMeInfo();
        val rvAboutMeAboutMe = myView.findViewById<RecyclerView>(R.id.rvAboutMeAboutMe)
        rvAboutMeAboutMe.layoutManager = LinearLayoutManager(activity);
        rvAboutMeAboutMe.adapter = CardItemAdapter(aboutMeInfo)
        rvAboutMeAboutMe.setHasFixedSize(true)


        //education info
        val myDataSet = AboutMeDataProvider().educationInfo();
        val recyclerView = myView.findViewById<RecyclerView>(R.id.rvEducationAboutMe)
        recyclerView.layoutManager = LinearLayoutManager(activity);
        recyclerView.adapter = CardItemWithImageAdapter(myDataSet)
        recyclerView.setHasFixedSize(true)


        //certifications info
        val myCertifications = AboutMeDataProvider().certificationInfo();
        val rvCertificationsAboutMe = myView.findViewById<RecyclerView>(R.id.rvCertificationsAboutMe)
        rvCertificationsAboutMe.layoutManager = LinearLayoutManager(activity);
        rvCertificationsAboutMe.adapter = CardItemWithImageAdapter(myCertifications)
        rvCertificationsAboutMe.setHasFixedSize(true)

        return myView;
    }
}