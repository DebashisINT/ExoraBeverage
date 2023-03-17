package com.exorabeveragefsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.exorabeveragefsm.app.FileUtils
import com.exorabeveragefsm.base.BaseResponse
import com.exorabeveragefsm.features.NewQuotation.model.*
import com.exorabeveragefsm.features.addshop.model.AddShopRequestData
import com.exorabeveragefsm.features.addshop.model.AddShopResponse
import com.exorabeveragefsm.features.damageProduct.model.DamageProductResponseModel
import com.exorabeveragefsm.features.damageProduct.model.delBreakageReq
import com.exorabeveragefsm.features.damageProduct.model.viewAllBreakageReq
import com.exorabeveragefsm.features.login.model.userconfig.UserConfigResponseModel
import com.exorabeveragefsm.features.myjobs.model.WIPImageSubmit
import com.exorabeveragefsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}