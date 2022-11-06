package com.example.lab3walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_items.*

class Items_activity : AppCompatActivity() {


    var productList: ArrayList<Product> = ArrayList<Product>();

    override fun onCreate(savedInstanceState: Bundle?) {


        productList.add(Product("Macbook Pro", 1199, "black", R.drawable.macbook, "1", "The MacBook Pro is a line of Macintosh notebook computers by Apple Inc. Introduced in January 2006, it is the higher-end model of the MacBook family, sitting above the consumer-focused MacBook Air. It is currently sold with 13-inch, 14-inch, and 16-inch screens, all using variants of the Apple-designed M1 and M2 system on a chip. The first-generation MacBook Pro used the design of the PowerBook G4, but replaced the PowerPC G4 chips with Intel Core processors, added a webcam, and introduced the MagSafe power connector. The 15-inch model was introduced in January 2006; the 17-inch model in April. Later revisions added Intel Core 2 Duo processors and LED-backlit displays. "))
        productList.add(Product("Iphone", 599, "pink", R.drawable.iphone, "2", "The iPhone is a line of smartphones designed and marketed by Apple Inc. These devices use Apple's iOS mobile operating system. The first-generation iPhone was announced by then-Apple CEO Steve Jobs on January 9, 2007. Since then, Apple has annually released new iPhone models and iOS updates. As of November 1, 2018, more than 2.2 billion iPhones had been sold. As of 2022, the iPhone accounts for 15.6% of global smartphone market share."))
        productList.add(Product("IPad", 329, "blue", R.drawable.ipad, "3", "The iPad is a brand of iOS and iPadOS-based tablet computers that are developed by Apple Inc. The iPad was conceived before the related iPhone but the iPhone was developed and released first. Speculation about the development, operating system, and release of the original iPad began in 2002 prior to its introduction on January 20, 2010. The iPad range consists of the original iPad lineup and the flagship products iPad Mini, iPad Air, and iPad Pro. "))
        productList.add(Product("AirPod Pro", 229, "transparent", R.drawable.airpod, "4", "Apple Inc. has produced and sold headphones since 2001, available for standalone purchase and bundled with iPhone (until 2020) and iPod (until 2022) products. Apple's current product line consists of EarPods (wired earbuds available with a 3.5mm headphone or Lightning connector), AirPods and AirPods Pro (wireless Bluetooth earbuds), and AirPods Max (wireless Bluetooth over-ear headphones). "))
        productList.add(Product("Apple Charger", 20, "white", R.drawable.charger, "5", "A battery charger, or recharger,[1][2] is a device that stores energy in a battery by running an electric current through it. The charging protocol (how much voltage or current for how long, and what to do when charging is complete) depends on the size and type of the battery being charged. Some battery types have high tolerance for overcharging (i.e., continued charging after the battery has been fully charged) and can be recharged by connection to a constant voltage source or a constant current source, depending on battery type. Simple chargers of this type must be manually disconnected at the end of the charge cycle. Other battery types use a timer to cut off when charging should be complete. "))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val adapter = ProductAdapter(this,productList)
        rv.layoutManager = LinearLayoutManager(this);
        rv.adapter = adapter;
    }
}