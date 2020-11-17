package com.example.kotlin_dev_masterclass

var b = 3
fun main(){
    /* person Class */
    var papa = person("Papa", "Papi", 50)
    papa.hobby = "Sleep"
    //papa.age = 40
    papa.stateHobby()
   // println("${papa.age}")

    var johnDoe = person("Roberto", "Carlos", 44)
    johnDoe.hobby = "Play a guitar"
    johnDoe.stateHobby()

    //var robertPaddington = person(lastname = "Pddington")

    /* MobilePhone Class*/
//    var iPhone = MobilePhone("iOS", "Apple", "iPhone XS")
//    var OnePlus = MobilePhone("Android", "1+", "8 Pro")
//    var Huawei = MobilePhone("Android", "Huawei", "P20")

    /* Shadow and Scope */
//    myScope(60)
//    b = 5
}

class person(firstname: String = "John", lastname: String = "Cena"){   //Primary Constructor

    var firstname : String? = null
    var lastname : String? = null
    var age : Int? = null
    var hobby : String = "Watch porn"

    //Initializer Block
    init {
        this.firstname = firstname  //Stored firstname from Primary Constructor into this.firstname
        this.lastname = lastname    //Stored lastname from Primary Constructor into this.lastname
      //  println("Initialized a person created with Firstname: $firstname Lastname: $lastname")
    }

    // Member second constructor
    constructor(firstname: String, lastname: String, age: Int)
                : this(firstname, lastname){
        this.age = age
        println("Initialized a person created with Firstname: $firstname Lastname $lastname and Age: $age")
    }
    //Member Function - Methods
    fun stateHobby(){
        println("Firstname: $firstname Lastname: $lastname Hobby: $hobby")
    }


}

class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("OS-Name: $osName, Brand: $brand and Model: $model")
    }
}

fun myScope(a: Int){
//    b = a
//    println("b is $b")
}