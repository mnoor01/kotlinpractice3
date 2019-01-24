package com.example.muhaimenn.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.muhaimenn.kotlinpractice.model.Response
import com.example.muhaimenn.kotlinpractice.recyclerviewStuff.MovieAdapter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class MainActivity : AppCompatActivity(), MainContract.MainView, MainContract.OnFinishedListener {



    private var recyclerView: RecyclerView = findViewById(R.id.myRecyclerview)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initiRecylerview()
        var interactorImpl : InteractorImpl= InteractorImpl()
        var presenter : MainContract.Presenter = PresenterImpl(this,interactorImpl)
        presenter.start()






    }
    fun initiRecylerview(){
        recyclerView.layoutManager=LinearLayoutManager(this)
    }
    override fun putDataToRecylerview(movieList: MutableList<Response>) {

        recyclerView.adapter = MovieAdapter(movieList,this)

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onFinished(movieList: MutableList<Response>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(throwable: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

