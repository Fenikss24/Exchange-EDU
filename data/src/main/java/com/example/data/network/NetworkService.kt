package com.example.data.network

import com.example.domain.Country
import com.example.domain.Rate
import retrofit2.http.GET
import retrofit2.http.Query
import kotlin.io.encoding.Base64

interface NetworkService {
    @GET("countries")
    suspend fun getCountries(): List<Country>
    @GET("rates")
    suspend fun getRate(@Query("base") base: String): Rate
}