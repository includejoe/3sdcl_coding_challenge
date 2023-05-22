package org.includejoe.sdcl.utils

sealed class FormEvent {
    data class FirstNameChanged(val firstName: String): FormEvent()

    data class LastNameChanged(val lastName: String): FormEvent()

    data class BirthPlaceChanged(val brithPlace: String): FormEvent()

    data class DobChanged(val dob: String): FormEvent()

    data class HouseNumberChanged(val houseNumber: String): FormEvent()

    data class CommunityChanged(val community: String): FormEvent()

    data class OccupationChanged(val occupation: String): FormEvent()

    data class DistrictChanged(val district: String): FormEvent()

    data class RegionChanged(val region: String): FormEvent()

    data class MaritalStatusChanged(val maritalStatus: String): FormEvent()

    data class BioChanged(val bio: String): FormEvent()

    object Reset: FormEvent()

    object Submit: FormEvent()
}