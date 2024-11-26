package com.example.advancedkotlincourse

import com.example.advancedkotlincourse.MotherObject.smartPhones

fun main() {

    /**
     * Run:
     * This function gets the context of something and allows us to change its properties
     * In this example, we just remove all Google smartphones in the list, and return the list
     * But we can do much more than that, like adding a new value, or printing each element, etc
     */

    val smartphones =
        smartPhones.run {
            removeIf { smartPhone -> smartPhone.contains("Google") }
            this
        }
    println(smartphones)
}