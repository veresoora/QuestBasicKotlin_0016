package com.nadia.project1

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

// named argument
// named argument adalah cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello $name, your $age years old")
}

//default parameter value
//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "nadia", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello $name, your $age years old")
}

fun withReturn(panjang : Int, lebar : Int) {
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("Haliza")
    withNamedArgument(name = "Haliza", age = 20)
    withDefaultParameter(age = 20)
}