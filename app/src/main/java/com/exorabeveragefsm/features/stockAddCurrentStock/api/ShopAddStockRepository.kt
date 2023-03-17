package com.exorabeveragefsm.features.stockAddCurrentStock.api

import com.exorabeveragefsm.base.BaseResponse
import com.exorabeveragefsm.features.location.model.ShopRevisitStatusRequest
import com.exorabeveragefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.exorabeveragefsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.exorabeveragefsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.exorabeveragefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}