package com.example.kotlin_dev_masterclass

fun main(){
    myFunc()
    var total = addUp(10, 50)
    println(total)

    //Fun avg
    var resultAVG = avg(5.5,5.0)
    println(resultAVG)
}

fun addUp(a: Int, b: Int): Int{
    //Output
    return a+b
}

fun avg(a: Double, b: Double) : Double{
    return (a+2)/(b*5)
}
fun myFunc(){
    println("Hey hey")
}