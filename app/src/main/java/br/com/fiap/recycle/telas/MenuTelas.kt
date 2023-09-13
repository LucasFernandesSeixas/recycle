package br.com.fiap.recycle.telas


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.recycle.R

@Composable
fun MenuTelas(navController: NavController) {


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Image(

            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .padding(25.dp)
                .size(110.dp),
            contentScale = ContentScale.FillHeight

        )


        Text(
            text = "Mude seu dia e Mude seu lixo ",
            fontSize = 20.sp,
            color = colorResource(id = R.color.verde),
            fontWeight = FontWeight.Normal,
            modifier = Modifier.offset(y = (-12).dp)

        )
        Text(
            text = "Bem Vindo nome!",
            fontSize = 25.sp,
            color = colorResource(id = R.color.verde),
            fontWeight = FontWeight.W500,
            modifier = Modifier.offset(y = (-10.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.rosto),
            contentDescription = "logo",
            modifier = Modifier.size(100.dp),

           contentScale = ContentScale.FillHeight
            

        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {},
            modifier = Modifier.height(45.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.verde)),
            shape = RoundedCornerShape(25.dp),
        ) {

            Text(
                text = "Reciclador",
                fontSize = 20.sp,
                color = colorResource(id = R.color.white),
            )

        }
        Spacer(modifier = Modifier.height(40.dp))

        Row {
            Icon(
                painter = painterResource(id = R.drawable.simbolo_reciclagem),
                contentDescription = "icone de reciclagem",
                modifier = Modifier
                    .offset((-50).dp)
                    .size(60.dp),
                colorResource(id = R.color.verde)
            )

            Icon(
                painter = painterResource(id = R.drawable.calculadora),
                contentDescription = "icone de reciclagem",
                modifier = Modifier
                    .offset(50.dp)
                    .size(60.dp),
                colorResource(id = R.color.verde)
            )
        }
        Spacer(modifier = Modifier.height(30.dp))


        Row {
            Icon(
                painter = painterResource(id = R.drawable.homen_jogando_lixo),
                contentDescription = "icone de reciclagem",
                modifier = Modifier
                    .offset((-50).dp)
                    .size(60.dp),
                colorResource(id = R.color.verde)
            )

            Icon(
                painter = painterResource(id = R.drawable.caminhao_de_lixo),
                contentDescription = "icone de reciclagem",
                modifier = Modifier
                    .offset(50.dp)
                    .size(60.dp),
                colorResource(id = R.color.verde)
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row {
            Icon(
                painter = painterResource(id = R.drawable.fale_conosco),
                contentDescription = "icone de reciclagem",
                modifier = Modifier
                    .offset((-50).dp)
                    .size(60.dp),
                colorResource(id = R.color.verde)
            )

            Icon(
                painter = painterResource(id = R.drawable.calendario),
                contentDescription = "icone de reciclagem",
                modifier = Modifier
                    .offset(50.dp)
                    .size(60.dp),
                colorResource(id = R.color.verde)
            )
        }
        
        Spacer(modifier = Modifier.height(40.dp))

        Button(
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.verde)),
            onClick = {navController.navigate("login")}
        ){
            Text(text = "Voltar",
                fontSize = 20.sp,

            )

        }



    }


    }


