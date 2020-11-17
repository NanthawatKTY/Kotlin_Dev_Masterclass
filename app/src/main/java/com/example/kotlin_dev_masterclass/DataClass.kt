package com.example.kotlin_dev_masterclass

data class User(val id: Long, var name: String)
fun main(){
    val user1 = User(1, "Tae")

    user1.name = "Rooney"
    val user2 = User(2, "Loomer")

    println(user1 == user2)

    println("User Details: $user1")

    val updateUser = user1.copy(name = "Namo3T")
    println(updateUser)

    println(updateUser.component1()) // Prints id
    println(updateUser.component2()) // Prints name

    val (id, name) = updateUser
    println("ID = $id, Name: $name")
}