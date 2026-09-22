package com.example.catalogolibros.model

data class Libro(
    val id: Int,
    val titulo: String,
    val autor: String,
    val anio: Int,
    val genero: String,
    val calificacion: Double,
    val resenas: Int,
    val precio: String,
    val sinopsis: String,
    val imagen: String
)