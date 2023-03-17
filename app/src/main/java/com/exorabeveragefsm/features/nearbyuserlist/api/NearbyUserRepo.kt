package com.exorabeveragefsm.features.nearbyuserlist.api

import com.exorabeveragefsm.app.Pref
import com.exorabeveragefsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.exorabeveragefsm.features.newcollection.model.NewCollectionListResponseModel
import com.exorabeveragefsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}