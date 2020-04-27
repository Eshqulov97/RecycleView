package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val models: MutableList<User> = mutableListOf()

    private val adapter : ListAdapter = ListAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        setData()

    }

    fun setData() {
        val model: User = User()
            model.title = "${1}"
            model.text = " is title"
            model.description = "description number ${1}"
            models.add(model)

        adapter.Data(models)

    }

    fun ItemAdd(user:User){


        var son = user.title.toInt()
        var temp  = models.size

        for(i in 1..son){

            val model: User = User()
            model.title = "${i + temp}"
            model.text = " is title"
            model.description = "description is ${i + temp}"
            models.add(model)
        }

        adapter.Data(models)

    }
}
