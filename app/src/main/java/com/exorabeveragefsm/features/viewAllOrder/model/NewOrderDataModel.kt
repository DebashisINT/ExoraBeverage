package com.exorabeveragefsm.features.viewAllOrder.model

import com.exorabeveragefsm.app.domain.NewOrderColorEntity
import com.exorabeveragefsm.app.domain.NewOrderGenderEntity
import com.exorabeveragefsm.app.domain.NewOrderProductEntity
import com.exorabeveragefsm.app.domain.NewOrderSizeEntity
import com.exorabeveragefsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

