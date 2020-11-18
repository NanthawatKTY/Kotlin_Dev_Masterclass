package com.example.kotlin_dev_masterclass

import kotlin.math.floor

fun main(){
    val stringList = listOf("Anne", "Karen", "Peter") // List<String>
    val mixedTypeList: List<Any> = listOf("Denis", "Tae-Koo", 15, 30.153232)

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)  // Map<String, Int>
    val set = setOf("a", "b", "c")                 // Set<String>

    //Alternatively
    for (value in mixedTypeList){
        when(value){
            is Int -> println("Intger: $value")
            is Double -> println("Double: $value with floor value ${floor(value)}") //floor(value) ปัดเศษ
            is String -> println("String: $value")
        }
    }

    //SMART Casting
    val obj1: Any = "I'm your father 2"
    if(obj1 !is String) {
        println("It's not String")
    } else {
        // obj is automatically cast to a String in this scope
        println("Found a String of length ${obj1.length}")
    }

    // Explicit (unsafe) Casting using the "as" keyword - can go wrong
//    val str1: String = obj1 as String
//    println(str1.length)
//
//    val obj2: Any = 1669
//    val str2: String = obj2 as String
//    println(str2) // Exception Error

    // Explicit (Safe) Casting using the "as?" keyword - Work!
    val obj3: Any = 1669
    val str3: String? = obj3 as? String
    println(str3) // Prints null
}