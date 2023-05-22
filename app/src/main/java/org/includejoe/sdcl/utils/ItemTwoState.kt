package org.includejoe.sdcl.utils

data class ItemTwoState(
    var firstName: String = "",
    val firstNameError: Int? = null,

    var lastName: String = "",
    val lastNameError: Int? = null,

    var birthPlace: String = "",
    val birthPlaceError: Int? = null,

    var dob: String = "",
    val dobError: Int? = null,

    var houseNumber: String = "",
    val houseNumberError: Int? = null,

    var community: String = "",
    val communityError: Int? = null,

    var occupation: String = "",
    val occupationError: Int? = null,

    var district: String = "",
    val districtError: Int? = null,

    var region: String = "",
    val regionError: Int? = null,

    var maritalStatus: String = "",
    val maritalStatusError: Int? = null,

    var bio: String = "",
    val bioError: Int? = null,

    var submissionSuccess: Boolean = false
)