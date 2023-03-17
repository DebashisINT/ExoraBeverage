package com.exorabeveragefsm.features.login.model.productlistmodel

import com.exorabeveragefsm.app.domain.NewOrderScrOrderEntity
import com.exorabeveragefsm.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}