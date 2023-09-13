package br.com.fiap.recycle.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.recycle.R


@Composable
fun InicialTelas(navController: NavController) {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
            .padding(40.dp),
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier.size(1000.dp),
                contentScale = ContentScale.Fit
            )
        }



     Row(
         verticalAlignment = Alignment.Bottom,
         horizontalArrangement = Arrangement.SpaceBetween,
         modifier = Modifier
             .height(700.dp)
             .fillMaxWidth()
     ) {

         Button(
           onClick = {navController.navigate("login")},
             colors = ButtonDefaults.buttonColors(colorResource(id = R.color.verde)),
           modifier = Modifier.offset(x = ((-10).dp)),
           shape = RoundedCornerShape(10.dp)

        ) {
           Text(text = "Entrar",
               fontSize = 20.sp,
               color = colorResource(id = R.color.white)
           )
      }
         Button(
             onClick = {navController.navigate("cadastro")},
             colors = ButtonDefaults.buttonColors(colorResource(id = R.color.verde)),
             modifier = Modifier.offset(x = 20.dp),
             shape = RoundedCornerShape(10.dp),

         ){
             Text(text = "Criar cadastro?",
                 fontSize = 20.sp,
                 color = colorResource(id = R.color.white),

             )
         }
     }

    }
}
