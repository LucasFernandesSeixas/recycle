package br.com.fiap.recycle


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.recycle.telas.CadastroTelas
import br.com.fiap.recycle.telas.InicialTelas
import br.com.fiap.recycle.telas.LoginTelas
import br.com.fiap.recycle.telas.MenuTelas
import br.com.fiap.recycle.ui.theme.RecycleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecycleTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Inicial"){
                        composable(route = "inicial"){
                            InicialTelas(navController)
                        }
                        composable(route = "cadastro"){
                            CadastroTelas(navController)
                        }
                        composable(route = "login"){
                           LoginTelas(navController)
                        }
                        composable(route = "menu"){
                            MenuTelas(navController)

                        }
                    }

                }
            }
        }
    }
}

