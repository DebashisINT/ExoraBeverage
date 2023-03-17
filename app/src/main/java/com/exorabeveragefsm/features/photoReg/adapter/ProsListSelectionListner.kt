package com.exorabeveragefsm.features.photoReg.adapter

import com.exorabeveragefsm.features.photoReg.model.ProsCustom
import com.exorabeveragefsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}