package com.joancolmenerodev.featuretwo.di

import com.joancolmenerodev.featuretwo.FeatureTwoActivity
import com.joancolmenerodev.featuretwo.FeatureTwoContract
import com.joancolmenerodev.featuretwo.FeatureTwoPresenterImpl
import com.joancolmenerodev.navigation.FeatureOneInNavigator
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface FeatureTwoActivityModule {
    @Binds
    fun bindView(
        impl: FeatureTwoActivity
    ): FeatureTwoContract.View

    @Binds
    fun bindPresenter(
        impl: FeatureTwoPresenterImpl
    ): FeatureTwoContract.Presenter

    companion object {
        @Provides
        fun providesFeatureOneInNavigator(
            activity: FeatureTwoActivity,
            factory: FeatureOneInNavigator.Factory
        ): FeatureOneInNavigator {
            return factory.create(activity)
        }
    }
}