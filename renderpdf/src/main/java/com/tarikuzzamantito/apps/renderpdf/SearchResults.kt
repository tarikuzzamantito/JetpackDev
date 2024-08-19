package com.tarikuzzamantito.apps.renderpdf

import android.graphics.RectF

/**
 * Created by Tarikuzzaman Tito on 8/20/2024 12:33 AM
 * [Philipp Lackner] https://youtu.be/4FL6xLhB0vk
 */
data class SearchResults(
    val page: Int,
    val results: List<RectF>
)