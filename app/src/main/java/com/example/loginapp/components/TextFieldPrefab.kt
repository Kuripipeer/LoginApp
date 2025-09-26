package com.example.loginapp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.loginapp.ui.theme.TextFieldColor

@Composable
fun TextFieldPrefab(
    text : String,
    value : String,
    onValueChange : (String) -> Unit,
    placeholder : String
){
    TextField(
        value = value,
        onValueChange = onValueChange,
        shape = RoundedCornerShape(16.dp),
        label = { Text(text = text, color = Color.Black) },
        placeholder = { Text(placeholder, color = Color.LightGray) },
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 28.dp)
            .height(80.dp)
            .shadow(8.dp, RoundedCornerShape(16.dp)),
        colors = TextFieldDefaults.colors(
            unfocusedIndicatorColor = Color.White,
            unfocusedContainerColor = TextFieldColor,
            focusedContainerColor = TextFieldColor,
            focusedIndicatorColor = Color.White,
            unfocusedTextColor = Color.LightGray,
            disabledIndicatorColor = Color.Transparent
        )
    )
}