package com.example.muhaimenn.kotlinpractice

import android.util.Log
import com.example.muhaimenn.kotlinpractice.model.ApiResponse

class PresenterImpl(private val mainContract: MainContract.MainView,
                    private val interactorImpl: MainContract.GetBookInteractor
) : MainContract.Presenter, MainContract.OnFinishedListener {

    override fun start() {
        Log.d("start", "it came here")
        interactorImpl.getData(this)
    }

    override fun onFinished(movieList: List<ApiResponse>) {
        Log.d("onFinished", "it came here")
        mainContract.putDataToRecylerview(movieList)

    }

    override fun onFailure(throwable: Throwable) {
    }

}