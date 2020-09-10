package com.example.fishermanbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_content.*

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setNavigationItemSelectedListener(this)

        var list = ArrayList<ListItem>()
        list.add(ListItem(R.drawable.dagova_amerikanska,"Сом","Сладководна риба, чието тяло е без люспи."))
        list.add(ListItem(R.drawable.bialamur,"Бял амур","Белият амур спада към групата на растителноядните риби."))
        list.add(ListItem(R.drawable.chervenoperka,"Червеноперка","Сладководна риба от семейство шаранови."))
        list.add(ListItem(R.drawable.costurpng,"Костур"," Риба от семейство костурови."))

        rcView.hasFixedSize()
        rcView.layoutManager= LinearLayoutManager(this)

        rcView.adapter=MyAdapter(list,this)
    }

     override fun onNavigationItemSelected(item: MenuItem): Boolean {
         when(item.itemId){
             R.id.id_fish->Toast.makeText(this,"ID Fish",Toast.LENGTH_SHORT).show()
             R.id.id_bait->Toast.makeText(this,"ID Bait",Toast.LENGTH_SHORT).show()
             R.id.id_tackle->Toast.makeText(this,"ID Tackle",Toast.LENGTH_SHORT).show()
             R.id.id_stories->Toast.makeText(this,"ID Stories",Toast.LENGTH_SHORT).show()

         }
         return true
     }


 }