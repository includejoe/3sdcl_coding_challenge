package org.includejoe.sdcl.utils

import org.includejoe.sdcl.R

class ValidateText {
    operator fun invoke(
        text: String,
    ): ValidationResult {

        if(text.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = R.string.err_empty
            )
        }

        return ValidationResult(successful = true)
    }
}