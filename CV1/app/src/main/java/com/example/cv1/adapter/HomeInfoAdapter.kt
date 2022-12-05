package com.example.cv1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cv1.R
import com.example.cv1.model.HomeInfo


class HomeInfoAdapter(
    //private val context: Context,
    private val dataset: List<HomeInfo>
) : RecyclerView.Adapter<HomeInfoAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val tvHomeInfoTitle: TextView = view.findViewById(R.id.tvHomeInfoTitle)
        val tvHomeInfoDescription: TextView = view.findViewById(R.id.tvHomeInfoDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_home_info_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        holder.tvHomeInfoTitle.text = item.title
        holder.tvHomeInfoDescription.text = item.description
    }

    override fun getItemCount():Int {
        return dataset.size;
    }
}