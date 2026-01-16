package org.iesra

class Producto(nombre: String, precio: Double, stock: Int) {

    private val nombre: String = nombre
    private var precio: Double
    private var stock: Int

    init {
        this.precio = if (precio > 0) precio else 0.0
        this.stock = if (stock >= 0) stock else 0
    }

    fun vender(cantidad: Int) {
        if (cantidad <= 0) {
            return
        }

        if (cantidad > stock) {
        } else {
            stock -= cantidad
        }
    }

    fun reabastecer(cantidad: Int) {
        if (cantidad <= 0) {
            return
        }

        stock += cantidad
    }

    override fun toString(): String {
        return "Producto: $nombre, Precio: $precio€, Stock: $stock"
    }
}

fun main() {
    val p1 = Producto("Manzanas", 1.5, 20)
    val p2 = Producto("Leche", -2.0, 10)
    val p3 = Producto("Pan", 0.8, -5)

    println("\n--- Antes ---")
    println(p1)
    println(p2)
    println(p3)

    p1.vender(5)
    p1.vender(20)  // Intento de vender más que stock
    p2.reabastecer(15)
    p3.reabastecer(-3) // Intento inválido

    println("\n--- Despues ---")
    println(p1)
    println(p2)
    println(p3)
}
