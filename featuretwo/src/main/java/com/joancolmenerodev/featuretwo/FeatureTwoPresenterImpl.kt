package com.joancolmenerodev.featuretwo

import com.joancolmenerodev.navigation.FeatureOneInNavigator
import javax.inject.Inject

interface FeatureTwoContract {

    interface Presenter {
        fun goBack()
    }

    interface View {
        fun showMessage(message: String)
    }
}

class FeatureTwoPresenterImpl @Inject constructor(
    private val view: FeatureTwoContract.View,
    private val navigator: FeatureOneInNavigator,
) : FeatureTwoContract.Presenter {

    override fun goBack() {
        view.showMessage("See you later alligator!")
        navigator.openFeatureOne()
    }
}