package com.nadia.project1

import org.jetbrains.annotations.NotNull

fun nullSafety() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    //Throws a compiler error
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    // This is Ok
    nullable = null


    // Check for null in conditions
    if (neverNull == null) {
        println("inferreNonNull is null")
    } else {
        println("inferreNonNull is not null")
    }

    // safe call operator
    println(neverNull.length) //18
    println(nullable?.length) //null

    //notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) //18
}

fun main() {
    nullSafety()
}