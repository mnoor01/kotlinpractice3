package com.example.muhaimenn.kotlinpractice

import io.reactivex.Observable
import okhttp3.Response
import retrofit2.http.GET

interface GetMovie {
    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")
    fun getMovie(): Observable<List<Response>>
}