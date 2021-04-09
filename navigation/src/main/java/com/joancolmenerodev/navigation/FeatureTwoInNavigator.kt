package com.joancolmenerodev.navigation

import android.app.Activity

interface FeatureTwoInNavigator {

    fun openFeatureTwo(title: String, url: String)

    interface Factory {
        fun create(activity: Activity): FeatureTwoInNavigator
    }
}
