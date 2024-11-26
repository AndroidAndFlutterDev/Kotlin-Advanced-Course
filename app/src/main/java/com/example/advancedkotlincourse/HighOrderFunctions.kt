package com.example.advancedkotlincourse

fun main(){

    /**
     * High Order Functions:
     * These functions are functions that can accept other functions as parameters and/or return functions
     * For example, we first have a simple lambda that returns the length of the message (the String)
     * And the second one is a function that takes a String and returns a Lambda that takes the name and return a text with it
     */

    val length = superFunction("Example", block = {
        it.length
    })

    println(length)
    
    val lambda: () -> String = functionInception("Julian")
    val value: String = lambda()
    println(value)
}

fun superFunction(message: String, block: (String) -> Int) : Int{
    return block(message)
}

// This function will return a Lambda that will return a String
fun functionInception(name: String) : () -> String = { "Hello from the Lambda, $name" }