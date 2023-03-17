package com.exorabeveragefsm.features.viewAllOrder.interf

import com.exorabeveragefsm.app.domain.NewOrderGenderEntity
import com.exorabeveragefsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}