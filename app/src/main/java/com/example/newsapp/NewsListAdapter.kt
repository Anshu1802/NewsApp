package com.example.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter(val items :ArrayList<String>,private val listner:NewItemclicked): RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent,false)
        val viewHolder=NewsViewHolder(view)
        view.setOnClickListener {
            listner.onitemclicked(items[viewHolder.adapterPosition])
        }


        return viewHolder
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentItem=items[position]
        holder.titleview.text=currentItem
    }

    override fun getItemCount(): Int {
        return items.size
    }

}



class NewsViewHolder(itemview: View):RecyclerView.ViewHolder(itemview)
{
    val titleview:TextView=itemview.findViewById(R.id.title)

}

interface NewItemclicked
{
    fun onitemclicked(item:String)
}