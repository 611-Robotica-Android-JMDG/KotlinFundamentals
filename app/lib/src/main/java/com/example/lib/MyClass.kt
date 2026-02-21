package com.example.lib

fun main(){

    //Para comentar: Ctrl k Ctrl C
    //Para descomentar: Ctrl k Ctrl U
//
//    //Variables inmutables
//    val name : String = "Juan"
//    //Variables mutables
//    var age : Int? = null
//    age = 29
//
//    //Tipos de Datos Int, String, Double, Float, Char, Array, Boolean
//    val isOld : Boolean = false
//    val height : Double = 1.65
//
//    println("El nombre es: $name, con edad $age y altura $height m")
//    //println(age)
//    //println(height)
//
//    //Estructuras de control
//    //1. if-Else
//    if(age > 18) {
//        println("Es mayor de edad")
//    }
//        else{
//            println("Es un morrito")
//        }
//
//    //Ciclo for
//
//    for(i in 0<..<10){
//        println(i)
//    }
//
//    for(i in 10> downTo >0){
//        println(i)
//    }
//
//
//    //switch - case
//

    /*
    * Escribir un programa que cacule el area de un rectangulo, que el ususario proporcione la base y la altura y se muestre en pantalla el resultado
     * */
//Kotlin es un lenguaje null safety (cada que haya un valor nulo, kotlin avisa)
    //Operadores logicos || &&
    //Operadores aritmeticos + = - * /
    //Operadores de estructura Elvis ?:
    var base : Double = 0.0
    var height : Double = 0.0
    println("Digita la base del rectangulo")
    val baseInput = readlnOrNull()
    base = baseInput?.toDoubleOrNull() ?: 0.0
    println("Digite la altura del rectangulo")
    val heightInput = readlnOrNull()
    height = heightInput?.toDoubleOrNull() ?: 0.0
    val area = base * height
    if(area == 0.0){
        println("Escribe cosas coherentes cat")
    }
    else{
        println("El area es: $area")
    }
    }