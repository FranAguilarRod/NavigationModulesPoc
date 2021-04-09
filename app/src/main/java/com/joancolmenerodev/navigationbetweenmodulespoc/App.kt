package com.joancolmenerodev.navigationbetweenmodulespoc

import android.app.Application
import com.joancolmenerodev.featureone.FeatureOneInNavigatorImpl
import com.joancolmenerodev.featureone.di.DaggerFeatureOneComponent
import com.joancolmenerodev.featureone.di.FeatureOneComponent
import com.joancolmenerodev.featureone.di.FeatureOneComponentProvider
import com.joancolmenerodev.featuretwo.FeatureTwoInNavigatorImpl
import com.joancolmenerodev.featuretwo.di.DaggerFeatureTwoComponent
import com.joancolmenerodev.featuretwo.di.FeatureTwoComponent
import com.joancolmenerodev.featuretwo.di.FeatureTwoComponentProvider
import com.joancolmenerodev.navigation.di.DaggerNavigationComponent

open class App : Application(), FeatureOneComponentProvider, FeatureTwoComponentProvider {

    //This in our case should be on AppComponent so each submodule would see it

    override val featureOneComponent: FeatureOneComponent
        get() = DaggerFeatureOneComponent.factory().create(navigationComponent)

    override val featureTwoComponent: FeatureTwoComponent
        get() = DaggerFeatureTwoComponent.factory().create(navigationComponent)

    private val navigationComponent by lazy {
        DaggerNavigationComponent.factory().create(
            FeatureOneInNavigatorImpl.Factory(),
            FeatureTwoInNavigatorImpl.Factory()
        )
    }
}