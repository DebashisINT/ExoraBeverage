package com.exorabeveragefsm.features.weather.api

import com.exorabeveragefsm.base.BaseResponse
import com.exorabeveragefsm.features.task.api.TaskApi
import com.exorabeveragefsm.features.task.model.AddTaskInputModel
import com.exorabeveragefsm.features.weather.model.ForeCastAPIResponse
import com.exorabeveragefsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}