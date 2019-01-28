package com.example.muhaimenn.kotlinpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.example.muhaimenn.kotlinpractice.model.Response
import com.example.muhaimenn.kotlinpractice.recyclerviewStuff.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.MainView, MainContract.OnFinishedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initiRecylerview()

        val presenter: MainContract.Presenter = PresenterImpl(this, InteractorImpl())


        presenter.start()
    }

    fun initiRecylerview() {
        myRecyclerview.layoutManager = LinearLayoutManager(this)

    }

    override fun putDataToRecylerview(movieList: MutableList<Response>) {

        myRecyclerview.adapter = MovieAdapter(movieList, this)


//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFinished(movieList: MutableList<Response>) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(throwable: Throwable) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

