package com.exorabeveragefsm.features.stockCompetetorStock.api

import com.exorabeveragefsm.base.BaseResponse
import com.exorabeveragefsm.features.orderList.model.NewOrderListResponseModel
import com.exorabeveragefsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.exorabeveragefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}