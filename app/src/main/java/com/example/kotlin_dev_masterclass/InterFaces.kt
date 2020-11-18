package com.example.kotlin_dev_masterclass

interface DriveAble{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// Super class, Parent class, Base class of Vehicle
open class Cars(override val maxSpeed: Double, val name: String, val brand: String): DriveAble{  //* Extend the functionality of the DriveAble Interface*//

    open var range : Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0) {range += amount}
    }

    open fun drive(distance: Double){
        println("$brand $name drove for $distance Km.")
    }

    // From fun drive(): String in Interface
    override fun drive(): String {
        return "Driving the interface drive"
    }
}

// Subclass, Child Class or Derived class of car
// override can make method in Super class extends to any sub classes and they(sub classes) can edit on their own properties /* 1 method but shared each other */

class Electric_Car (maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Cars(maxSpeed, name, brand){

    var chargerType = "Type 1"
    override var range = batteryLife * 6 // make Car.range open first before override

    //Same fun name but different features
    override fun drive(distance: Double){
        println("$brand $name drove for $distance Km. on electricity")
    }

    override fun drive(): String {
        return "$brand $name drove for $range Km."
    }

    // Automatically Inherits
    override fun brake() {
        super.brake()     // ที่เป็น super เพราะใน super class ไม่ได้ implement เลยต้องเรียกจาก interface แทน
        println("Brake inside electric car. Bro")
    }
}

//Any class inherits from any class

fun main(){
    var myCar = Cars(300.0,"CLS", "Benz")
    var E_Car = Electric_Car(150.0,"S-Model", "E-Lar", 85.0 )


    E_Car.chargerType = "Type 2"
   // E_Car.extendRange(1500.0)

   // E_Car.drive()
    myCar.brake()
    println("----------------")
    E_Car.brake()
    println("----------------")
    // Polymorphism
   // myCar.drive(220.0)
   // E_Car.drive(200.0)

}