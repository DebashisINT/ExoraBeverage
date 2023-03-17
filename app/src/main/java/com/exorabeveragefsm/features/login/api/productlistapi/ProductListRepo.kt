package com.exorabeveragefsm.features.login.api.productlistapi

import com.exorabeveragefsm.app.Pref
import com.exorabeveragefsm.app.domain.ProductListEntity
import com.exorabeveragefsm.app.utils.AppUtils
import com.exorabeveragefsm.features.login.model.productlistmodel.ProductListOfflineResponseModel
import com.exorabeveragefsm.features.login.model.productlistmodel.ProductListOfflineResponseModelNew
import com.exorabeveragefsm.features.login.model.productlistmodel.ProductListResponseModel
import com.exorabeveragefsm.features.login.model.productlistmodel.ProductRateListResponseModel
import com.exorabeveragefsm.features.viewAllOrder.orderOptimized.ProductRateOnlineListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class ProductListRepo(val apiService: ProductListApi) {
    fun getProductList(session_token: String, user_id: String, last_update_date: String): Observable<ProductListResponseModel> {
        Timber.d("ProductListRepo hit ${Pref.isOrderShow} ${Pref.IsShowQuotationFooterforEurobond}" +  "Time : " + AppUtils.getCurrentDateTime())
        return apiService.getProductList(session_token, user_id, last_update_date)
    }


    fun getProductRateList(shop_id: String): Observable<ProductRateListResponseModel> {
        return apiService.getProductRateList(Pref.session_token!!, Pref.user_id!!, shop_id)
    }


    fun getProductRateListByEntity(shop_id: String): Observable<ProductRateOnlineListResponseModel> {
        return apiService.getProductRateOnlineList(Pref.session_token!!, Pref.user_id!!, shop_id)
    }

    fun getProductRateOfflineList(): Observable<ProductListOfflineResponseModel> {
        return apiService.getOfflineProductRateList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getProductRateOfflineListNew(): Observable<ProductListOfflineResponseModelNew> {
        return apiService.getOfflineProductRateListNew(Pref.session_token!!, Pref.user_id!!)
    }
}