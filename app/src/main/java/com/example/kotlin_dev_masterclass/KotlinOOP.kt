package com.example.kotlin_dev_masterclass

//var b = 3
//fun main(){
//    /* person Class */
//    var papa = person("Papa", "Papi", 50)
//    papa.hobby = "Sleep"
//    //papa.age = 40
//    papa.stateHobby()
//   // println("${papa.age}")
//
//    var johnDoe = person("Roberto", "Carlos", 44)
//    johnDoe.hobby = "Play a guitar"
//    johnDoe.stateHobby()
//
//    //var robertPaddington = person(lastname = "Pddington")
//

//
//    /* Shadow and Scope */
////    myScope(60)
////    b = 5
//}


//
//class person(firstname: String = "John", lastname: String = "Cena"){   //Primary Constructor
//
//    var firstname : String? = null
//    var lastname : String? = null
//    var age : Int? = null
//    var hobby : String = "Watch porn"
//
//    //Initializer Block
//    init {
//        this.firstname = firstname  //Stored firstname from Primary Constructor into this.firstname
//        this.lastname = lastname    //Stored lastname from Primary Constructor into this.lastname
//      //  println("Initialized a person created with Firstname: $firstname Lastname: $lastname")
//    }
//
//    // Member second constructor
//    constructor(firstname: String, lastname: String, age: Int)
//                : this(firstname, lastname){
//        this.age = age
//        println("Initialized a person created with Firstname: $firstname Lastname $lastname and Age: $age")
//    }
//    //Member Function - Methods
//    fun stateHobby(){
//        println("Firstname: $firstname Lastname: $lastname Hobby: $hobby")
//    }
//
//
//}
//

fun main(){
     /* MobilePhone Class*/
    var iPhone = MobilePhone("iOS", "Apple", "iPhone XS", 50)
    var OnePlus = MobilePhone("Android", "1+", "8 Pro", 45)
    var Huawei = MobilePhone("Android", "Huawei", "P20", 10)

    iPhone.chargeBattery()
    OnePlus.chargeBattery()
    Huawei.chargeBattery()
}


class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 30
    private var batLevel = 0
    val sOS = osName
    val sBrand = brand
    val sModel = model

    init {
        println("OS-Name: $osName, Brand: $brand Model: $model and Battery Level: $battery")
    }

    constructor(osName: String, brand: String, model: String, batteryLevel: Int):this(osName, brand, model){
        this.batLevel = batteryLevel
    }
    fun chargeBattery(){
        println("Charged by $battery ")
        battery += batLevel
        if(battery > 100){
            battery = 100
        }
        println("$sBrand $sModel has been charged to $battery% from $batLevel%").toString()
    }
}
//
//fun myScope(a: Int){
////    b = a
////    println("b is $b")
//}



// Having multiple overloads:

//class Person(var firstName: String, var lastName: String) {
//    var age: Int? = null
//    var eyeColor: String? = null
//
//    // Secondary Constructor
//    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
//        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
//    }
//
//    // Secondary Constructor
//    constructor(firstName: String, lastName: String, age: Int, eyeColor: String):
//            this(firstName, lastName, age)  {
//        this.eyeColor = eyeColor
//    }
//}


// SETTERS AND GETTERS

// User class with a Primary constructor that accepts
// three parameters
//class Car(_brand: String, _model: String, _maxSpeed: Int) {
//    // Properties of User class
//    val brand: String = _brand         // Immutable (Read only)
//    var model: String = _model  // Mutable
//    var maxSpeed: Int = _maxSpeed       // Mutable
//}

// Kotlin internally generates a default getter and setter for mutable properties, and a getter (only) for read-only properties.

//It calls these getters and setters internally whenever
// you access or modify a property using the dot(.) notation.
//This is how it would look like internally
//class Car(_brand: String, _model: String, _maxSpeed: Int) {
//    val brand: String = _brand
//        get() = field
//
//    var model: String = _model
//        get() = field
//        set(value) {
//            field = value
//        }
//
//    var maxSpeed: Int = _maxSpeed
//        get() = field
//        set(value) {
//            field = value
//        }
//}

// value
// We use value as the name of the setter parameter. This is the default convention in Kotlin but you’re free to use any other name if you want.
// The value parameter contains the value that a property is assigned to. For example, when you write user.name = "Elon Musk",
// the value parameter contains the assigned value "Elon Musk".

// 2. Backing Field (field)
// Backing field helps you refer to the property
// inside the getter and setter methods.
// This is required because if you use the property
// directly inside the getter or setter then you’ll
// run into a recursive call which will generate
// a StackOverflowError.


//fun main(){
//
//    var myCar = Car()
//    myCar.myMaxSpeed = 250
//    println("Brand is ${myCar.myBrand}")
//}
//
//class Car() {
//
//    lateinit var owner : String
//
//    val myBrand: String = "BMw"
//        // Custom getter
//        get() {
//            return field.toUpperCase()
//        }
//
//
//    // default setter and getter
//    var myModel: String = "M5"
//        private set
//
//    var myMaxSpeed: Int = 250
//        get() = field
//        // Custom Setter
//        set(value) {
//            field = if(value > 0) value else throw IllegalArgumentException("_maxSpeed must be greater than zero")
//        }
//
//    init{
//        this.myModel = "M3"
//        this.owner = "Frank"
//    }
//}