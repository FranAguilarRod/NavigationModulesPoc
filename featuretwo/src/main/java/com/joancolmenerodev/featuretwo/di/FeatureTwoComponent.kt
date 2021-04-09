package com.joancolmenerodev.featuretwo.di

import com.joancolmenerodev.featuretwo.FeatureTwoActivity
import com.joancolmenerodev.navigation.di.NavigationComponent
import dagger.Component

@Component(dependencies = [NavigationComponent::class])
interface FeatureTwoComponent {

    fun featureTwoComponent(): FeatureTwoActivity.Component.Factory

    @Component.Factory
    interface Factory {
        fun create(navigationComponent: NavigationComponent): FeatureTwoComponent
    }
}