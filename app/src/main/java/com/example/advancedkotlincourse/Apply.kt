package com.example.advancedkotlincourse

import com.example.advancedkotlincourse.MotherObject.nullColorsList
import com.example.advancedkotlincourse.MotherObject.smartPhones

fun main(){

    /**
     * Apply:
     * This Scope Function allows us to change the properties of an object, and,
     * at the end, you receive the same object, but changed
     * The main difference between the Run and Apply, is that, with Run, you want to
     * perform some activities or operations in the context of an object. With Apply,
     * you will change it's properties, returning the same object,
     * but with the features modified. They also provide null-safety
     */

    val smartPhones = smartPhones. apply {
        removeIf { smartPhone -> smartPhone.contains("Google") }
    }

    println(smartPhones)

   nullColorsList
    nullColorsList?. apply {
        println("Our colors are $this")
        println("Our colorsList is $size")
    }
}