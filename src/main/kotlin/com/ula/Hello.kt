package com.ula

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    var age : Int = 19
    age = 11
    var weight = 88.2
    var name : String
    name = "Ula"
    print(name)
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}