package com.example.loginapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.R
import com.example.loginapp.components.ActionButton
import com.example.loginapp.components.HiddenTextField
import com.example.loginapp.components.TextFieldPrefab
import com.example.loginapp.ui.theme.Background
import com.example.loginapp.ui.theme.Lock
import com.example.loginapp.ui.theme.Lock_open_right
import com.example.loginapp.ui.theme.LoginAppTheme
import com.example.loginapp.ui.theme.RocketTakeoff
import com.example.loginapp.ui.theme.SingUpScreenRoute
import com.example.loginapp.ui.theme.TextFieldColor

@Composable
fun LoginScreen(navController : NavController, innerPadding : PaddingValues) {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var showPassword by remember {
        mutableStateOf(false)
    }

    Box (
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Background
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // Logo
            Column (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Icon(
                    imageVector = RocketTakeoff,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .size(120.dp)
                )
            }

            // Parte del login
            Column (
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(topStart = 60.dp))
                    .background(Background)
                    .padding(horizontal = 38.dp, vertical = 38.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Column (
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "Login",
                        fontSize = 32.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(bottom = 28.dp)
                    )

                    // Email
                    TextFieldPrefab(
                        text = "Email",
                        value = email,
                        onValueChange = { email = it },
                        placeholder = "ejemplo@gmail.com"
                    )

                    // Password
                    HiddenTextField(
                        text = "Password",
                        value = password,
                        onValueChange = { password = it },
                        showPassword = showPassword,
                        onShowPasswordChange = { showPassword = !showPassword }
                    )

                    // Login Button
                    ActionButton("Login")
                }

                // Sing Up
                Column (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "Don't have any account? Sign Up",
                        color = Color.Black,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(SingUpScreenRoute)
                            }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    LoginAppTheme {
        LoginScreen(navController = rememberNavController(), innerPadding = PaddingValues() )
    }
}