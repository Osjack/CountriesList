package com.dev.joks.countrieslist.service

import com.dev.joks.countrieslist.service.model.Country
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface ApiService {

    @GET("all")
    fun getCountries(): Deferred<List<Country>>
}