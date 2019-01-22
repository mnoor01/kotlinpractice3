package com.example.muhaimenn.kotlinpractice

import com.example.muhaimenn.kotlinpractice.model.Response
import io.reactivex.Observable
import retrofit2.Call

import retrofit2.http.GET

interface GetMovie {
    @GET("books.json")
    fun getMovie(): Observable<MutableList<Response>>
}