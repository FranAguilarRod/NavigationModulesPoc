package com.joancolmenerodev.featureone.di

import com.joancolmenerodev.featureone.FeatureOneActivity
import com.joancolmenerodev.navigation.di.NavigationComponent
import dagger.Component

@Component(dependencies = [NavigationComponent::class])
interface FeatureOneComponent {

    fun featureOneComponent(): FeatureOneActivity.Component.Factory

    @Component.Factory
    interface Factory {
        fun create(navigationComponent: NavigationComponent): FeatureOneComponent
    }
}