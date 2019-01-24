package com.example.muhaimenn.kotlinpractice.model

data class Response(
	val seriesT: String ,
	val pagesI: Int ,
	val author: String ,
	val price: Double ,
	val cat: List<String> ,
	val name: String ,
	val genreS: String ,
	val sequenceI: Int ,
	val inStock: Boolean ,
	val id: String

)
