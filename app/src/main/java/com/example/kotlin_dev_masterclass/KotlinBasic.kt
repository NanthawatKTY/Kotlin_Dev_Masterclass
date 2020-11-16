package com.example.kotlin_dev_masterclass

fun main(){

    // TODO: Add new function

    val name = "Tae Young"

    // type inference finds out the type from context
    var myAge = 22

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    var myFloat: Float = 13.37F
    val myPi: Double = 3.14159265358979
    var age: Byte = 25
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
    println("Result of mynum: $number")

    //Increment & Decrement operators (++, --)
    number--
    println("Result of inc and dec: $number")
    println("Result of inc and dec: ${number--}")
    println("Result of inc and dec: ${--number}")

    println("Result of inc and dec: ${++number}")
    println("Result of inc and dec: ${number + 5}")
}
