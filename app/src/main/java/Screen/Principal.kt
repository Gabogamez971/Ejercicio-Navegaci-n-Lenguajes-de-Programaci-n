package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navegacionlenguajes.R

@Composable
fun MainScreen(navController: NavController) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState)
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Bienvenida",
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 16.dp)
        )

        Text(
            text = "Bienvenido a Navegación Lenguajes",
            style = MaterialTheme.typography.headlineMedium.copy(fontSize = 24.sp),
            textAlign = TextAlign.Center


        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Esta aplicación te permite navegar entre diferentes pantallas, cada una representando un lenguaje de programación. " +
                    "Utiliza el menú desplegable para cambiar de lenguaje, o los botones de navegación para moverte entre las pantallas.",
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
            modifier = Modifier.padding(horizontal = 16.dp),
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(32.dp))

    }
}




