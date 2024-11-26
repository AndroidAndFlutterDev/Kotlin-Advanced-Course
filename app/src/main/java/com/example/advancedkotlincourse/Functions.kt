package com.example.advancedkotlincourse

fun main() {
    val randomSentence = "Flutter is WAY BETTER than Android Native".randomCase()
    paintPhrase(randomSentence)
}

// Translation Kotlin to Dart:
// Unit = Void

fun paintPhrase(sentence: String): Unit {
    println("Your sentence is: $sentence")
}

fun String.randomCase(): String {
    val range = 0..99
    val randomNumber = range.random()

    return if (randomNumber % 2 == 0) this.uppercase() else this.lowercase()
}