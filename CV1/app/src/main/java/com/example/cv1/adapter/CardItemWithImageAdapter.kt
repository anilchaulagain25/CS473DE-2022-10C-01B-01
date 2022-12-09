package com.example.cv1.adapter

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.cv1.R
import com.example.cv1.model.AdditionalData
import com.example.cv1.model.CardItemWithImageModel


class CardItemWithImageAdapter(
    //private val context: Context,
    private val dataset: List<CardItemWithImageModel>
) : RecyclerView.Adapter<CardItemWithImageAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val tvTitleCardWidget: TextView = view.findViewById(R.id.tvTitleCardWidget)
        val tvSubtitleCardWidget: TextView = view.findViewById(R.id.tvSubtitleCardWidget)
        val tvDescriptionCardWidget: TextView = view.findViewById(R.id.tvDescriptionCardWidget)
        val ivImageCardWidget: ImageView = view.findViewById(R.id.ivImageCardWidget)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_item_with_image, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        holder.tvTitleCardWidget.text = item.title
        holder.tvSubtitleCardWidget.text = item.subTitle
        holder.tvDescriptionCardWidget.text = item.description
        holder.ivImageCardWidget.setImageResource(item.imgId)


        if (item.additionalData != null) {
            holder.ivImageCardWidget.setOnClickListener {
                val data: AdditionalData = item.additionalData!!
                val intent = Intent(data.intent, Uri.parse(data.url))
                holder.itemView.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return dataset.size;
    }
}