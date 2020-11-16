package com.example.kotlin_dev_masterclass

fun main(){

    // TODO: Add new function

    val name = "Tae Young"

    // type inference finds out the type from context
    var myAge = 22

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    var myFloat: Float = 13.37F
    val myPi: Double = 3.14159265358979
    //var age: Byte = 25
    var year: Short = 2020
    var myLong: Long = 18881234567

    // Floating point number types: Float(32 bit), Double (64 bit)
    // val myFloat: Float = 22.11F
    // val myDouble: Double = 3.142323523523

    // Boolean
    var isRain: Boolean = true
//    var isRain: Boolean = true;
//    isRain = false

    // Characters
    val letterChar: Char = 'a'
    val digitChar = '$'

    //String
    var firstCharInStr = name[0]
    var lastCharInStr = name[name.length - 1] // Count in Array Style
    var countCharInStr = name.length

    //println("1st Character " + firstCharInStr + ' ' + lastCharInStr)
    //println("Character Length: " + countCharInStr)

/* ---------------------------------------------------------------------- */
    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    val a = 5.0
    val b = 3.0
    var resultTwo : Double
    resultTwo = a / b
    result /= 2
    result *= 3
    result += 10
    result -= 5
    result %= 2  //Modulo (Mod)
 //   println(resultTwo)

/* ------------------------------- Comparision Operators (==, >=, <=, !=, >, <) --------------------------------------- */
    //Comparision Operators (==, >=, <=, !=, >, <)
    //Inter Polation
   // val isEqual = 5==3
   // println("isEqual is $isEqual")

   // val isNotEqual = 5!=5
   // println("isNotEqual: $isNotEqual $isEqual")
   // println("is5lessthan3? ${5<3}")
   // println("is 10 Greater Equal 11 ?: ${11 <= 11}")

/* ------------------------------- //Assignment operators (+=, -=, /=, %=) --------------------------------------- */
    //Assignment operators (+=, -=, /=, %=)
    var number = 80
    number += 3
   // number *= 5
   // println("Result of mynum: $number")

    //Increment & Decrement operators (++, --)
    number--
//    println("Result of inc and dec: $number")
//    println("Result of inc and dec: ${number--}")
//    println("Result of inc and dec: ${--number}")
//
//    println("Result of inc and dec: ${++number}")
//    println("Result of inc and dec: ${number + 5}")

/* ------------------------------- //If Statement --------------------------------------- */
//    var isRainy = true
//    if (isRainy == true){
//        println("Rain is falling")
//    }else{
//        println("Rain isn't fall")
//    }

/* ------------------------------- //When Expressions --------------------------------------- */
//    var season = 3
//    when(season){
//        1 -> println("Spring")
//        2 -> println("Summer")
//        3 -> println("Fall or Autumn")
//        4 -> println("Winter")
//        else -> println("invalid season")
//    }

//    var  months = 1
//    when(months){
//        in 3..5 -> println("Spring") // 3 to 5
//        in 6..8 -> println("Summer") // 6 to 8
//        in 9..11 -> println("Fall or Autumn") // 9 to 11
//        12, 1, 2 -> println("Winter") // 12 to 2
//        else -> println("Invalid Season")
//    }

//    var ages = 12
//    when(ages){
//        !in 0..20 -> println("You're adult")  // IF age is not in between 0 - 20 = You're adult
//        in 18..20 -> println("Vote for election") // 18 - 20 = can do election
//        15 -> println("You can make driving license") // 15 can make driving license
//        else -> println("You're too young")
//    }

    // Check data type
//    var x : Any = 5000.00F
//    when(x){
//        is Int -> println("$x is an int")
//        !is Double -> println("$x isn't an Double")
//        is String -> println("$x is an String")
//        is Short -> println("$x is an Short")
//        is Float -> println("$x is an Float")
//        else -> println("None from above")
//    }

    /* ------------------------------- //While Loop --------------------------------------- */
    var numCount = 100
    while (numCount >= 0){
       // println("$numCount")
        numCount -= 1
    }
//    println("While loop is done")

    numCount = 11
    do{
        println("$numCount")
        numCount++
    }while (numCount <= 10)   // IF numCount <= 10 go to do{}
    println("Do While loop is done")


    //Temp Degree
    var temperFelt = "Hot"
    var roomTemp = 30
    while (temperFelt == "Hot"){
        roomTemp++
        if (roomTemp in 20..25){
            temperFelt = "Comfy !"
            println("Weather is comfy now! $roomTemp")
        }else if (roomTemp < 20){
            temperFelt = "Cold !"
            println("Weather is Cold $roomTemp")
        }else if (roomTemp >= 25){
            temperFelt = "Hot!!!"
            println("Weather is HOT $roomTemp")
        }
    }

    /* ------------------------------- //For Loop --------------------------------------- */
    for (num in 1..10){
    //    println("$num")
    }

    for (number in 1 until 11){
   //     println("$number")
    }

    for (nums in 10 downTo 1 step 3){
        println("$nums")
    }
}
