package com.nadia.project1

// List adalah kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listof
// List Mutable menggunakan mutableListof

fun ContohList()  {
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data dari list mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}