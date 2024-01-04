package com.app.wanandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.app.wanandroid.nav.BottomNavBar
import com.app.wanandroid.navigation.NavigationGraph
import com.app.wanandroid.ui.theme.WanAndroidComposeTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            WanAndroidComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
//                        topBar = {
//                            TopBar("Header")
//                        },
                        bottomBar = {
                            BottomNavBar(navController)
                        },
                    ) { innerPadding ->
                        NavigationGraph(navController, innerPadding)
                    }
                }
            }
        }
    }
}
