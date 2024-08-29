package com.tarikuzzamantito.apps.weatherapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tarikuzzamantito.apps.weatherapp.ui.screen.components.ActionBar
import com.tarikuzzamantito.apps.weatherapp.ui.screen.components.AirQuality
import com.tarikuzzamantito.apps.weatherapp.ui.screen.components.DailyForecast
import com.tarikuzzamantito.apps.weatherapp.ui.screen.components.WeeklyForecast
import com.tarikuzzamantito.apps.weatherapp.ui.theme.ColorBackground

/**
 * Created by Tarikuzzaman Tito on 8/29/2024 2:39 PM
 */
@Composable
fun WeatherScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = ColorBackground
    ) { paddings ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(paddings)
                .padding(horizontal = 24.dp, vertical = 10.dp)
        ) {
            ActionBar()
            Spacer(
                modifier = Modifier.height(12.dp)
            )
            DailyForecast()
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            AirQuality()
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            WeeklyForecast()
        }
    }
}