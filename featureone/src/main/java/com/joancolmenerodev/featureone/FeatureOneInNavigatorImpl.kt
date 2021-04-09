package com.joancolmenerodev.featureone

import android.app.Activity
import com.joancolmenerodev.navigation.FeatureOneInNavigator

class FeatureOneInNavigatorImpl(private val activity: Activity) : FeatureOneInNavigator {

    override fun openFeatureOne() {
        activity.startActivity(FeatureOneActivity.buildIntent(activity))
    }

    class Factory : FeatureOneInNavigator.Factory {
        override fun create(activity: Activity): FeatureOneInNavigator {
            return FeatureOneInNavigatorImpl(activity)
        }
    }
}