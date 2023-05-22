package org.includejoe.sdcl.utils

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: Int? = null
)