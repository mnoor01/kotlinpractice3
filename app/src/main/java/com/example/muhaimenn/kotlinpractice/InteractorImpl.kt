package com.example.muhaimenn.kotlinpractice

import com.example.muhaimenn.kotlinpractice.RetrofitInstance.MyRetrofitInstance
import com.example.muhaimenn.kotlinpractice.model.Response
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class InteractorImpl : MainContract.GetBookInteractor {


    override fun getData(onFinishedListener: MainContract.OnFinishedListener) {
        val movieList = mutableListOf<Response>()
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.= MyRetrofitInstance
        val movie: GetMovie? = MyRetrofitInstance.retrofitInstance()
        val myValue: Observable<MutableList<Response>> = movie!!.getMovie()
        myValue.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { onFinishedListener.onFinished(movieList) }




//        if (result.isSuccessful){
////            val films= result.body().map {  }
////        }


    }
}


