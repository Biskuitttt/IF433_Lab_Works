package oop_110898_peterjuanpurnama.week04

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }

}
