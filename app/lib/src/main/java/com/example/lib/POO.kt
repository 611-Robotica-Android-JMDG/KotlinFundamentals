package com.example.lib

// POO busca representar objetos de la vida real con codigo
// 4 pilares fundamentales
/* A pie
* Abstraccion
* Polimorfismo
* Herencia
* Encapsulamiento
* Padre e hijo
* Vehiculo------->Coche-----Motocicleta
* */

class Person(var name : String, val age:Int){
//    public String name;
//
//    //Constructor ---> Metodo inicial, cuando se distancia una clase
//    public Person(String name){
//        this.name = name;
//    }
fun sayHello(){
    println("Hola soy $name y tengo $age años")
     }
}


// Clases Abstractas
// Una CLASE es una clase que NO se puede instanciar
abstract class Shape{
    abstract fun calculateArea() : Double
}

class Circle(val radius : Double) : Shape(){
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

}

class Square(val side : Double) : Shape(){
    override fun calculateArea(): Double {
        return side * side
    }

}

// clases open si se pueden heredar
open class Animal{
    open fun makeSound(){
        println("Haciendo un sonido generico")

    }
}

class Eagle : Animal(){
    override fun makeSound(){
        println("Tricampeon")
    }
}

class Bear : Animal(){

}

fun main() {
    //Person person = new Person("Juan",28)

    val person = Person("Juan", 28)
    val person2 = Person(age = 28, name = "Juan")
    person.sayHello()
    println(person2.name)
    println(person2.age)
    //person2.name = "Juan" //Esto falla porque en la clase esta el name como "val"
    //person2 = Person("Daniel",30) //Esto falla porque person2 ES VAL
    val circle = Circle(radius = 10.0)
    val square = Square(side = 10.0)

    val shapes = listOf(circle, square)
    val shape1 = shapes[0]
    shape1.calculateArea()

}