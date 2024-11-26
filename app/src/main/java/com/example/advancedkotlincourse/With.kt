package com.example.advancedkotlincourse

import com.example.advancedkotlincourse.MotherObject.colorsList

fun main(){

    /**
     * With:
     * The With function allows us to simplify the properties of a class, or a list, or whatever
     * We use "this" so we get all the required properties of something, like the size of a list, or the colors of a list
     * Example:
     * with Person {
     *   println(size)
     *   println("His name is $name")
     *   etc
     * }
     */

    colorsList
    with(colorsList) {
        println("Our colors are $this")
        println("This list is $size big")
    }
}