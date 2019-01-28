package com.example.muhaimenn.kotlinpractice.recyclerviewStuff

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.muhaimenn.kotlinpractice.R
import com.example.muhaimenn.kotlinpractice.model.Response

class MovieAdapter(val items: MutableList<Response>, val context: Context) : RecyclerView.Adapter<MovieAdapter.MovieViewholder>() {

    private val movies: MutableList<Response> = mutableListOf()


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MovieViewholder {
        return MovieViewholder(LayoutInflater.from(context).inflate(R.layout.movie_itemview, p0, false))
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return movies.size
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: MovieViewholder, p1: Int) {
        p0.bindModel(movies[p1])
        Log.d("movie",movies.get(p1).name)
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MovieViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val movieTitleText: TextView = itemView.findViewById(R.id.movieTitle)
        val movieGenreText: TextView = itemView.findViewById(R.id.movieGenre)
        val movieAuthor: TextView = itemView.findViewById(R.id.movieauthor)


        fun bindModel(movie: Response) {
            movieTitleText.text = movie.name
            movieGenreText.text = movie.genreS
            movieAuthor.text = movie.author


        }

    }
}