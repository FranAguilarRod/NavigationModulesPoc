package com.joancolmenerodev.featureone.di

import com.joancolmenerodev.featureone.FeatureOneActivity
import com.joancolmenerodev.featureone.FeatureOneContract
import com.joancolmenerodev.featureone.FeatureOnePresenterImpl
import com.joancolmenerodev.navigation.FeatureTwoInNavigator
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface FeatureOneActivityModule {
    @Binds
    fun bindView(
        impl: FeatureOneActivity
    ): FeatureOneContract.View

    @Binds
    fun bindPresenter(
        impl: FeatureOnePresenterImpl
    ): FeatureOneContract.Presenter

    companion object {
        @Provides
        fun providesFeatureOneInNavigator(
            activity: FeatureOneActivity,
            factory: FeatureTwoInNavigator.Factory
        ): FeatureTwoInNavigator {
            return factory.create(activity)
        }
    }
}