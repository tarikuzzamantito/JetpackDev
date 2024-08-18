package com.tarikuzzamantito.apps.foodia.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tarikuzzamantito.apps.foodia.model.Filter
import com.tarikuzzamantito.apps.foodia.model.FoodCollection
import com.tarikuzzamantito.apps.foodia.model.FoodRepo
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.tarikuzzamantito.apps.foodia.ui.components.DestinationBar
import com.tarikuzzamantito.apps.foodia.ui.components.FilterBar
import com.tarikuzzamantito.apps.foodia.ui.components.FoodCollectionComp

/**
 * Created by Tarikuzzaman Tito on 8/18/2024 6:23 AM
 */
@Composable
fun Feed(
    onFoodClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    val foodCollection = remember { FoodRepo.getFoods() }
    val filters = remember { FoodRepo.getFilters() }
    Feed(
        foodCollection = foodCollection,
        filters = filters,
        onFoodClick = onFoodClick,
        modifier = modifier,
    )
}


@Composable
private fun Feed(
    foodCollection: List<FoodCollection>,
    filters: List<Filter>,
    onFoodClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Box {
            FoodCollectionList(
                foodCollection = foodCollection,
                filters = filters,
                onFoodClick = onFoodClick
            )
            DestinationBar()
        }
    }
}


@Composable
private fun FoodCollectionList(
    foodCollection: List<FoodCollection>,
    filters: List<Filter>,
    onFoodClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    var filtersVisible by rememberSaveable {
        mutableStateOf(false)
    }
    Box(modifier = modifier) {
        LazyColumn {
            item {
                Spacer(
                    modifier = Modifier.windowInsetsTopHeight(
                        WindowInsets.statusBars.add(WindowInsets(top = 56.dp))
                    )
                )
                FilterBar(filter = filters) {
                    filtersVisible = true
                }
            }
            itemsIndexed(foodCollection) { index: Int, foodCollection: FoodCollection ->
                if (index > 0) {
                    Divider(thickness = 2.dp)
                }
                FoodCollectionComp(
                    foodCollection = foodCollection,
                    onFoodClick = onFoodClick,
                )
            }
        }
    }

}