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
fun MySQLScreen(navController: NavController) {
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
            text = "Bienvenido a MySQL",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))


        Image(
            painter = painterResource(id = R.drawable.m),
            contentDescription = "Logo de MySQL",
            modifier = Modifier.size(150.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "MySQL es uno de los sistemas de gestión de bases de datos más populares del mundo. Es ampliamente utilizado para aplicaciones web y como parte del stack LAMP.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = buildString {
                append("MySQL es un sistema de gestión de bases de datos relacional (RDBMS) de código abierto que se utiliza para almacenar, organizar y recuperar datos en aplicaciones. Fue desarrollado originalmente por MySQL AB y es ahora mantenido por Oracle Corporation.\n")
                append("Características principales:\n")
                append("1. **Modelo Relacional:** Organiza los datos en tablas relacionadas mediante claves.\n")
                append("2. **Soporte para SQL:** Utiliza SQL para gestionar bases de datos relacionales.\n")
                append("3. **Alto Rendimiento:** Ideal para aplicaciones de alto rendimiento.\n")
                append("4. **Multiusuario y Multihilo:** Permite acceso simultáneo sin afectar el rendimiento.\n")
                append("5. **Compatibilidad Multiplataforma:** Compatible con varias plataformas y sistemas operativos.\n")
                append("6. **Motor de Almacenamiento Personalizable:** Soporta múltiples motores de almacenamiento como InnoDB y MyISAM.\n")
                append("7. **Soporte para Transacciones:** Garantiza la ejecución segura de operaciones de base de datos.\n")
                append("8. **Escalabilidad y Flexibilidad:** Puede manejar desde pequeñas bases de datos hasta grandes volúmenes de datos.\n")
                append("9. **Seguridad:** Proporciona características de seguridad robustas.\n")
                append("10. **Replicación y Alta Disponibilidad:** Soporta replicación para mejorar disponibilidad.\n")
                append("11. **Código Abierto y Comunidad Activa:** Proyecto de código abierto con una comunidad activa.\n")
                append("Usos comunes:\n")
                append("1. **Aplicaciones web:** Utilizado en plataformas como WordPress y Joomla.\n")
                append("2. **Plataformas de comercio electrónico:** Shopify y WooCommerce dependen de MySQL.\n")
                append("3. **Sistemas empresariales:** Usado por empresas como Facebook y Twitter.\n")
                append("4. **Sistemas de gestión de contenido (CMS):** Gestiona contenido eficientemente.\n")
                append("5. **Aplicaciones de análisis de datos:** Base de datos para sistemas de análisis.")
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
            painter = painterResource(id = R.drawable.mc),
            contentDescription = "Logo de Kotlin",
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

    }
}