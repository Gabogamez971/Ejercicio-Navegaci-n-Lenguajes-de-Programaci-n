package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navegacionlenguajes.R
import androidx.compose.ui.graphics.Color

@Composable
fun KotlinScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Top, // Cambiar a Top para comenzar desde la parte superior
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Bienvenido a Kotlin",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))


        Image(
            painter = painterResource(id = R.drawable.k),
            contentDescription = "Logo de Kotlin",
            modifier = Modifier.size(150.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Kotlin es un lenguaje moderno, expresivo y seguro, desarrollado por JetBrains y soportado oficialmente por Google para el desarrollo de aplicaciones Android.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Ventajas de Kotlin:",
            style = MaterialTheme.typography.titleMedium,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        val advantages = listOf(
            "1. Compatibilidad con Java: Kotlin es totalmente interoperable con Java.",
            "2. Código más conciso y limpio: Requiere menos código que Java.",
            "3. Mayor seguridad contra errores comunes: Null Safety y Smart Casts.",
            "4. Coroutines para programación asincrónica: Facilita la escritura de código asíncrono.",
            "5. Facilita la programación funcional: Soporta funciones de orden superior.",
            "6. Compatibilidad multiplataforma: Comparte código entre diferentes plataformas.",
            "7. Soporte mejorado en Android: Adoptado oficialmente por Google.",
            "8. Comunidad activa y soporte: Creciente comunidad y respaldo por JetBrains y Google."
        )




        advantages.forEach { advantage ->
            Text(
                text = advantage,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(4.dp))
        }
        Text(
            text = "Ejemplo: ",
            style = MaterialTheme.typography.titleMedium,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.kc),
            contentDescription = "Logo de Kotlin",
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
        }
    }
}