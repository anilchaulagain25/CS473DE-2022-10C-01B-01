package com.example.lab3walmart

//import android.R
//import android.R
import android.R.drawable
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_individual.view.*


class ProductAdapter(var context: Context, val productList: ArrayList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {


    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_individual, parent, false);
        return ProductViewHolder(view);
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.itemView.name.text = "Title = " + productList[position].title;
        holder.itemView.color.text = "Color = " + productList[position].color
        holder.itemView.image.setImageResource(productList[position].image)
        holder.itemView.price.text = "Price = " + productList[position].price.toString()
        ;


        holder.itemView.setOnClickListener {
            val intent = Intent(context, Item_Details::class.java)
            intent.putExtra("title", productList[position].title)
            intent.putExtra("price", productList[position].price)
            intent.putExtra("color", productList[position].color)
            intent.putExtra("image", productList[position].image)
            intent.putExtra("description", productList[position].desc)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return productList.size;
    }


}