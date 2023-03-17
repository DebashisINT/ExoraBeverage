package com.exorabeveragefsm.features.location.shopRevisitStatus

import com.exorabeveragefsm.base.BaseResponse
import com.exorabeveragefsm.features.location.model.ShopDurationRequest
import com.exorabeveragefsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}