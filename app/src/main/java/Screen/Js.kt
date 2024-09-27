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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navegacionlenguajes.R

@Composable
fun JsScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Bienvenido a JavaScript",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))


        Image(
            painter = painterResource(id = R.drawable.js),
            contentDescription = "Logo de JavaScript",
            modifier = Modifier.size(150.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "JavaScript es un lenguaje de programación utilizado principalmente para el desarrollo web. Permite crear sitios web dinámicos y altamente interactivos cuando se combina con HTML y CSS.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = buildString {
                append("JavaScript (JS) es un lenguaje de programación interpretado, dinámico y de alto nivel, utilizado principalmente para desarrollar aplicaciones web interactivas. Fue creado en 1995 por Brendan Eich mientras trabajaba en Netscape Communications.")
                append("\n\nCaracterísticas principales:\n")
                append("1. **Lenguaje Interpretado:** El código no necesita ser compilado antes de ser ejecutado.\n")
                append("2. **Basado en Prototipos:** Utiliza un sistema de herencia basado en prototipos.\n")
                append("3. **Tipado Dinámico:** Las variables no tienen un tipo de dato fijo.\n")
                append("4. **Orientado a Objetos y Funcional:** Soporta múltiples paradigmas de programación.\n")
                append("5. **Ejecución en Navegadores:** Permite crear experiencias interactivas en el lado del cliente.\n")
                append("6. **Asincronía y Callbacks:** Soporta programación asincrónica a través de callbacks y promesas.\n")
                append("7. **Node.js:** Permite el uso de JavaScript en el servidor.\n")
                append("8. **Gran Comunidad y Ecosistema:** Uno de los ecosistemas más grandes en la programación.\n")
                append("9. **Compatibilidad Multiplataforma:** Puede ejecutarse en casi cualquier dispositivo y navegador.\n")
                append("10. **Estándares ECMAScript:** JavaScript sigue el estándar ECMAScript.\n")
                append("\nUsos comunes:\n")
                append("1. **Desarrollo Web del Lado del Cliente:** Principal lenguaje para agregar interactividad.\n")
                append("2. **Desarrollo del Lado del Servidor:** Con Node.js, se ha vuelto potente para el backend.\n")
                append("3. **Aplicaciones Móviles y de Escritorio:** Herramientas como React Native permiten el desarrollo multiplataforma.\n")
                append("4. **Desarrollo Full Stack:** Permite el desarrollo de aplicaciones completas.\n")
                append("5. **Juegos y Realidad Virtual:** Utilizado en el desarrollo de videojuegos web.")
            },
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )
        Text(
            text = "Ejemplo: ",
            style = MaterialTheme.typography.titleMedium,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.jsc),
            contentDescription = "Logo de Kotlin",
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))


    }
}