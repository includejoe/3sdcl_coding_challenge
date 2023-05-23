package org.includejoe.sdcl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import org.includejoe.sdcl.presentation.composables.*
import org.includejoe.sdcl.presentation.theme.SdclTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SdclTheme {
                // TODO: Add Gradient to header

                var selectedTabIndex by remember { mutableStateOf(0) }
                val constraints = ConstraintSet {
                    val header = createRefFor("header")
                    val panel = createRefFor("panel")

                    constrain(panel) {
                        top.linkTo(header.bottom, margin = (-30).dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                        .verticalScroll(rememberScrollState())
                ) {

                    ConstraintLayout(
                        constraintSet = constraints
                    ) {
                        Header(modifier = Modifier.layoutId("header"))
                        Panel(modifier = Modifier.layoutId("panel"))
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                    
                    TabView(tabModels = listOf(
                        R.string.item_one,
                        R.string.item_two,
                        R.string.item_three
                    )) { selectedTabIndex = it  }
                }
            }

        }
    }
}
