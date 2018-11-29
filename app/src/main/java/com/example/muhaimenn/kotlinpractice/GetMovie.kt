package com.example.muhaimenn.kotlinpractice

import android.database.Observable
import com.example.muhaimenn.kotlinpractice.model.Response
import retrofit2.http.GET

interface GetMovie {
    @GET("/filippella/Sample-API-Files/master/json/movies-api.json\"")
    fun getMovie(): Observable<Response>
}