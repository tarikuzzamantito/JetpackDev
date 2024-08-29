package com.tarikuzzamantito.apps.foodia.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.material3.DismissDirection
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SwipeToDismiss
import androidx.compose.material3.SwipeToDismissBox
import androidx.compose.material3.SwipeToDismissBoxState
import androidx.compose.material3.SwipeToDismissBoxValue
import androidx.compose.material3.rememberDismissState
import androidx.compose.material3.rememberSwipeToDismissBoxState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

/**
 * Created by Tarikuzzaman Tito on 8/21/2024 5:57 PM
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SwipeToDisMissItem(
    modifier: Modifier = Modifier,
    directions: Set<SwipeToDismissBoxValue> = setOf(SwipeToDismissBoxValue.EndToStart),
    enter: EnterTransition = expandVertically(),
    exit: ExitTransition = shrinkVertically(),
    background: @Composable (offset: Dp) -> Unit,
    content: @Composable (isDismissed: Boolean) -> Unit
) {
    val dismissState = rememberSwipeToDismissBoxState()
    //val dismissState = rememberDismissState()
    //val isDismissed = dismissState.isDismissed(SwipeToDismissBoxValue.EndToStart)
    val isDismissed = dismissState.dismiss(SwipeToDismissBoxValue.EndToStart)
    val offset = with(LocalDensity.current) { dismissState.progress.toDp() }

    AnimatedVisibility(
        visible = !isDismissed,
        modifier = modifier,
        enter = enter,
        exit = exit
    ) {
        /*SwipeToDismiss(
            state = dismissState,
            background = { background(offset) },
            dismissContent = { content(isDismissed) })*/

        SwipeToDismissBox(
            state = dismissState,
            backgroundContent = { background(offset) },
            modifier = modifier,
            enableDismissFromStartToEnd = SwipeToDismissBoxValue.StartToEnd in directions,
            enableDismissFromEndToStart = SwipeToDismissBoxValue.EndToStart in directions,
            content = { content(isDismissed) }
        )

    }


}