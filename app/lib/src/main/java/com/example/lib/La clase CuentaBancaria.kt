package com.example.lib

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0

    fun depositar(cantidad: Double) {
        // TODO
        saldo += cantidad
        println("Deposito realizado. Nuevo saldo: $saldo")
    }

    fun retirar(cantidad: Double) {
        // TODO: Verifica que haya saldo suficiente
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Retiro realizado. Nuevo saldo: $saldo")
        } else {
            println("Error: Saldo insuficiente para retirar $cantidad")
        }
    }

    fun mostrarSaldo() {
        // TODO
        println("Titular: $titular")
        println("Saldo actual: $saldo")
    }
}

fun main() {

    val cuenta = CuentaBancaria("Jose Donato")

    cuenta.depositar(3000.0)
    cuenta.retirar(900.0)
    cuenta.retirar(700.0)  // No debe permitirlo
    cuenta.mostrarSaldo()
}