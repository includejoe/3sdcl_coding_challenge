package org.includejoe.sdcl.presentation.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.includejoe.sdcl.R

@Composable
fun Avatar(
    size: Dp,
    src: ImageBitmap? = null,
) {
    val modifier: Modifier = Modifier
        .size(size)
        .clip(shape = RoundedCornerShape(size / 2))
        .background(
            MaterialTheme.colors.background,
            shape = RoundedCornerShape(size / 2)
        )
        .layoutId("avatar")
        .border(
            border = BorderStroke(width = 3.dp, color = MaterialTheme.colors.primary),
            shape = RoundedCornerShape(size / 2)
        )

    if (src !== null) {
        Image(
            bitmap = src,
            modifier = modifier,
            contentDescription = "avatar",
            contentScale = ContentScale.Crop,
        )
    } else {
        Image(
            painter = painterResource(id = R.drawable.ic_avatar),
            modifier = modifier,
            contentDescription = "avatar",
            contentScale = ContentScale.Crop
        )
    }
}