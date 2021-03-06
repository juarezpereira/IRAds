package com.igorronner.irinterstitial.utils

import android.content.Context
import android.util.Log
import com.google.android.gms.ads.reward.RewardItem
import com.google.android.gms.ads.reward.RewardedVideoAdListener
import com.igorronner.irinterstitial.services.AnalyticsService

open class AbstractRewardedVideoAdListener(
        val context: Context
) : RewardedVideoAdListener {

    override fun onRewardedVideoAdClosed() {
        showEvent("onRewardedVideoAdClosed()")
    }

    override fun onRewardedVideoAdLeftApplication() {
        showEvent("onRewardedVideoAdLeftApplication()")
    }

    override fun onRewardedVideoAdLoaded() {
        showEvent("onRewardedVideoAdLoaded()")
    }

    override fun onRewardedVideoAdOpened() {
        showEvent("onRewardedVideoAdOpened()")
    }

    override fun onRewardedVideoCompleted() {
        showEvent("onRewardedVideoCompleted()")
    }

    override fun onRewarded(reward: RewardItem?) {
        showEvent("onRewarded(ammout:${reward?.amount} type: ${reward?.type})")
    }

    override fun onRewardedVideoStarted() {
        showEvent("onRewardedVideoStarted()")
    }

    override fun onRewardedVideoAdFailedToLoad(p0: Int) {
        showEvent("onRewardedVideoAdFailedToLoad($p0)")
    }

    private fun showEvent(message: String) {
        AnalyticsService(context).logEvent(message)
        Log.d("RewardedVideo", message)
    }

}