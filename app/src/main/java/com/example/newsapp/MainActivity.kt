package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), NewItemclicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView2.layoutManager =LinearLayoutManager(this)
        val items=fetchdata()
        val adapter:NewsListAdapter= NewsListAdapter(items,this)
        recyclerView2.adapter=adapter


    }
    private fun fetchdata():ArrayList<String>
    {
        val list=ArrayList<String>()
        for (i in 0 until 100)
        {
            list.add("items $i")
        }
        return list
    }

    override fun onitemclicked(item: String) {
        Toast.makeText(this,"clicked items is $item",Toast.LENGTH_LONG).show()
    }
}