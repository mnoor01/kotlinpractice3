package com.example.muhaimenn.kotlinpractice.recyclerviewStuff

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.muhaimenn.kotlinpractice.R
import com.example.muhaimenn.kotlinpractice.model.DataItem

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewholder>() {
    private val movies: MutableList<DataItem> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MovieViewholder {
        return MovieViewholder(View.inflate(p0.context, R.layout.movie_itemview, p0))
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return movies.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: MovieViewholder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MovieViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieTitleText: TextView = itemView.findViewById(R.id.movieTitle)
        val movieGenreText: TextView = itemView.findViewById(R.id.movieGenre)
        val movieYear: TextView = itemView.findViewById(R.id.movieGenre)

    }
}