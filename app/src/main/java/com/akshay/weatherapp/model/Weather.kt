package com.akshay.weatherapp.model

data class Weather(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<DailyWeather>,
    val message: Double
)