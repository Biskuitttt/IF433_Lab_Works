package oop_110898_peterjuanpurnama.week10

fun main() {

    val intBox = Box(100)
    val stringBox = Box("Hello Kotlin")

    println(intBox.getItem())
    println(stringBox.getItem())

    val pair = PairBox("ID001", "Laptop")
    pair.printPair()

    printData(10.5)
    printData("Generic Function")

    val result = returnData("Returned String")
    println(result)
}