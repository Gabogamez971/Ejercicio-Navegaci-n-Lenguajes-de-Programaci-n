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
fun JavaScreen(navController: NavController) {
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
            text = "Bienvenido a Java",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))


        Image(
            painter = painterResource(id = R.drawable.j),
            contentDescription = "Logo de Java",
            modifier = Modifier.size(150.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Java es uno de los lenguajes de programación más populares y ampliamente utilizados en el mundo. Su sintaxis es muy similar a C++ pero con características de manejo de memoria automáticas que facilitan su uso.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Java es un lenguaje de programación de propósito general, orientado a objetos y diseñado para ser lo más independiente posible de la plataforma. Creado por James Gosling y su equipo en Sun Microsystems (ahora parte de Oracle) y lanzado en 1995. Desde su creación, Java ha sido uno de los lenguajes más populares en el mundo, utilizado tanto para aplicaciones empresariales como para el desarrollo de software móvil, web y en servidores.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Características principales:",
            style = MaterialTheme.typography.titleMedium,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        val features = listOf(
            "Orientado a objetos: Java está basado en el paradigma de programación orientada a objetos.",
            "Portabilidad (WORA - Write Once, Run Anywhere): Independiente de la plataforma.",
            "Recolección de basura (Garbage Collection): Gestión automática de memoria.",
            "Multihilo (Multithreading): Soporta ejecución simultánea de tareas.",
            "Seguridad: Diseñado con características de seguridad avanzadas.",
            "Extensa biblioteca estándar: Proporciona clases y métodos listos para usar.",
            "Ecosistema robusto: Amplia gama de frameworks y herramientas.",
            "Gran comunidad y soporte: Una de las comunidades de desarrolladores más grandes."
        )


        features.forEach { feature ->
            Text(
                text = feature,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(4.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Usos comunes:",
            style = MaterialTheme.typography.titleMedium,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        val commonUses = listOf(
            "Aplicaciones empresariales: Muy utilizado en aplicaciones empresariales y de servidor.",
            "Desarrollo de aplicaciones Android: Uno de los lenguajes más utilizados.",
            "Desarrollo web: Opción común para aplicaciones web.",
            "Desarrollo de software científico y financiero: Popular en áreas como bioinformática.",
            "Sistemas embebidos: Usado en dispositivos embebidos por su portabilidad."
        )




        commonUses.forEach { use ->
            Text(
                text = use,
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
            painter = painterResource(id = R.drawable.jc),
            contentDescription = "Logo de Kotlin",
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

    }
}