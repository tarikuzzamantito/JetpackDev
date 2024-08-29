package com.tarikuzzamantito.apps.foodia.cart

import androidx.lifecycle.ViewModel
import com.tarikuzzamantito.apps.foodia.model.OrderLine
import com.tarikuzzamantito.apps.foodia.model.FoodRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Created by Tarikuzzaman Tito on 8/21/2024 5:40 PM
 */
class CartViewModel(
    foodRepo: FoodRepo = FoodRepo
) : ViewModel() {
    private val _orderLines: MutableStateFlow<List<OrderLine>> =
        MutableStateFlow(foodRepo.getCart())
    val orderLines: StateFlow<List<OrderLine>> = _orderLines.asStateFlow()

    fun increaseFoodCount(foodId: Long) {
        val currentCount = _orderLines.value.first { it.foodItem.id == foodId }.count
        updateCount(foodId, currentCount + 1)
    }

    fun decreaseFoodCount(foodId: Long) {
        val currentCount = _orderLines.value.first { it.foodItem.id == foodId }.count
        if (currentCount == 1) {
            removeFoodItem(foodId)
        } else {
            updateCount(foodId, currentCount - 1)
        }
    }

    fun removeFoodItem(foodId: Long) {
        _orderLines.value = _orderLines.value.filter { it.foodItem.id != foodId }
    }

    private fun updateCount(foodId: Long, count: Int) {
        _orderLines.value = _orderLines.value.map {
            if (it.foodItem.id == foodId) {
                it.copy(count = count)
            } else {
                it
            }
        }
    }
}