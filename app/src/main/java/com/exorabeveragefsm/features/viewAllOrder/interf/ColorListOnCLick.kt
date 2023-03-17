package com.exorabeveragefsm.features.viewAllOrder.interf

import com.exorabeveragefsm.app.domain.NewOrderGenderEntity
import com.exorabeveragefsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}