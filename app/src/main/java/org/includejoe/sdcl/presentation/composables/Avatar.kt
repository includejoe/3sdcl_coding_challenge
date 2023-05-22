package org.includejoe.sdcl.presentation.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import org.includejoe.sdcl.R

@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    size: Dp,
    src: String? = null,
) {
    Image(
        painter = if(src !== null) rememberAsyncImagePainter(src)
        else painterResource(R.drawable.ic_avatar),
        modifier = modifier
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
            ),
        contentDescription = "avatar",
        contentScale = ContentScale.Crop,
    )
}