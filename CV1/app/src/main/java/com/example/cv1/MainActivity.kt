package com.example.cv1

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.util.Calendar
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.cv1.model.Constants
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import java.nio.file.Paths.get
import java.time.DateTimeException


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
                    tab.setIcon(R.drawable.home)
                }
                1 -> {
                    tab.text = "ABOUT ME"
                    tab.setIcon(R.drawable.about_me)
                }

                2 -> {
                    tab.text = "WORK"
                    tab.setIcon(R.drawable.work)
                }

                3 -> {
                    tab.text = "CONTACT"
                    tab.setIcon(R.drawable.contact)
                }
            }
        }.attach()

        val sharedPref = getSharedPreferences(Constants.sharedPreferenceName, 0);
        var name = sharedPref.getString(Constants.userName, null);
        var title = sharedPref.getString(Constants.userTitle, null);

        val tvGreeting: TextView = findViewById<TextView>(R.id.tvGreeting)
        tvGreeting.text = "Howdy, $name ($title)";
    }

    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var url: String = "";
        url = when (item.itemId) {
            R.id.m1 -> {
                "https://www.linkedin.com/in/anil-chaulagain/"
            }
            R.id.m2 -> {
                "https://github.com/anilchaulagain25";
            }
            R.id.m3 -> {
                "https://anilchaulagain.com.np/";
            }
            else -> {
                throw Error("Menu click action not implemented");
            }

        }
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)

        return super.onOptionsItemSelected(item)
    }
}