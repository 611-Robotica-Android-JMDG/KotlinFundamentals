package com.example.lib

open class Animales(val nombre: String, val edad: Int) {

    open fun hacerSonido() {
        println("Sonido genérico.")
    }

    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}

class Perro(nombre: String, edad: Int) : Animales(nombre, edad) {

    override fun hacerSonido() {
        // TODO: imprime ¡Guau!
        println("¡Guau!")
    }
}

// TODO: Crea Gato y Vaca de forma similar

class Gato(nombre: String, edad: Int) : Animales(nombre, edad) {

    override fun hacerSonido() {
        println("¡Miau!")
    }
}

class Vaca(nombre: String, edad: Int) : Animales(nombre, edad) {

    override fun hacerSonido() {
        println("¡Muu!")
    }
}

fun main() {

    val perro = Perro("Rex", 3)
    perro.describirse()
    perro.hacerSonido()

    // TODO: Crea y usa Gato y Vaca

    val gato = Gato("Max", 2)
    gato.describirse()
    gato.hacerSonido()

    val vaca = Vaca("Lola", 5)
    vaca.describirse()
    vaca.hacerSonido()
}