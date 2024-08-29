package com.tarikuzzamantito.apps.weatherapp.ui.screen.util

import androidx.compose.ui.graphics.Color

/**
 * Created by Tarikuzzaman Tito on 8/29/2024 2:13 PM
 */
fun Color.Companion.fromHex(colorString: String) =
    Color(android.graphics.Color.parseColor(colorString))