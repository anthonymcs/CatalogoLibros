package com.example.catalogolibros.data

import com.example.catalogolibros.model.Libro

class LibroDatasource {
    fun cargarLibros(): List<Libro> {
        return listOf(
            Libro(
                id = 1,
                titulo = "Harry Potter y la Piedra Filosofal",
                autor = "JK Rowling",
                anio = 1995,
                genero = "Magia / Aventura",
                calificacion = 6.0,
                resenas = 1234,
                precio = "Precio: $100 ~ $200",
                sinopsis = "Harry un niño que vive con sus tios abusadores, recibe una carta de aceptación para la escuela de magia Hogwarts, su vida cambia por completo al revelarse su profecia como el Elegido.",
                imagen = "https://images.cdn2.buscalibre.com/fit-in/360x360/e3/bc/e3bcd85377567759874a0664f894a67b.jpg"
            ),
            Libro(
                id = 2,
                titulo = "Cien años de soledad",
                autor = "Gabriel García Márquez",
                anio = 1967,
                genero = "Novela / Realismo mágico",
                calificacion = 4.8,
                resenas = 2150,
                precio = "Precio: $150",
                sinopsis = "La emblemática historia de la familia Buendía en el mítico pueblo de Macondo.",
                imagen = "https://www.rae.es/sites/default/files/portada_cien_anos_de_soledad_0.jpg"
            ),
            Libro(
                id = 3,
                titulo = "El Principito",
                autor = "Antoine de Saint-Exupéry",
                anio = 1943,
                genero = "Fábula / Literatura infantil",
                calificacion = 4.7,
                resenas = 1890,
                precio = "Precio: $80",
                sinopsis = "Un joven príncipe viaja por distintos planetas reflexionando sobre la soledad, la amistad y el amor.",
                imagen = "https://images.cdn3.buscalibre.com/fit-in/360x360/1b/be/1bbe4e73ab3b5da0c508f19c51472916.jpg"
            ),
            Libro(
                id = 4,
                titulo = "Clean Code",
                autor = "Robert C. Martin",
                anio = 2008,
                genero = "Tecnología / Software",
                calificacion = 4.6,
                resenas = 940,
                precio = "Precio: $250",
                sinopsis = "Guía esencial para aprender buenas prácticas de desarrollo y escribir código limpio y mantenible.",
                imagen = "https://images.cdn3.buscalibre.com/fit-in/660x660/10/fb/10fb170d7732b7dca25ebb81ded2572d.jpg"
            ),
            Libro(
                id = 5,
                titulo = "El Hobbit",
                autor = "J.R.R. Tolkien",
                anio = 1937,
                genero = "Fantasía épica",
                calificacion = 4.9,
                resenas = 3100,
                precio = "Precio: $120",
                sinopsis = "La aventura de Bilbo Bolsón en su viaje épico junto a un grupo de enanos y el mago Gandalf.",
                imagen = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1wupngCcRxBr9Pc3WShMGc9brbju7yWthy8F2w-G7oPYo3n2VXOnGQYM&s=10"
            ),
            Libro(
                id = 6,
                titulo = "Cosmos",
                autor = "Carl Sagan",
                anio = 1980,
                genero = "Divulgación científica",
                calificacion = 4.8,
                resenas = 1420,
                precio = "Precio: $190",
                sinopsis = "Un viaje fascinante a través del espacio y el tiempo para comprender nuestro lugar en el universo.",
                imagen = "https://images.cdn3.buscalibre.com/fit-in/360x360/de/9d/de9d8ad50cf6562964389504cb6a0e3e.jpg"
            )
        )
    }
}