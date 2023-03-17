package com.exorabeveragefsm.features.activities.api

import com.exorabeveragefsm.features.member.api.TeamApi
import com.exorabeveragefsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}