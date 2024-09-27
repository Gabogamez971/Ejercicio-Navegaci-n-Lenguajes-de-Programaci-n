package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun NavigationExample() {
    val navController = rememberNavController()
    val screens = listOf("Kotlin", "Java", "JS", "MySQL", "Principal")
    var selectedScreen by remember { mutableStateOf(screens[0]) }
    var expanded by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Navegación de Lenguajes", style = MaterialTheme.typography.titleLarge, textAlign = TextAlign.Center) },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFF1976D2))
            )
        },
        bottomBar = {
            BottomNavigationComponent(
                selectedScreen = selectedScreen,
                screens = screens,
                onScreenChange = { selectedScreen = it },
                navController = navController
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
                .background(Color(0xFFEFEFEF)), // Fondo más suave
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(
                onClick = { expanded = true },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .shadow(8.dp, MaterialTheme.shapes.medium)
                    .height(56.dp) // Aumentar la altura del botón
            ) {
                Text(text = "Seleccionar: $selectedScreen", color = Color.White)
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
            ) {
                screens.forEach { screen ->
                    DropdownMenuItem(
                        text = {
                            Text(
                                text = screen,
                                style = MaterialTheme.typography.bodyLarge.copy(color = Color.Black)
                            )
                        },
                        onClick = {
                            selectedScreen = screen
                            expanded = false
                            navController.navigate(screen.lowercase())
                        },
                        modifier = Modifier.padding(8.dp)
                    )
                    Divider(color = Color(0xFFDDDDDD))
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            NavHost(navController = navController, startDestination = "Principal") {
                composable("kotlin") { KotlinScreen(navController) }
                composable("java") { JavaScreen(navController) }
                composable("js") { JsScreen(navController) }
                composable("mysql") { MySQLScreen(navController) }
                composable("Principal") { MainScreen(navController) }
            }
        }
    }
}

@Composable
fun BottomNavigationComponent(
    selectedScreen: String,
    screens: List<String>,
    onScreenChange: (String) -> Unit,
    navController: NavController
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = {
                val currentIndex = screens.indexOf(selectedScreen)
                val nextIndex = (currentIndex - 1 + screens.size) % screens.size
                val nextScreen = screens[nextIndex]
                onScreenChange(nextScreen)
                navController.navigate(nextScreen.lowercase())
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2)),
            modifier = Modifier
                .shadow(8.dp, MaterialTheme.shapes.medium)
                .height(48.dp) // Aumentar la altura del botón
        ) {
            Text(text = "Anterior", color = Color.White)
        }

        Button(
            onClick = {
                val currentIndex = screens.indexOf(selectedScreen)
                val nextIndex = (currentIndex + 1) % screens.size
                val nextScreen = screens[nextIndex]
                onScreenChange(nextScreen)
                navController.navigate(nextScreen.lowercase())
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2)),
            modifier = Modifier
                .shadow(8.dp, MaterialTheme.shapes.medium)
                .height(48.dp) // Aumentar la altura del botón
        ) {
            Text(text = "Siguiente", color = Color.White)
        }
    }
}