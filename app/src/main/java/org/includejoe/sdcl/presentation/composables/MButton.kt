package org.includejoe.sdcl.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: Int,
    outline: Boolean = false,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .width(100.dp)
            .height(35.dp)
            .clip(MaterialTheme.shapes.medium)
            .border(
                border = BorderStroke(width = 2.dp, color = MaterialTheme.colors.primary),
                shape = MaterialTheme.shapes.medium
            )
            .background(if(outline) Color.Transparent else MaterialTheme.colors.primary)
            .clickable {
                onClick()
            }
    ) {
        Text(
            text = stringResource(id = text),
            modifier = Modifier.padding(vertical = 8.dp),
            color = if(outline) MaterialTheme.colors.onBackground
            else MaterialTheme.colors.onPrimary,
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Bold
        )
    }
}