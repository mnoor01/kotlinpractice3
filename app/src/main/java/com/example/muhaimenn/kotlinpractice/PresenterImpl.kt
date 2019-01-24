package com.example.muhaimenn.kotlinpractice

import com.example.muhaimenn.kotlinpractice.model.Response

class PresenterImpl(mainContract : MainContract.MainView,interactorImpl: MainContract.GetBookInteractor) : MainContract.Presenter, MainContract.OnFinishedListener {



    override fun start() {
        var interactorImpl : InteractorImpl= InteractorImpl()
        interactorImpl.getData(this)


       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onFinished(movieList: MutableList<Response>) {
        var mainView : MainContract.MainView


      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(throwable: Throwable) {
    //    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}