package com.exorabeveragefsm.features.viewAllOrder.interf

import com.exorabeveragefsm.app.domain.NewOrderColorEntity
import com.exorabeveragefsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}