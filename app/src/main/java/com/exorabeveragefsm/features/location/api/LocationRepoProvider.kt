package com.exorabeveragefsm.features.location.api

import com.exorabeveragefsm.features.location.shopdurationapi.ShopDurationApi
import com.exorabeveragefsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}