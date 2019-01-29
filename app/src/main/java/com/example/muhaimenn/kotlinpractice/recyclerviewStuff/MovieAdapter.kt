package com.example.muhaimenn.kotlinpractice.recyclerviewStuff

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.muhaimenn.kotlinpractice.R
import com.example.muhaimenn.kotlinpractice.model.ApiResponse

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewholder>() {

    private val movies = mutableListOf<ApiResponse>() //Can define the type instead of typing the variable


    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): MovieViewholder {
        return MovieViewholder(LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.movie_itemview, viewGroup, false))
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(p0: MovieViewholder, p1: Int) {
        p0.bindModel(movies[p1])
        Log.d("movie", movies[p1].name)
    }

    fun setData(movieList: List<ApiResponse>) {
        movies.clear()
        movies.addAll(movieList)
        notifyDataSetChanged()
    }


    inner class MovieViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieTitleText: TextView = itemView.findViewById(R.id.movieTitle)
        val movieGenreText: TextView = itemView.findViewById(R.id.movieGenre)
        val movieAuthor: TextView = itemView.findViewById(R.id.movieauthor)


        fun bindModel(movie: ApiResponse) {
            movieTitleText.text = "Name: ${movie.name}"
            movieGenreText.text = "Genre: ${movie.genreS}"
            movieAuthor.text = "Author: ${movie.author}"
        }
    }
}