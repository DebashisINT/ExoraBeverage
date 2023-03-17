package com.exorabeveragefsm.features.login.api.alarmconfigapi

import com.exorabeveragefsm.app.Pref
import com.exorabeveragefsm.features.login.model.alarmconfigmodel.AlarmConfigResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 19-02-2019.
 */
class AlarmConfigRepo(val apiService: AlarmConfigApi) {
    fun alarmConfig(): Observable<AlarmConfigResponseModel> {
        return apiService.alarmConfigResponse(Pref.session_token!!, Pref.user_id!!)
    }
}