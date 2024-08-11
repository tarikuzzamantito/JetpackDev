package com.tarikuzzamantito.apps.onboarding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.tarikuzzamantito.apps.onboarding.ui.theme.ColorBlue
import com.tarikuzzamantito.apps.onboarding.ui.theme.JetpackDevTheme

/**
 * Created by Tarikuzzaman Tito on 8/11/2024 6:05 PM
 */
class OnboardingMainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackDevTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    val items = ArrayList<OnBoardingData>()
                    items.add(OnBoardingData(R.drawable.food, backgroundColor = Color(0xFF0189C5)))
                    items.add(OnBoardingData(R.drawable.cooking, backgroundColor = Color(0xFFE4AF19)))
                    items.add(OnBoardingData(R.drawable.fruit, backgroundColor = Color(0xFF96E172)))

                    val pagerState = rememberPagerState(
                        initialPage = 0,
                        pageCount = { items.size },
                        initialPageOffsetFraction = 0.4f,
                    )

                    OnBoardingPager(
                        item = items,
                        pagerState = pagerState,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingPager(
    item: List<OnBoardingData>,
    pagerState: PagerState,
    modifier: Modifier
) {
    Box(modifier = modifier) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalPager(state = pagerState) { page ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(item[page].backgroundColor),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Image(
                        painter = painterResource(id = item[page].image),
                        contentDescription = "",
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun OnBoardingPagerPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        val items = ArrayList<OnBoardingData>()
        items.add(OnBoardingData(R.drawable.food))
        items.add(OnBoardingData(R.drawable.cooking))
        items.add(OnBoardingData(R.drawable.fruit))

        val pagerState = rememberPagerState(
            initialPage = 0,
            pageCount = { items.size },
            initialPageOffsetFraction = 0.4f,
        )

        OnBoardingPager(
            item = items,
            pagerState = pagerState,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackDevTheme {
        Greeting("Android")
    }
}*/
