package com.example.advancedkotlincourse

fun main(){

    /**
     * Sets:
     * Unlike the Lists, or the Maps, you CAN NOT HAVE DUPLICATES
     */

    // Immutable Set
    val duplicatedVocals = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")

    println(duplicatedVocals) // Output: [a, e, i, o, u]

    // Mutable Set
    val lovedNumbers = mutableSetOf(1,2,3,4)

    println(lovedNumbers)

    lovedNumbers.add(5)

    lovedNumbers.add(5)

    println(lovedNumbers)

    lovedNumbers.remove(5)

    println(lovedNumbers)

    // This will return the first value AFTER the 4
    val setValue = lovedNumbers.firstOrNull { num -> num > 4 } ?: "No values"
    println(setValue)
}