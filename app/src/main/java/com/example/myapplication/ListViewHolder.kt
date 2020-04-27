package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.iteam.view.*

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val tvtitle : TextView = itemView.tv_title
    val tvTitle : TextView = itemView.tvTitle
    val tvDescription : TextView = itemView.tvDescription

    fun populateModel(user:User,activity: MainActivity){
        tvTitle.text = user.title
        tvDescription.text = user.description
        tvtitle.text = user.text

        itemView.setOnClickListener {

            activity.ItemAdd(user)

        }
    }

}