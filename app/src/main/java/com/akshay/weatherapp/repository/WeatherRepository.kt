package com.akshay.weatherapp.repository

import com.akshay.weatherapp.network.WeatherApi
import javax.inject.Inject


class WeatherRepository @Inject constructor(private val api: WeatherApi) {

}