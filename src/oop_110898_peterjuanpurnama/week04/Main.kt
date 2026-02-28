package oop_110898_peterjuanpurnama.week04

fun main() {

    val vehicle = Vehicle("Generic")
    vehicle.accelerate()
    vehicle.honk()

    println()

    val car = Car("Toyota", 4)
    car.accelerate()
    car.honk()
    car.openTrunk()

    println()

    val tesla = ElectricCar("Tesla", 4, 85)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()
}