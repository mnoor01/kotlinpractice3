package com.example.muhaimenn.kotlinpractice.RetrofitInstance

import com.example.muhaimenn.kotlinpractice.GetMovie
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MyRetrofitInstance {

    fun retrofitInstance() {
        val retrofitInstance= Retrofit.Builder().
                addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://raw.githubusercontent.com").build()
        return retrofitInstance.create(GetMovie ::class.java)

    }

}
///wljhefcjoqhwkj;cqw;dc