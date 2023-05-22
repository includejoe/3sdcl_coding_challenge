package org.includejoe.sdcl.presentation.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import org.includejoe.sdcl.R
import org.includejoe.sdcl.presentation.ItemTwoViewModel
import org.includejoe.sdcl.utils.FormEvent
import kotlin.math.sin

@Composable
fun Inputs() {
    val viewModel = viewModel<ItemTwoViewModel>()
    val state = viewModel.state

    val lastNameFR = FocusRequester()
    val birthPlaceFR = FocusRequester()
    val dobFR = FocusRequester()
    val houseNumberFR = FocusRequester()
    val communityFR = FocusRequester()
    val occupationFR = FocusRequester()
    val districtFR = FocusRequester()
    val regionFR = FocusRequester()
    val maritalStatusFR = FocusRequester()
    val bioFR = FocusRequester()

    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        TextInput(
            value = state.value.firstName,
            error = state.value.firstNameError,
            onValueChange = {
                viewModel.onEvent(FormEvent.FirstNameChanged(it))
            },
            label = R.string.first_name,
            keyboardActions = KeyboardActions(onNext = {
                lastNameFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
        )

        if(state.value.firstNameError != null) {
            ErrorText(text = state.value.firstNameError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.lastName,
            error = state.value.lastNameError,
            onValueChange = {
                viewModel.onEvent(FormEvent.LastNameChanged(it))
            },
            label = R.string.last_name,
            keyboardActions = KeyboardActions(onNext = {
                birthPlaceFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            focusRequester = lastNameFR
        )

        if(state.value.lastNameError != null) {
            ErrorText(text = state.value.lastNameError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.birthPlace,
            error = state.value.birthPlaceError,
            onValueChange = {
                viewModel.onEvent(FormEvent.BirthPlaceChanged(it))
            },
            label = R.string.birth_place,
            keyboardActions = KeyboardActions(onNext = {
                dobFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            focusRequester = birthPlaceFR
        )

        if(state.value.birthPlaceError != null) {
            ErrorText(text = state.value.birthPlaceError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.dob,
            error = state.value.dobError,
            onValueChange = {
                viewModel.onEvent(FormEvent.DobChanged(it))
            },
            label = R.string.dob,
            keyboardActions = KeyboardActions(onNext = {
                houseNumberFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            focusRequester = dobFR
        )

        if(state.value.dobError != null) {
            ErrorText(text = state.value.dobError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.houseNumber,
            error = state.value.houseNumberError,
            onValueChange = {
                viewModel.onEvent(FormEvent.HouseNumberChanged(it))
            },
            label = R.string.house_number,
            keyboardActions = KeyboardActions(onNext = {
                communityFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            focusRequester = houseNumberFR
        )

        if(state.value.houseNumberError != null) {
            ErrorText(text = state.value.houseNumberError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.community,
            error = state.value.communityError,
            onValueChange = {
                viewModel.onEvent(FormEvent.CommunityChanged(it))
            },
            label = R.string.community,
            keyboardActions = KeyboardActions(onNext = {
                occupationFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            focusRequester = communityFR
        )

        if(state.value.communityError != null) {
            ErrorText(text = state.value.communityError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.occupation,
            error = state.value.occupationError,
            onValueChange = {
                viewModel.onEvent(FormEvent.OccupationChanged(it))
            },
            label = R.string.occupation,
            keyboardActions = KeyboardActions(onNext = {
                districtFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            focusRequester = occupationFR
        )

        if(state.value.occupationError != null) {
            ErrorText(text = state.value.occupationError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.district,
            error = state.value.districtError,
            onValueChange = {
                viewModel.onEvent(FormEvent.DistrictChanged(it))
            },
            label = R.string.district,
            keyboardActions = KeyboardActions(onNext = {
                regionFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            focusRequester = districtFR
        )

        if(state.value.districtError != null) {
            ErrorText(text = state.value.districtError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.region,
            error = state.value.regionError,
            onValueChange = {
                viewModel.onEvent(FormEvent.RegionChanged(it))
            },
            label = R.string.region,
            keyboardActions = KeyboardActions(onNext = {
                maritalStatusFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            focusRequester = regionFR
        )

        if(state.value.regionError != null) {
            ErrorText(text = state.value.regionError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.maritalStatus,
            error = state.value.maritalStatusError,
            onValueChange = {
                viewModel.onEvent(FormEvent.MaritalStatusChanged(it))
            },
            label = R.string.marital_status,
            keyboardActions = KeyboardActions(onNext = {
                bioFR.requestFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            focusRequester = maritalStatusFR
        )

        if(state.value.maritalStatusError != null) {
            ErrorText(text = state.value.maritalStatusError!!)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextInput(
            value = state.value.bio,
            error = state.value.bioError,
            singleLine = false,
            modifier = Modifier.height(120.dp),
            placeholder = R.string.short_intro,
            onValueChange = {
                viewModel.onEvent(FormEvent.BioChanged(it))
            },
            label = R.string.bio,
            keyboardActions = KeyboardActions(onDone = {
                focusManager.clearFocus()
            }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            focusRequester = bioFR
        )

        if(state.value.maritalStatusError != null) {
            ErrorText(text = state.value.maritalStatusError!!)
        }

        Spacer(modifier = Modifier.height(32.dp))

    }
}

@Composable
fun ErrorText(
    text: Int,
) {
    Text(
        text = stringResource(text),
        color = MaterialTheme.colors.error,
        modifier = Modifier.fillMaxWidth(),
        style = MaterialTheme.typography.body1,
        fontSize = 12.sp,
        textAlign = TextAlign.Start
    )
}