package com.example.muhaimenn.kotlinpractice

import android.util.Log
import com.example.muhaimenn.kotlinpractice.RetrofitInstance.MyRetrofitInstance
import com.example.muhaimenn.kotlinpractice.model.ApiResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InteractorImpl : MainContract.GetBookInteractor {

    private val disposables = CompositeDisposable()

    override fun getData(onFinishedListener: MainContract.OnFinishedListener) {
        val movieList = mutableListOf<ApiResponse>()
        val movieApi = MyRetrofitInstance.retrofitInstance()

        //When using RxJava you need to add the result of the Subscribe to a CompositeDisposable
        //This collects the disposables which you then clear in your onPause or whatever lifecycle method.
        //I recommend not starting with RxJava as it is a steep learning curve.
        // An alternative approach is listed below.
//        disposables.add(movieApi.getMovieRx().subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(
//                        {
//                            onFinishedListener.onFinished(movieList)
//                        },
//                        {
//
//                        }))

        // Alternative to RxJava. Uses Retrofits enqueue functionality which does Async call
        movieApi.getMovie().enqueue(object: Callback<List<ApiResponse>>{
            override fun onFailure(call: Call<List<ApiResponse>>, t: Throwable) {
                Log.e("Retrofit2", "Call Failed: ${t.message}")
            }

            override fun onResponse(call: Call<List<ApiResponse>>, response: Response<List<ApiResponse>>) {
                response.body()?.let { data ->
                    Log.d("Retrofit2", "Data JSON is good")
                    onFinishedListener.onFinished(data)
                } ?: kotlin.run {
                    Log.e("Retrofit2", "Data JSON is null")
                }

            }
        })


    }
}


//blwbdbjcwlcbde