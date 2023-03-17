package com.exorabeveragefsm.features.viewAllOrder.interf

import com.exorabeveragefsm.features.viewAllOrder.model.ProductOrder

interface EmptyProductOnClick {
    fun emptyProductOnCLick(emptyFound:Boolean)
    fun delProductOnCLick(isDel:Boolean)
}