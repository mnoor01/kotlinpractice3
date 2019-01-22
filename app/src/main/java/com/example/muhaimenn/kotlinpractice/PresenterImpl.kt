package com.example.muhaimenn.kotlinpractice

import com.example.muhaimenn.kotlinpractice.model.Response

class PresenterImpl : MainContract.Presenter, MainContract.OnFinishedListener {



    override fun start() {
        var interactorImpl : InteractorImpl= InteractorImpl()
        interactorImpl.getData(this)


        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onFinished(movieList: MutableList<Response>) {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(throwable: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}