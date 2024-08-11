package com.tarikuzzamantito.apps.onboarding02

import android.content.Context

/**
 * Created by Tarikuzzaman Tito on 8/12/2024 1:14 AM
 */
class Utils(private val context: Context) {
    fun isOnboardingCompleted(): Boolean {
        return context.getSharedPreferences("onboarding", Context.MODE_PRIVATE)
            .getBoolean("completed", false)
    }

    fun setOnboardingCompleted() {
        context.getSharedPreferences("onboarding", Context.MODE_PRIVATE)
            .edit()
            .putBoolean("completed", true)
            .apply()
    }
}