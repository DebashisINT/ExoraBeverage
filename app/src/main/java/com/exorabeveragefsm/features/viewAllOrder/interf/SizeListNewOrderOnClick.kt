package com.exorabeveragefsm.features.viewAllOrder.interf

import com.exorabeveragefsm.app.domain.NewOrderProductEntity
import com.exorabeveragefsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}