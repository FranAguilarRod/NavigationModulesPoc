package com.joancolmenerodev.featuretwo

import android.app.Activity
import com.joancolmenerodev.navigation.FeatureTwoInNavigator

class FeatureTwoInNavigatorImpl(private val activity: Activity) : FeatureTwoInNavigator {

    override fun openFeatureTwo(title: String, url: String) {
        activity.startActivity(FeatureTwoActivity.buildIntent(activity, title, url))
    }

    class Factory : FeatureTwoInNavigator.Factory {
        override fun create(activity: Activity): FeatureTwoInNavigator {
            return FeatureTwoInNavigatorImpl(activity)
        }
    }
}