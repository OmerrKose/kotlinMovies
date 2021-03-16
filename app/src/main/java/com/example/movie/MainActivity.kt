package com.example.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        val moviesAdapter = Adapter(getModels())
        rv.apply {
            layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
            adapter = moviesAdapter
        }

    }

    private fun getModels(): MutableList<Movies> {
        return mutableListOf(
                Movies(original_title = "Inception", director = "Christopher Nolan"),
                Movies(original_title = "The Dark Knight Rises", director = "Christopher Nolan"),
                Movies(original_title = "Prestige", director = "Christopher Nolan"),
                Movies(original_title = "Gladiator", director = "Ridley Scott")
        )
    }
}