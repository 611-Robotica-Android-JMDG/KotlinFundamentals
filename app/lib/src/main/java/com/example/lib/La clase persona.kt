package com.example.lib

class Persona(val nombre: String, val edad: Int, val ciudad: String) {

    fun saludar() {
        // TODO: Imprime el saludo
        println("Hola, me llamo $nombre y tengo $edad anios.")
    }

    fun esMayorDeEdad(): Boolean {
        // TODO: Regresa true si edad >= 18
        return edad >= 18
    }
}

fun main() {

    val persona1 = Persona("Jose", 25, "Guadalajara")
    val persona2 = Persona("Aldo", 17, "León")
    // TODO: Llama los métodos de cada persona

    persona1.saludar()
    println("Jose es mayor de edad: ${persona1.esMayorDeEdad()}")

    println()

    persona2.saludar()
    println("Aldo es mayor de edad: ${persona2.esMayorDeEdad()}")
}