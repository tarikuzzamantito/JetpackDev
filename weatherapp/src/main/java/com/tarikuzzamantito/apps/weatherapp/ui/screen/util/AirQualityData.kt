package com.tarikuzzamantito.apps.weatherapp.ui.screen.util

import androidx.annotation.DrawableRes
import com.tarikuzzamantito.apps.weatherapp.R

/**
 * Created by Tarikuzzaman Tito on 8/29/2024 2:12 PM
 */
data class AirQualityItem(
    @DrawableRes val icon: Int,
    val title: String,
    val value: String
)

val AirQualityData = listOf(
    AirQualityItem(
        title = "Real Feel",
        value = "23.8",
        icon = R.drawable.ic_real_feel
    ),
    AirQualityItem(
        title = "Wind",
        value = "9km/h",
        icon = R.drawable.ic_wind_qality,
    ),
    AirQualityItem(
        title = "SO2",
        value = "0.9",
        icon = R.drawable.ic_so2
    ),
    AirQualityItem(
        title = "Rain",
        value = "68%",
        icon = R.drawable.ic_rain_chance
    ),
    AirQualityItem(
        title = "UV Index",
        value = "3",
        icon = R.drawable.ic_uv_index
    ),
    AirQualityItem(
        title = "OЗ",
        value = "50",
        icon = R.drawable.ic_o3
    )
)