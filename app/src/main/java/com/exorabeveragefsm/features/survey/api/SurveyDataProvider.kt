package com.exorabeveragefsm.features.survey.api

import com.exorabeveragefsm.features.photoReg.api.GetUserListPhotoRegApi
import com.exorabeveragefsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}