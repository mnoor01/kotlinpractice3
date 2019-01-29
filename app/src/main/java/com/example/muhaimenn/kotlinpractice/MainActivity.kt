package com.example.muhaimenn.kotlinpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.muhaimenn.kotlinpractice.model.ApiResponse
import com.example.muhaimenn.kotlinpractice.recyclerviewStuff.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.MainView {

    private val adapter = MovieAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initiRecylerview()

        val presenter: MainContract.Presenter = PresenterImpl(this, InteractorImpl())


        presenter.start()
    }

    private fun initiRecylerview() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = RecyclerView.VERTICAL

        myRecyclerview.layoutManager = layoutManager
        myRecyclerview.adapter = adapter

    }

    override fun putDataToRecylerview(movieList: List<ApiResponse>) {
        adapter.setData(movieList)
    }
}

