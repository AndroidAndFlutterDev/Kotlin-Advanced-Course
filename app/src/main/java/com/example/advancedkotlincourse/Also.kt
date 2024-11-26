package com.example.advancedkotlincourse

import com.example.advancedkotlincourse.MotherObject.smartPhones

fun main(){

    /**
     * Also:
     * This Scope Function allows us to perform additional actions to our object:
     * We are NOT modifying it, and we DON'T return the last value in the context of our object
     * That's the difference with Run and Also: With Run, you need to return something, all the changes you did at the end
     * But with Also, the only thing that matters here is the main object. We never modified it
     */

    val smartPhones = smartPhones.also {
        list -> println("The original value of the list is $list")
    }.asReversed()

    println(smartPhones)
}