package com.akshay.weatherapp.network

import com.akshay.weatherapp.model.Weather
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface WeatherApi {
    @GET("")
    suspend fun getWeatherData(): Weather
}