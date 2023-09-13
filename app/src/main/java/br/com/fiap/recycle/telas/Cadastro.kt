package br.com.fiap.recycle.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.recycle.R

@Composable
fun CadastroTelas(
    navController: NavController) {

    var nome by remember {
        mutableStateOf("")
    }
    var sobrenome by remember {
        mutableStateOf("")
    }
    var endereco by remember {
        mutableStateOf("")
    }
    var complemento by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }

    var senha by remember {
        mutableStateOf("")
    }
    var cotSenha = 6

    var confirmarsenha by remember {
        mutableStateOf("")
    }
    var cotconfirmarsenha = 6

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.verde))
            .padding(25.dp)
    )
    // formulário

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
    ) {

            Column(
                modifier = Modifier.padding(
                    vertical = 25.dp,
                    horizontal = 40.dp
                )
            ) {
                Text(
                    text = "CADASTRAR",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.white),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(25.dp))

                OutlinedTextField(
                    value = nome,
                    singleLine = true,
                    onValueChange = {it ->
                        nome = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(color = Color.White,
                            text = "Digite seu nome")
                    },
                    label = {
                        Text(color = Color.White,
                            text = "Digite seu nome")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.white),
                        focusedBorderColor = colorResource(id = R.color.white)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words),
                    textStyle = TextStyle(color = Color.White)
                )
                Spacer(modifier = Modifier.height(22.dp))

                OutlinedTextField(
                    value = sobrenome,
                    singleLine = true,
                    onValueChange = {it ->
                       sobrenome = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(color = Color.White,
                            text = "Digite seu sobrenome"
                        )
                    },
                    label = {
                        Text(color = Color.White,
                            text = "Digite seu sobrenome")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.white),
                        focusedBorderColor = colorResource(id = R.color.white)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words),
                    textStyle = TextStyle(color = Color.White)
                )
                Spacer(modifier = Modifier.height(22.dp))


                OutlinedTextField(
                    value = endereco,
                    singleLine = true,
                    onValueChange = {it ->
                         endereco = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(
                            text = "Digite seu endereço",
                            color = Color.White

                        )
                    },
                    label = {


                        Text(color = Color.White,
                            text = "Digite seu endereço")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.white),
                        focusedBorderColor = colorResource(id = R.color.white)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words),
                    textStyle = TextStyle(color = Color.White)
                )
                Spacer(modifier = Modifier.height(22.dp))

                OutlinedTextField(
                    value = complemento,
                    singleLine = true,
                    onValueChange = {it ->
                         complemento = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(color = Color.White,
                            text = "Digite seu complemento"
                        )
                    },
                    label = {
                        Text(color = Color.White,
                            text = "Digite seu complemento")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.white),
                        focusedBorderColor = colorResource(id = R.color.white)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    textStyle = TextStyle(color = Color.White)
                )
                Spacer(modifier = Modifier.height(22.dp))


                OutlinedTextField(

                    value = email,
                    singleLine = true,
                    onValueChange = {it->
                          email = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(color = Color.White,
                            text = "Digite seu e-mail "
                        )
                    },
                    label = {
                        Text(color = Color.White,
                            text = "Digite seu E-mail")

                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.white),
                        focusedBorderColor = colorResource(id = R.color.white)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    textStyle = TextStyle(color = Color.White),


                )

                Spacer(modifier = Modifier.height(22.dp))


                OutlinedTextField(
                    value = senha,
                    singleLine = true,
                    onValueChange = {
                      if (it.length <= cotSenha) senha = it

                    },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(color = Color.White,
                            text = "Digite sua senha "
                        )
                    },
                    label = {
                        Text(color = Color.White,
                            text = "Digite sua senha")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.white),
                        focusedBorderColor = colorResource(id = R.color.white)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    textStyle = TextStyle(color = Color.White)
                )

                Spacer(modifier = Modifier.height(22.dp))

                OutlinedTextField(
                    value = confirmarsenha,
                    singleLine = true,
                    onValueChange = {
                      if (it.length <= cotconfirmarsenha)  confirmarsenha = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(color = Color.White,
                            text = "Cofirmar sua seha "
                        )
                    },
                    label = {
                        Text(color = Color.White,
                            text = "Comfimar sua senha")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.white),
                        focusedBorderColor = colorResource(id = R.color.white)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    textStyle = TextStyle(color = Color.White)

                )


                Spacer(modifier = Modifier.height(30.dp))
                Button(

                    onClick = {
                        navController.navigate("login") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.white))
                ) {
                    Text(
                        text = "CASDASTRAR",
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.verde),
                        fontSize = 20.sp
                    )
                }
            }
        }
    }


