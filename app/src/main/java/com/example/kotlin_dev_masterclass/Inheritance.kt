package com.example.kotlin_dev_masterclass




// Super class, Parent class, Base class of Vehicle
open class Car(val name: String, val brand: String){
    open var range : Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0) {range += amount}
    }

    open fun drive(distance: Double){
        println("$brand $name drove for $distance Km.")
    }
}

// Subclass, Child Class or Derived class of car
// override can make method in Super class extends to any sub classes and they(sub classes) can edit on their own properties /* 1 method but shared each other */

class ElectricCar (name: String, brand: String, batteryLife: Double) : Car(name, brand){

    var chargerType = "Type 1"
    override var range = batteryLife * 6 // make Car.range open first before override

    //Same fun name but different features
    override fun drive(distance: Double){
        println("$brand $name drove for $distance Km. on electricity")
    }

    fun drive(){
        println("$brand $name drove for $range Km.")
    }
}

//Any class inherits from any class

fun main(){
    var myCar = Car("CLS", "Benz")
    var E_Car = ElectricCar("S-Model", "E-Lar", 150.0)


    E_Car.chargerType = "Type 2"
    E_Car.extendRange(1500.0)

    E_Car.drive()

    println("----------------")
    // Polymorphism
    myCar.drive(220.0)
    E_Car.drive(200.0)

}