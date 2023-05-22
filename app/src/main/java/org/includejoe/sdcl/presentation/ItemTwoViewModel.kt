package org.includejoe.sdcl.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import org.includejoe.sdcl.utils.FormEvent
import org.includejoe.sdcl.utils.ItemTwoState
import org.includejoe.sdcl.utils.ValidateText

class ItemTwoViewModel: ViewModel() {
    private val _state = mutableStateOf(ItemTwoState())
    val state: State<ItemTwoState> = _state
    val textValidator = ValidateText()


    fun onEvent(event: FormEvent) {
        when(event) {
            is FormEvent.FirstNameChanged -> {
                _state.value = _state.value.copy(
                    firstName = event.firstName
                )
            }

            is FormEvent.LastNameChanged -> {
                _state.value = _state.value.copy(
                    lastName = event.lastName
                )
            }

            is FormEvent.BirthPlaceChanged -> {
                _state.value = _state.value.copy(
                    birthPlace = event.brithPlace
                )
            }

            is FormEvent.DobChanged -> {
                _state.value = _state.value.copy(
                    dob = event.dob
                )
            }

            is FormEvent.HouseNumberChanged -> {
                _state.value = _state.value.copy(
                    houseNumber = event.houseNumber
                )
            }

            is FormEvent.CommunityChanged -> {
                _state.value = _state.value.copy(
                    community = event.community
                )
            }

            is FormEvent.OccupationChanged -> {
                _state.value = _state.value.copy(
                    occupation = event.occupation
                )
            }

            is FormEvent.DistrictChanged -> {
                _state.value = _state.value.copy(
                    district = event.district
                )
            }

            is FormEvent.RegionChanged -> {
                _state.value = _state.value.copy(
                    region = event.region
                )
            }

            is FormEvent.MaritalStatusChanged -> {
                _state.value = _state.value.copy(
                    maritalStatus = event.maritalStatus
                )
            }

            is FormEvent.BioChanged -> {
                _state.value = _state.value.copy(
                    bio = event.bio
                )
            }

            is FormEvent.Reset -> {
                _state.value  = ItemTwoState()
            }

            is FormEvent.Submit -> {
                submit()
            }
        }
    }

    private fun submit() {
        val firstNameResult = textValidator(_state.value.firstName)
        val lastNameResult = textValidator(_state.value.lastName)
        val birthPlaceResult = textValidator(_state.value.birthPlace)
        val dobResult = textValidator(_state.value.dob)
        val houseNumberResult = textValidator(_state.value.houseNumber)
        val communityResult = textValidator(_state.value.community)
        val occupationResult = textValidator(_state.value.occupation)
        val districtResult = textValidator(_state.value.district)
        val regionResult = textValidator(_state.value.region)
        val maritalStatusResult = textValidator(_state.value.maritalStatus)
        val bioResult = textValidator(_state.value.bio)

        val hasError = listOf(
            firstNameResult,
            lastNameResult,
            birthPlaceResult,
            dobResult,
            houseNumberResult,
            communityResult,
            occupationResult,
            districtResult,
            regionResult,
            maritalStatusResult,
            bioResult,
        ).any { !it.successful }

        if(hasError) {
            _state.value = _state.value.copy(
                firstNameError = firstNameResult.errorMessage,
                lastNameError = lastNameResult.errorMessage,
                birthPlaceError = birthPlaceResult.errorMessage,
                dobError = dobResult.errorMessage,
                houseNumberError = communityResult.errorMessage,
                communityError = houseNumberResult.errorMessage,
                occupationError = occupationResult.errorMessage,
                districtError = districtResult.errorMessage,
                regionError = regionResult.errorMessage,
                maritalStatusError = maritalStatusResult.errorMessage,
                bioError = bioResult.errorMessage,
            )
            return
        } else {
            _state.value = _state.value.copy(
                submissionSuccess = true,
                firstNameError = null,
                lastNameError = null,
                birthPlaceError = null,
                dobError = null,
                houseNumberError = null,
                communityError = null,
                occupationError = null,
                districtError = null,
                regionError = null,
                maritalStatusError = null,
                bioError = null,
            )
        }
    }
}