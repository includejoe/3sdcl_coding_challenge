package org.includejoe.sdcl.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp


@Composable
fun TextInput(
    modifier: Modifier = Modifier,
    value: String,
    error: Any?,
    onValueChange: (String) -> Unit,
    label: Int,
    singleLine: Boolean = true,
    placeholder: Int? = null,
    focusRequester: FocusRequester? = null,
    keyboardActions: KeyboardActions = KeyboardActions(),
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    visualTransformation: VisualTransformation = VisualTransformation.None,
    isEnabled: Boolean = true
) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(
            text = stringResource(id = label),
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.SemiBold
        )

        OutlinedTextField(
            value = value,
            onValueChange = {
                onValueChange(it)
            },
            isError = error != null,
            modifier = modifier
                .fillMaxWidth()
                .height(50.dp)
                .focusRequester(focusRequester ?: FocusRequester()),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = Color.White,
                disabledTextColor = MaterialTheme.colors.onBackground,
                textColor = MaterialTheme.colors.onBackground,
                focusedBorderColor = MaterialTheme.colors.primary,
                unfocusedBorderColor = MaterialTheme.colors.secondary
            ),
            placeholder = {
                if(placeholder != null) {
                    Text(
                        text = stringResource(placeholder),
                        color = MaterialTheme.colors.onSurface,
                        style = MaterialTheme.typography.body1
                    )
                }
            },
            textStyle = MaterialTheme.typography.body1,
            singleLine = singleLine,
            keyboardOptions = keyboardOptions,
            visualTransformation = visualTransformation,
            keyboardActions = keyboardActions,
            enabled = isEnabled
        )
    }


}