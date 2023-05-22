package org.includejoe.sdcl.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.includejoe.sdcl.R

@Composable
fun TabView(
    modifier: Modifier = Modifier,
    tabModels: List<Int>,
    onTabSelected: (selectedTabIndex: Int) -> Unit
) {
    var selectedTabIndex by remember { mutableStateOf(1) }
    
    Column(
        modifier = Modifier
            .padding(horizontal = 24.dp)
            .fillMaxWidth()
            .shadow(
                elevation = 3.dp,
                ambientColor = Color.Red,
                spotColor = Color.Red,
                shape = MaterialTheme.shapes.medium
            )
            .background(
                Color.White,
                shape = MaterialTheme.shapes.medium
            ),
    ) {
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = stringResource(id = R.string.details),
            style = MaterialTheme.typography.h1,
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        TabRow(
            selectedTabIndex = selectedTabIndex,
            backgroundColor = Color.Transparent,
            contentColor = MaterialTheme.colors.onBackground,
            indicator = {
                TabRowDefaults.Indicator(
                    modifier = Modifier.tabIndicatorOffset(it[selectedTabIndex]),
                    color = MaterialTheme.colors.primary,
                    height = TabRowDefaults.IndicatorHeight * 1.2f
                )
            },
            modifier = modifier.fillMaxWidth()
        ) {
            tabModels.forEachIndexed { index, item ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = {
                        selectedTabIndex = index
                        onTabSelected(index)
                    },
                    selectedContentColor = MaterialTheme.colors.onBackground,
                ) {
                    Box(
                        modifier = Modifier
                            .padding(vertical = 6.dp)
                            .background(
                                MaterialTheme.colors.background,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(horizontal = 10.dp, vertical = 5.dp)
                            .clip(MaterialTheme.shapes.medium),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(id = item),
                            color = MaterialTheme.colors.onBackground,
                            style = MaterialTheme.typography.body1,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp
                        )
                    }

                }
            }
        }

        when(selectedTabIndex) {
            0 -> ItemOne()
            1 -> ItemTwo()
            2 -> ItemThree()
        }
    }

    Spacer(modifier = Modifier.height(30.dp))
}