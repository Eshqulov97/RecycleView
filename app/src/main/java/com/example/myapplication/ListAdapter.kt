package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val activity: MainActivity) : RecyclerView.Adapter<ListViewHolder>() {

    var models:List<User> = listOf()

    fun Data(data:List<User>){

        models = data
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        val itemView : View = LayoutInflater.from(parent.context).inflate(R.layout.iteam,parent,false)

        return ListViewHolder(itemView)

    }

    override fun getItemCount(): Int {
     return models.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        holder.populateModel(models[position],activity)

    }
}