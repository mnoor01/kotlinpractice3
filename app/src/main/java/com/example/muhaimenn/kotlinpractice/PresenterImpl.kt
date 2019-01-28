package com.example.muhaimenn.kotlinpractice

import android.util.Log
import com.example.muhaimenn.kotlinpractice.model.Response

class PresenterImpl(mainContract: MainContract.MainView, interactorImpl: MainContract.GetBookInteractor) : MainContract.Presenter, MainContract.OnFinishedListener {

private lateinit var mainContract: MainContract.MainView
    override fun start() {
        var interactorImpl: InteractorImpl = InteractorImpl()
        interactorImpl.getData(this)

Log.d("start","it came here")
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFinished(movieList: MutableList<Response>) {

mainContract.putDataToRecylerview(movieList)

        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(throwable: Throwable) {
        //    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}