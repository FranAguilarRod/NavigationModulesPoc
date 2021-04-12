package com.joancolmenerodev.navigation.di

import android.app.Activity
import com.joancolmenerodev.navigation.FeatureOneInNavigator
import com.joancolmenerodev.navigation.FeatureTwoInNavigator
import dagger.Module
import dagger.Provides

@Module
object NavigationModule {

    @Provides
    fun providesFeatureOneInNavigator(
        activity: Activity,
        factory: FeatureOneInNavigator.Factory
    ): FeatureOneInNavigator {
        return factory.create(activity)
    }

    @Provides
    fun providesFeatureTwoInNavigator(
        activity: Activity,
        factory: FeatureTwoInNavigator.Factory
    ): FeatureTwoInNavigator {
        return factory.create(activity)
    }
}