package com.joancolmenerodev.navigation

import android.app.Activity

interface FeatureOneInNavigator {

    fun openFeatureOne()

    interface Factory {
        fun create(activity: Activity): FeatureOneInNavigator
    }
}
