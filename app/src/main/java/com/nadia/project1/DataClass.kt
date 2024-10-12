package com.nadia.project1

// Data Class
// Data Class adalah class yang digunakan untuk menyimpan data.
// Data Class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(). dan toString().
// Data Class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "nadia@gmail.com")
    println(data)

    // Fungsi Equals
    val data2 = DataClass(1, "muna@gmail.com")
    println(data == data2) //false

    // Fungsi Copy
    val data3 = data.copy()
    println(data3)

    //Fungsi Copy dengan perubahan
    val data4 = data.copy(email = "haliza@gmail.com")
    println(data4)
}

