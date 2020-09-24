package com.example.fishermanbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_layout.*
import kotlinx.android.synthetic.main.story_item.*

class StoryContent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){

        super.onCreate(savedInstanceState)
        setContentView(R.layout.story_item)

        story_Title.text = intent.getStringExtra("title")
        story_Text.text = intent.getStringExtra("content")



    }
}