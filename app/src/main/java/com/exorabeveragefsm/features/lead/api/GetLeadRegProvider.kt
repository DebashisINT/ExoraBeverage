package com.exorabeveragefsm.features.lead.api

import com.exorabeveragefsm.features.NewQuotation.api.GetQuotListRegRepository
import com.exorabeveragefsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}