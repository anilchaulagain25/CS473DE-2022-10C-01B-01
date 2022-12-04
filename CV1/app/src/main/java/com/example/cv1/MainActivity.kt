package com.example.cv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter: MyAdapter = MyAdapter(supportFragmentManager, lifecycle);

        var viewPager: ViewPager2 = findViewById<ViewPager2>(R.id.viewPager)
        var tabLayout: TabLayout = findViewById<TabLayout>(R.id.tabLayout)


        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Home"
                    //tab.setIcon(R.drawable.home)
                }
                1 -> {
                    tab.text = "ABOUT ME"
                    //tab.setIcon(R.drawable.home)
                }

                2 -> {
                    tab.text = "WORK"
                    //tab.setIcon(R.drawable.home)
                }

                3 -> {
                    tab.text = "CONTACT"
                    //tab.setIcon(R.drawable.home)
                }
            }
        }.attach()
    }
}