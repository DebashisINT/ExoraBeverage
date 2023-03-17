package com.exorabeveragefsm.features.document.api

import com.exorabeveragefsm.features.dymanicSection.api.DynamicApi
import com.exorabeveragefsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}