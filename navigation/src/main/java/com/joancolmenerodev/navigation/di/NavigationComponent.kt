package com.joancolmenerodev.navigation.di

import com.joancolmenerodev.navigation.FeatureOneInNavigator
import com.joancolmenerodev.navigation.FeatureTwoInNavigator
import dagger.BindsInstance
import dagger.Component

@Component
interface NavigationComponent {

    fun featureOneInNavigator(): FeatureOneInNavigator.Factory
    fun featureTwoInNavigator(): FeatureTwoInNavigator.Factory

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance featureOneInNavigator: FeatureOneInNavigator.Factory,
            @BindsInstance featureTwoInNavigator: FeatureTwoInNavigator.Factory
        ): NavigationComponent
    }
}
