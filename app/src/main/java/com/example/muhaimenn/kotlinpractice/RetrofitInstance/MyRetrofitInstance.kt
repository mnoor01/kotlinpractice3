package com.example.muhaimenn.kotlinpractice.RetrofitInstance

import android.util.Log
import com.example.muhaimenn.kotlinpractice.GetMovie
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MyRetrofitInstance {
companion object {


    public fun retrofitInstance(): GetMovie? {
        val retrofitInstance = Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://raw.githubusercontent.com/tamingtext/book/master/apache-solr/example/exampledocs/").build()

        return retrofitInstance.create(GetMovie::class.java)

    }
}

}
///wljhefcjoqhwkj;cqw;dc