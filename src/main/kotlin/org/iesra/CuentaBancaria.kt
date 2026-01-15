class CuentaBancaria(private val titular: String) {

    private var saldo: Double = 0.0

    fun ingresar(cantidad: Double) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("No se puede ingresar una cantidad igual o menor que 0")
        }
        saldo += cantidad
        println("Ingreso realizado. Saldo actual: $saldo €")
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= 0) {
            throw IllegalArgumentException("No se puede retirar una cantidad igual o menor que 0")
        }
        if (cantidad > saldo) {
            throw IllegalStateException("No hay saldo suficiente para retirar $cantidad €")
        }
        saldo -= cantidad
        println("Retiro realizado. Saldo actual: $saldo €")
    }
}

fun main() {

    val cuenta = CuentaBancaria("Jordi")

    try {
        cuenta.ingresar(100.0)
        cuenta.retirar(50.0)

        // Intento de retiro que supera el saldo
        cuenta.retirar(100.0)

    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
