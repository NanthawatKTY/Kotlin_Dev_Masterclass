package com.example.kotlin_dev_masterclass

fun main(){
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println(sum(5, 10))

    //Even shorter
    TODO()
    val sumShorter = {a:Int, b:Int -> println(a + b)}
    sumShorter(50, 50)
}

