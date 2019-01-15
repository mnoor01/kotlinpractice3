package com.example.muhaimenn.kotlinpractice.RetrofitInstance

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MyRetrofitInstance {

    fun getRetro() {
        val retrofit= Retrofit.Builder().
                addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://raw.githubusercontent.com").build()

    }

}
///wljhefcjoqhwkj;cqw;dc