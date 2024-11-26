package com.example.advancedkotlincourse

fun main() {

    // Exercise 1

    /**
     * Question 1: Scope Functions
     * Scenario: You have a Person class with name and age properties.
     * You want to initialize a Person object and print a greeting message using a scope function.
     *
     * Task:
     *
     * Create a Person class with name and age properties.
     * Initialize a Person object named person
     * Set the name to "Alice" and age to 30.
     * Print a greeting message using a with scope function.
     */

    class Person(val name: String, val age: Int)

    val person = Person(name = "Alice", age = 25)
    with(person) {
        println("Hi $name, I am glad to see that you are $age years old")
    }

    // Exercise 2

    /**
     * Question 2: Lambdas
     * Scenario: You want to filter a list of numbers and find the sum of the even numbers.
     *
     * Task:
     *
     * Create a list of numbers from 1 to 10.
     * Filter the list to keep only even numbers using a lambda expression.
     * Calculate the sum of the filtered numbers using a lambda expression.
     * Print the sum.
     */

    val numberList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numberList.filter {number -> number % 2 == 0}.sum()
    println(evenNumbers)

    // Exercise 3

    /**
     * Question 3: Classes and Inheritance
     * Scenario: You have a Vehicle class with properties brand and model.
     * You want to create a Car class that inherits from Vehicle and adds a color property.
     *
     * Task:
     *
     * Create a Vehicle class with brand and model properties.
     * Create a Car class that inherits from Vehicle and adds a color property.
     * Create a Car object, set its properties, and print its details.
     */

    open class Vehicle(val brand: String, val model: String)

    class Car(brand: String, model: String, val color: String) : Vehicle(brand, model) {
        fun printDetails(){
            println("My car is a $color $brand $model")
        }
    }

    val myCar = Car(brand = "Mercedes Benz", model = "Sport", color = "Black")
    myCar.printDetails()


}