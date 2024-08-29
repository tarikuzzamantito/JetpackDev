package com.tarikuzzamantito.apps.foodia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.tarikuzzamantito.apps.foodia.ui.detail.FoodDetail
import com.tarikuzzamantito.apps.foodia.ui.home.Feed
import com.tarikuzzamantito.apps.foodia.ui.navigation.FoodiaNavigationHost
import com.tarikuzzamantito.apps.foodia.ui.navigation.Tabs
import com.tarikuzzamantito.apps.foodia.ui.theme.JetpackDevTheme

/**
 * Created by Tarikuzzaman Tito on 8/18/2024 12:52 AM
 */
class FoodiaMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackDevTheme {//Scaffold
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting(name = "Android")
                    //Feed(onFoodClick = {})
                    /*FoodDetail(foodId = 2) {

                    }*/
                    FoodiaApp()
                }
            }
        }
    }
}

@Composable
fun FoodiaApp() {
    val navController = rememberNavController()
    Scaffold { paddingValues: PaddingValues ->
        FoodiaNavigationHost(
            startDestination = Tabs.Feed.route,
            modifier = Modifier.padding(paddingValues),
            navController = navController
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FoodiaAppPreview() {
    JetpackDevTheme {
        //Greeting("Android")
    }
}