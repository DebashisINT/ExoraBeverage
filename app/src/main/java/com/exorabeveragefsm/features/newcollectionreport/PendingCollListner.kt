package com.exorabeveragefsm.features.newcollectionreport

import com.exorabeveragefsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}