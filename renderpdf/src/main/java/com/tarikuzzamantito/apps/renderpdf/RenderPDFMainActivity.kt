package com.tarikuzzamantito.apps.renderpdf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.tarikuzzamantito.apps.renderpdf.ui.theme.JetpackDevTheme

class RenderPDFMainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackDevTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PdfViewerScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}