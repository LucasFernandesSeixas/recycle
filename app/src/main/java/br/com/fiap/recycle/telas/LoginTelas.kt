package br.com.fiap.recycle.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.recycle.R

@Composable

fun LoginTelas(navController: NavController) {

    var senha by remember {
        mutableStateOf("")
    }
    var tamanhoSenha = 6

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.verde))
            .padding(25.dp)
    ) {
        Text(

            text = "RECYCLE",
            fontSize = 38.sp,
            fontWeight = FontWeight.W700,
            color = Color.White,
            modifier = Modifier.align(Alignment.TopCenter)
        )

        OutlinedTextField(
            modifier = Modifier
                //para alinha o OutlinedTextField
                .padding(vertical = 255.dp, horizontal = 40.dp),
            value = senha,
            onValueChange = {
                if (it.length <= tamanhoSenha) senha = it
            },
            singleLine = true,


            label = {
                Text(color = Color.White,
                    text = "Digite sua senha")
            },
            placeholder = {
                Text(color = Color.White,
                    text = "senha")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = colorResource(id = R.color.white),
                focusedBorderColor = colorResource(id = R.color.white)
            ),
            visualTransformation = PasswordVisualTransformation(),
           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Button(
            onClick = {
                navController.navigate("menu")
            },
           colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.align(Alignment.Center)
        )
        {
            Text(
                text = "ENTRAR",
                fontSize = 20.sp,
                color = colorResource(id = R.color.verde),
                fontWeight = FontWeight.Light
            )
        }
    }
}
