package com.example.muhaimenn.kotlinpractice

import com.example.muhaimenn.kotlinpractice.RetrofitInstance.MyRetrofitInstance
import com.example.muhaimenn.kotlinpractice.model.Response
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import java.util.*

class InteractorImpl : MainContract.GetBookInteractor {


    override fun getData(onFinishedListener: MainContract.OnFinishedListener) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.= MyRetrofitInstance
       var movie : GetMovie? =MyRetrofitInstance.retrofitInstance()

      var myValue : Observable<MutableList<Response>> = movie!!.getMovie()

       myValue.subscribeOn(Schedulers.io())
               .subscribe()
    }
}