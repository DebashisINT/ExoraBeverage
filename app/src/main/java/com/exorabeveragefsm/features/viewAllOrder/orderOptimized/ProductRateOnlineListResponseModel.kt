package com.exorabeveragefsm.features.viewAllOrder.orderOptimized

import com.exorabeveragefsm.app.domain.ProductOnlineRateTempEntity
import com.exorabeveragefsm.base.BaseResponse
import com.exorabeveragefsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}