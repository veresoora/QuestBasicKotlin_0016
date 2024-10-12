package com.nadia.project1

// Data Class
// Data Class adalah class yang digunakan untuk menyimpan data.
// Data Class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(). dan toString().
// Data Class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)
