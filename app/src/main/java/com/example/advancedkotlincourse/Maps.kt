package com.example.advancedkotlincourse

fun main(){

    /**
     * A map is a key-value system that allows you to lock a specific value to a specific key
     * It's very similar to a variable, because we access the value by using the key
     * But the key, here, as to be a String
     */

    // Immutable Map
    val superHeroAge = mapOf(
        "Batman" to 25,
        "Spider-man" to 17,
        "Nightwing" to 18
    )

    println(superHeroAge)

    // Mutable Map
    val MutableSuperHeroAge = mutableMapOf(
        "Batman" to 25,
        "Robin" to 13,
        "Nightwing" to 18,
        "Jason Todd" to 12
    )

    MutableSuperHeroAge["Batgirl"] = 25 // = MutableSuperHeroAge.put("Batgirl", 25)

    println(MutableSuperHeroAge)

    val batmanAge = MutableSuperHeroAge["Batman"]

    println(batmanAge)

    MutableSuperHeroAge.remove("Jason Todd")

    println(MutableSuperHeroAge)

    println(MutableSuperHeroAge.keys)
    println(MutableSuperHeroAge.values)
}