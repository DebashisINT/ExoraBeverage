package com.exorabeveragefsm.features.viewAllOrder.interf

import com.exorabeveragefsm.app.domain.NewOrderGenderEntity
import com.exorabeveragefsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}