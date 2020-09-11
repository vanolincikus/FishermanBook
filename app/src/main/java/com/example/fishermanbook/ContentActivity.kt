package com.example.fishermanbook

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_layout.*

class ContentActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?){
       super.onCreate(savedInstanceState)
       setContentView(R.layout.content_layout)

       tv_title.text = intent.getStringExtra("title")
       full_text.text = intent.getStringExtra("content")
       image_view.setImageResource(intent.getIntExtra("image",R.drawable.costur))


   }
}