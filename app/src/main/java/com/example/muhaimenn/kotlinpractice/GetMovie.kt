package com.example.muhaimenn.kotlinpractice

import com.example.muhaimenn.kotlinpractice.model.ApiResponse
import io.reactivex.Single
import retrofit2.Call

import retrofit2.http.GET

interface GetMovie {
    @GET("books.json")
    fun getMovieRx(): Single<List<ApiResponse>>

    @GET("books.json")
    fun getMovie(): Call<List<ApiResponse>>
}