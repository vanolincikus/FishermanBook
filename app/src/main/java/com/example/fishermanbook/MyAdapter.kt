package com.example.fishermanbook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(listArray: ArrayList<ListItem>, context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    var listArrayR = listArray
    var contextR = context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle = view.findViewById<TextView>(R.id.fish_Title)
        val tvContent = view.findViewById<TextView>(R.id.fish_description_short)
        val image = view.findViewById<ImageView>(R.id.fish_pic)

        fun bind(listItem: ListItem, context: Context) {
            tvTitle.text=listItem.titleText
            tvContent.text=listItem.contentText
            image.setImageResource(listItem.image_id)
            itemView.setOnClickListener(){Toast.makeText(context,"Pressed:  ${tvTitle.text}",Toast.LENGTH_SHORT).show()}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextR)
        return ViewHolder(inflater.inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       var listItem=listArrayR.get(position)
        holder.bind(listItem,contextR)
    }

    override fun getItemCount(): Int {
        return listArrayR.size
    }

}