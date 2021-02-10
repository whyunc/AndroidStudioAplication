package com.example.caffeinsubmissionaplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listCoffeeAdapter(private val listCoffee: ArrayList<Coffee>): RecyclerView.Adapter<listCoffeeAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.item_detail)
        var tvImage: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_menu_coffee, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCoffee.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val coffee = listCoffee[position]
        Glide.with(holder.itemView.context)
            .load(coffee.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.tvImage)
        holder.tvName.text = coffee.name
        holder.tvDetail.text = coffee.detail


        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, detailActivity::class.java)
            //moveDetail.putExtra(detailActivity.EXTRA_NAME, coffee.name)
            //moveDetail.putExtra(detailActivity.EXTRA_DETAIL, coffee.detail)
            //moveDetail.putExtra(detailActivity.EXTRA_PRICE, coffee.price)
            //moveDetail.putExtra(detailActivity.EXTRA_TYPE, coffee.type)
            //moveDetail.putExtra(detailActivity.EXTRA_IMG, coffee.photo)
            moveDetail.putExtra(detailActivity.EXTRA_COFFEE, coffee)
            mContext.startActivity(moveDetail)

        }
    }





}