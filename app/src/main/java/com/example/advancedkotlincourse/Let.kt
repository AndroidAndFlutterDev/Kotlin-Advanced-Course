package com.example.advancedkotlincourse

fun main() {
    letExample()
}

fun letExample() {

    var name: String? = null

    val lambda : (String?) -> Unit = {
        string -> println("The name is NOT null, it's $string")
    }

    name?.let(lambda)

    name = "Julian"
    name?.let(lambda)
}
