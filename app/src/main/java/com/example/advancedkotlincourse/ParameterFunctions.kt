package com.example.advancedkotlincourse

fun main(){
    paintName(name = "Julian", secondName = "Ismael" ,lastName = "Principe")  // paintName("Julian", "Principe")
}

fun paintName(name: String, secondName: String, lastName: String){
    println("Mi full name is $name $secondName $lastName")
}