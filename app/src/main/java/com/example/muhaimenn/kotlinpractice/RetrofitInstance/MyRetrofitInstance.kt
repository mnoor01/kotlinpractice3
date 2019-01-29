package com.example.muhaimenn.kotlinpractice.RetrofitInstance

import com.example.muhaimenn.kotlinpractice.GetMovie
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object MyRetrofitInstance {

    fun retrofitInstance(): GetMovie {
        val retrofitInstance = Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(OkHttpClient()
                        .newBuilder()
                        .addInterceptor(
                                HttpLoggingInterceptor() //Adds a logger which prints out the Network calls
                                        .setLevel(HttpLoggingInterceptor.Level.BODY)
                        ).build()
                )
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://raw.githubusercontent.com/tamingtext/book/master/apache-solr/example/exampledocs/").build()

        return retrofitInstance.create(GetMovie::class.java)

    }
}
