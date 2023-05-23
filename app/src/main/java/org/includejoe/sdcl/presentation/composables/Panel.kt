package org.includejoe.sdcl.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.includejoe.sdcl.R

@Composable
fun Panel(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(horizontal = 24.dp)
            .fillMaxWidth()
            .height(180.dp)
            .shadow(
                elevation = 4.dp,
                ambientColor = MaterialTheme.colors.secondary,
                spotColor = MaterialTheme.colors.secondary,
                shape = MaterialTheme.shapes.medium
            )
            .background(
                Color.White,
                shape = MaterialTheme.shapes.medium
            ),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(modifier = modifier
                .size(60.dp)
                .shadow(
                    elevation = 4.dp,
                    ambientColor = MaterialTheme.colors.secondary,
                    spotColor = MaterialTheme.colors.secondary,
                    shape = RoundedCornerShape(8.dp)
                ).background(
                    Color.White,
                    shape = RoundedCornerShape(8.dp)
                ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_agenda),
                    contentDescription = "agenda",
                    modifier = Modifier.size(30.dp)
                )
            }

            Spacer(modifier = Modifier.width(23.dp))

            Text(
                text = stringResource(id = R.string.panel),
                style = MaterialTheme.typography.h1,
                color = MaterialTheme.colors.onBackground,
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal
            )
        }

        Spacer(modifier = Modifier.height(28.dp))

        Text(
            modifier = Modifier.padding(horizontal = 28.dp),
            text = "Lorem ipsum dolor sit amet, consectetur" +
                    " adipiscing elit. Nullam elementum nunc nec",
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.secondary,
            fontWeight = FontWeight.SemiBold
        )
    }
}