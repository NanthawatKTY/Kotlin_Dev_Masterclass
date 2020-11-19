package com.example.kotlin_dev_masterclass


fun main(args:Array<String>){
   // emptyArrayList()
   // arrayListCollection()
   // arrayListGet()
    exArrayList()
}

// Empty ArrayList //
fun emptyArrayList(){
    val arrayList = ArrayList<String>()   //Creating an empty array list
    
    // Adding an obj. into arraylist
    arrayList.add("1")
    arrayList.add("2")
    println(".....Print ArrayList.....")
    for (i in arrayList){
        println(i)
    }
}

// ArrayList using collections
fun arrayListCollection(){
    val arrayListCol: ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()

    list.add("Onee")
    list.add("Twoee")

    arrayListCol.addAll(list)

    println("...Print ArrayList Collection...")
    val itr = arrayListCol.iterator()

    while (itr.hasNext()){
        println(itr.next())
    }
    println("Size of arrayList Collection = " + arrayListCol.size)
}

//ArrayList - get()
fun arrayListGet(){
    val arrayListGet: ArrayList<String> = ArrayList<String>()
    arrayListGet.add("One")
    arrayListGet.add("Two")
    for (i in arrayListGet){
        println(i)
    }
    println("....arrayList.get(1)")
    println(arrayListGet[0])    //arrayListGet.get(1)
}

// Exercise ArrayList   : Average ค่าเฉลี่ย
fun exArrayList(){
    val arrayListAvg = ArrayList<Double>()
    arrayListAvg.add(1.0)
    arrayListAvg.add(2.0)
    arrayListAvg.add(3.0)
    arrayListAvg.add(4.0)
    arrayListAvg.add(5.0)
    var totalValues = 0.0
    for (members in arrayListAvg){
        totalValues += members
    }
    val average = totalValues/arrayListAvg.size
    println("Total is $totalValues, Average is $average")
}