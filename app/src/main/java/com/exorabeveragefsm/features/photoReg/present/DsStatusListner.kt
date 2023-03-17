package com.exorabeveragefsm.features.photoReg.present

import com.exorabeveragefsm.app.domain.ProspectEntity
import com.exorabeveragefsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}