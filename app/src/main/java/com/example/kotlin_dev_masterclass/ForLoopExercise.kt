package com.example.kotlin_dev_masterclass

fun main(){
    for (number in 0..10000){
        if (number == 9001){
            println("IT'S OVER 9000!!!")
        }
    }

    /* While Loop */
    var humidityLevel = 80
    var humidity = "humid"

 while (humidity == "humid"){
        humidityLevel -= 5
        println("humidity decreased $humidityLevel")
        if (humidityLevel < 60){
            println("It's comfy now")
            humidity = "comfy"
        }
    }
}