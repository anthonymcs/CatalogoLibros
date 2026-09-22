package com.example.catalogolibros.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.catalogolibros.data.LibroDatasource

enum class LibroPantalla {
    Home,
    Catalogo,
    Detalle
}

@Composable
fun LibroApp() {
    var pantallaActual by rememberSaveable { mutableStateOf(LibroPantalla.Home) }
    var idLibroSeleccionado by rememberSaveable { mutableIntStateOf(1) }

    val listaLibros = remember { LibroDatasource().cargarLibros() }
    val libroActual = listaLibros.firstOrNull { it.id == idLibroSeleccionado } ?: listaLibros.first()

    when (pantallaActual) {
        LibroPantalla.Home -> {
            LibroHomeScreen(
                onVerCatalogoClick = {
                    pantallaActual = LibroPantalla.Catalogo
                }
            )
        }
        LibroPantalla.Catalogo -> {
            LibroCatalogoScreen(
                libros = listaLibros,
                onItemClick = { libro ->
                    idLibroSeleccionado = libro.id
                    pantallaActual = LibroPantalla.Detalle
                },
                onBackClick = {
                    pantallaActual = LibroPantalla.Home
                }
            )
        }
        LibroPantalla.Detalle -> {
            LibroDetalleScreen(
                libro = libroActual,
                onBackClick = {
                    pantallaActual = LibroPantalla.Catalogo
                }
            )
        }
    }
}