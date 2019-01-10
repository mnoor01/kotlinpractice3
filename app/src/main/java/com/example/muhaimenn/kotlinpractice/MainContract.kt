package com.example.muhaimenn.kotlinpractice

import com.example.muhaimenn.kotlinpractice.model.Response

interface MainContract {
    interface MainView {
        fun putDataToRecylerview(movieList: MutableList<Response>)
    }

    interface Presenter {
        fun start(onFinishedListener: OnFinishedListener)
    }

    interface OnFinishedListener {
        fun onFinished(movieList: MutableList<Response>)
        fun onFailure(throwable: Throwable)
    }
}