package com.exorabeveragefsm.features.location.shopRevisitStatus

import com.exorabeveragefsm.features.location.shopdurationapi.ShopDurationApi
import com.exorabeveragefsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}