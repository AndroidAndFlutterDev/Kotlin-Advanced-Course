package com.example.advancedkotlincourse

fun main(){

    /**
     * Lambdas:
     * A lambda is a function that can be passed as a parameter to another functions
     * They are small, allowing us to perform small tasks, like listeners, or callbacks
     * They reduce the code, also allowing us to do High Order Functions, etc
     */

    val myLambda: (String) -> Int = {  // it = the String passed as a parameter (value)
        value -> value.length          // example -> example... = it... (It's just another name for the value passed as a parameter)
    }
    println(myLambda("5"))

    val greetingList = listOf("Hello", "Hola", "Bonjour", "你 好，您 好")

    val greetingLength = greetingList.map(myLambda) // = greetingList.map { value -> value.length }
    println(greetingLength)
}