package com.example.fishermanbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setNavigationItemSelectedListener(this)
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