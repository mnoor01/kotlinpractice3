package com.example.muhaimenn.kotlinpractice

import com.example.muhaimenn.kotlinpractice.RetrofitInstance.MyRetrofitInstance
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class InteractorImpl : MainContract.GetBookInteractor {

    private val disposables = CompositeDisposable()

    override fun getData(onFinishedListener: MainContract.OnFinishedListener) {
        val movieApi = MyRetrofitInstance.retrofitInstance()

        //When using RxJava you need to add the result of the Subscribe to a CompositeDisposable
        //This collects the disposables which you then clear in your onPause or whatever lifecycle method.
        //I recommend not starting with RxJava as it is a steep learning curve.
        // An alternative approach is listed below.
        disposables.addAll(movieApi.getMovieRx()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe { result ->
                    onFinishedListener.onFinished(result)
                })
    }
}
