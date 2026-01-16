package org.iesra

class Estudiante(nombre: String) {

    private val nombre: String = nombre

    private var nota: Double = 0.0

    fun setNota(nota: Double) {
        this.nota = when {
            nota < 0 -> 0.0
            nota > 10 -> 10.0
            else -> nota
        }
    }

    override fun toString(): String {
        return "Estudiante: $nombre, Nota: $nota"
    }
}

fun main() {

    val e1 = Estudiante("Ana")
    val e2 = Estudiante("Luis")
    val e3 = Estudiante("Marta")

    e1.setNota(8.5)
    e2.setNota(12.0)
    e3.setNota(-3.0)

    println(e1)
    println(e2)
    println(e3)
}
