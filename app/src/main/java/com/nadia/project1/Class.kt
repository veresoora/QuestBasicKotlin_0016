package com.nadia.project1

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "nadiamuna@gmail.com")

    // Mencetak nilai properti: email
    println(contact.email)

    // Memperbarui nilai properti: email
    contact.email = "haliza@gmail.com"

    // Mencetak nilai baru dari properti: email
    println(contact.email)

}