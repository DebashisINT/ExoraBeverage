package com.exorabeveragefsm.features.weather.api

import com.exorabeveragefsm.features.task.api.TaskApi
import com.exorabeveragefsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}