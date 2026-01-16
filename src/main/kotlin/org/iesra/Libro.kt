package org.iesra

class Libro(
    private val titulo: String,
    private val autor: String,
    private val numPaginas: Int = 100,
    private var leido: Boolean = false
) {

    init {
        if (titulo.isBlank()) {
            throw IllegalArgumentException("El título no puede estar vacío")
        }
        if (autor.isBlank()) {
            throw IllegalArgumentException("El autor no puede estar vacío")
        }
        if (numPaginas <= 0 || numPaginas > 5000) {
            throw IllegalArgumentException("El número de páginas debe estar entre 1 y 5000")
        }
    }

    override fun toString(): String {
        val estadoLeido = if (leido) "Sí" else "No"
        return "Libro: $titulo por $autor, Páginas: $numPaginas, Leído: $estadoLeido"
    }

    fun marcarComoLeido() {
        leido = true
    }
}

fun main() {

    try {
        val libro1 = Libro("1984", "George Orwell", 328)
        val libro2 = Libro("El Principito", "Antoine")

        libro1.marcarComoLeido()

        println(libro1)
        println(libro2)

        //(debe lanzar excepción)
        val libroError = Libro("", "Autor desconocido")

    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
