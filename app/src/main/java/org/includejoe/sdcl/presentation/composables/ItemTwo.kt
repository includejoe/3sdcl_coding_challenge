package org.includejoe.sdcl.presentation.composables

import android.widget.Toast
import android.widget.Toast.makeText
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import org.includejoe.sdcl.R
import org.includejoe.sdcl.presentation.ItemTwoViewModel
import org.includejoe.sdcl.utils.FormEvent

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ItemTwo(modifier: Modifier = Modifier) {
    val viewModel = viewModel<ItemTwoViewModel>()
    val state = viewModel.state
    val keyBoardController = LocalSoftwareKeyboardController.current

    if(state.value.submissionSuccess) {
        makeText(
            LocalContext.current,
            "Saved Successfully",
            Toast.LENGTH_SHORT
        ).show()
    }

    Column(
        modifier = modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {

        UploadImage()

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.End
        ) {
            Gender()
        }

        Inputs()

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            MButton(
                onClick = {
                    viewModel.onEvent(FormEvent.Reset)
                    keyBoardController?.hide()
                },
                text = R.string.btn_reset
            )

            Spacer(modifier = Modifier.width(16.dp))

            MButton(
                text = R.string.btn_save,
                outline = true,
                onClick = {
                    viewModel.onEvent(FormEvent.Submit)
                    keyBoardController?.hide()
                },
            )
        }

    }
}


@Composable
fun Gender() {
    val radioOptions = listOf("Male", "Female")
    val selectedOption = remember { mutableStateOf(radioOptions[0]) }

    Column(
        modifier = Modifier.wrapContentWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = stringResource(id = R.string.gender),
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.onBackground
        )

        Row {
            radioOptions.forEach { option ->
                Row(
                    modifier = Modifier.clickable { selectedOption.value = option },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        modifier = Modifier.size(30.dp),
                        selected = option == selectedOption.value,
                        colors = RadioButtonDefaults.colors(
                            selectedColor = MaterialTheme.colors.primary,
                            unselectedColor = MaterialTheme.colors.secondary
                        ),
                        onClick = {selectedOption.value = option}
                    )
                    Text(
                        text = option,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (option == selectedOption.value) MaterialTheme.colors.onBackground
                        else MaterialTheme.colors.secondary
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        }
    }



}

