package com.example.muhaimenn.kotlinpractice.model
import com.google.gson.annotations.SerializedName


data class ApiResponse(
    @SerializedName("author")
    val author: String,
    @SerializedName("cat")
    val cat: List<String>,
    @SerializedName("genre_s")
    val genreS: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("inStock")
    val inStock: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("pages_i")
    val pagesI: Int,
    @SerializedName("price")
    val price: Double,
    @SerializedName("sequence_i")
    val sequenceI: Int,
    @SerializedName("series_t")
    val seriesT: String
)