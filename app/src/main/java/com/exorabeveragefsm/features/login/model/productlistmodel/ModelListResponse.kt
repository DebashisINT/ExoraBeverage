package com.exorabeveragefsm.features.login.model.productlistmodel

import com.exorabeveragefsm.app.domain.ModelEntity
import com.exorabeveragefsm.app.domain.ProductListEntity
import com.exorabeveragefsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}