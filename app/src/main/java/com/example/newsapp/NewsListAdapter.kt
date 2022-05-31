package com.example.newsapp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter: RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}



class NewsViewHolder(itemview: View):RecyclerView.ViewHolder(itemview)
{
    val titleview:TextView=itemview.findViewById(R.id.title)

}