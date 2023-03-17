package com.exorabeveragefsm.features.dashboard.presentation.api.dayStartEnd

import com.exorabeveragefsm.features.stockCompetetorStock.api.AddCompStockApi
import com.exorabeveragefsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}