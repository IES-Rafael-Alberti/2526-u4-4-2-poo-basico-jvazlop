package org.iesra

class Vehiculo(
    private val marca: String,
    private val modelo: String
) {

    private var kilometraje: Double = 0.0

    fun registrarViaje(kilometros: Double) {
        if (kilometros <= 0) {
            throw IllegalArgumentException("Los kilómetros deben ser mayores que 0")
        }
        kilometraje += kilometros
    }

    fun detalles(): String {
        return "Marca: $marca, Modelo: $modelo, Kilometraje: $kilometraje km"
    }
}

fun main() {

    val vehiculo = Vehiculo("Toyota", "Corolla")

    try {
        vehiculo.registrarViaje(100.0)
        println(vehiculo.detalles())
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}