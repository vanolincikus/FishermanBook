package com.example.fishermanbook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter(listArray: ArrayList<StoryItem>, context: Context) :
    RecyclerView.Adapter<StoryAdapter.ViewHolder>() {

    var listArrayR = listArray
    var contextR = context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val tvTitle = view.findViewById<TextView>(R.id.story_Title)
        val tvContent = view.findViewById<TextView>(R.id.story_Text)

        fun bind(listItem: StoryItem,context: Context) {
            tvTitle.text = listItem.storyTitle
            tvContent.text = listItem.storyText

            var shorDescription = listItem.storyText.substring(0, 50) + "..."
            tvContent.text = shorDescription

            itemView.setOnClickListener() {
                Toast.makeText(context, "Pressed:  ${tvTitle.text}", Toast.LENGTH_SHORT).show()
                val i = Intent(context, StoryContent::class.java).apply {
                    putExtra("title", tvTitle.text.toString())
                    putExtra("content", listItem.storyText)
                }
                context.startActivity(i)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextR)
        return ViewHolder(inflater.inflate(R.layout.story_item, parent, false))
    }

    override fun getItemCount(): Int {
        return listArrayR.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listItem = listArrayR[position]
        holder.bind(listItem,contextR)
    }
}