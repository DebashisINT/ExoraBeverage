package com.exorabeveragefsm.features.orderList.model

import com.exorabeveragefsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}