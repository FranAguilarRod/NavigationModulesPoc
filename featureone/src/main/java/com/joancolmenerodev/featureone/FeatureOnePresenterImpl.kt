package com.joancolmenerodev.featureone

import com.joancolmenerodev.navigation.FeatureTwoInNavigator
import javax.inject.Inject

interface FeatureOneContract {

    interface Presenter {
        fun openWebsite(title: String?, url: String?)
    }

    interface View {
        fun showError(error: String)
    }
}

class FeatureOnePresenterImpl @Inject constructor(
    private val view: FeatureOneContract.View,
    private val navigator: FeatureTwoInNavigator,
) : FeatureOneContract.Presenter {

    override fun openWebsite(title: String?, url: String?) {
        if (title.isNullOrEmpty() || url.isNullOrEmpty()) {
            view.showError("Title or Url shouldn't be empty!")
        } else {
            navigator.openFeatureTwo(title, url)
        }
    }
}