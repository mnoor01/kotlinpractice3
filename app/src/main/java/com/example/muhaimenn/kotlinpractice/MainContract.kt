package com.example.muhaimenn.kotlinpractice

import com.example.muhaimenn.kotlinpractice.model.ApiResponse

interface MainContract {
    interface MainView {
        //Use the interface List instead of the concrete class of MutableList
        fun putDataToRecylerview(movieList: List<ApiResponse>)
    }

    interface Presenter {
        fun start()
    }

    interface GetBookInteractor {
        fun getData(onFinishedListener: OnFinishedListener)
    }

    interface OnFinishedListener {
        fun onFinished(movieList: List<ApiResponse>) //Use the interface List instead of the concrete class of MutableList
        fun onFailure(throwable: Throwable)
    }
}