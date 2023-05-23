package org.includejoe.sdcl.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.includejoe.sdcl.R
import org.includejoe.sdcl.utils.FormEvent

@Composable
fun ItemThree(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Avatar(size = 90.dp)
            Spacer(modifier = Modifier.size(30.dp))
            Column {
                Text(
                    text = "Kwame Anim",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = MaterialTheme.colors.onBackground
                )
                Text(
                    text = "Farmer",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.secondary
                )
                Text(
                    text = "Male",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.secondary
                )
            }
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(modifier = Modifier.wrapContentWidth()) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_location),
                    contentDescription = "location",
                    tint = MaterialTheme.colors.primary,
                    modifier = Modifier.size(15.dp)
                )

                Text(
                    text = "Pig Farm, Accra",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    color = MaterialTheme.colors.onBackground
                )
            }

            Row(modifier = Modifier.wrapContentWidth()) {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "star",
                    tint = MaterialTheme.colors.primary,
                    modifier = Modifier.size(15.dp)
                )
                
                Spacer(modifier = Modifier.width(4.dp))

                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "star",
                    tint = MaterialTheme.colors.primary,
                    modifier = Modifier.size(15.dp)
                )

                Spacer(modifier = Modifier.width(4.dp))

                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "star",
                    tint = MaterialTheme.colors.primary,
                    modifier = Modifier.size(15.dp)
                )

                Spacer(modifier = Modifier.width(4.dp))

                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "star",
                    tint = MaterialTheme.colors.primary,
                    modifier = Modifier.size(15.dp)
                )

                Spacer(modifier = Modifier.width(4.dp))

                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "star",
                    tint = MaterialTheme.colors.secondary,
                    modifier = Modifier.size(15.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Text(
                text = "Birth Place:",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )
            
            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "Tema Metropolitan",
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            Text(
                text = "Date of Birth:",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "22/05/2023",
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            Text(
                text = "House Number:",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "BG54549",
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            Text(
                text = "Community",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "Tema Community 20",
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            Text(
                text = "District",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "Seto District",
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            Text(
                text = "Region",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "Greater Accra Region",
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            Text(
                text = "Marital Status",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "Single",
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row {
            Text(
                text = "Bio:",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "Lorem ipsum dolor sit amet consectetur adipisicing" +
                        "elit. Beatae maiores incidunt assumenda laudantium ex mollitia qui" +
                        "recusandae pariatur et veniam aut corrupti aliquid officiis omnis" +
                        "impedit atque perferendis, reprehenderit voluptas, numquam consequatur" +
                        "distinctio quibusdam fugit! Eius quaerat perspiciatis nemo? Soluta" +
                        "eius deserunt repellendus repudiandae nulla beatae impedit facere. Sed" +
                        "hic atque dolore voluptatibus doloremque harum aperiam facilis, a" +
                        "illum doloribus debitis tenetur quidem fuga distinctio facere omnis," +
                        "dolores sint! Ab officia vitae minus id sint consequatur ratione\n" +
                        "veniam itaque voluptatem inventore earum quae in neque minima sapiente" +
                        "cum quidem, iusto cumque tempora temporibus! Eius vel beatae," +
                        "cupiditate magni nobis aut consequatur quaerat iure impedit nihil. Nam" +
                        "mollitia suscipit.",
                fontWeight = FontWeight.Normal,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary,
            )
        }

        Spacer(modifier = Modifier.height(8.dp))



        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            MButton(
                onClick = {},
                text = R.string.btn_edit
            )

            Spacer(modifier = Modifier.width(16.dp))

            MButton(
                text = R.string.btn_delete,
                modifier = Modifier.border(
                    border = BorderStroke(width = 2.dp, color = MaterialTheme.colors.error),
                    shape = MaterialTheme.shapes.medium
                ),
                outline = true,
                onClick = {},
            )
        }
    }
}