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

    println()
    println("===== DATA KARYAWAN =====")

    val manager = Manager("Budi", 10000000.0, 5000000.0)
    manager.displayInfo()

    println()

    val developer = Developer("Andi", 8000000.0, 2000000.0)
    developer.displayInfo()
}

GameManager.startGame()
GameManager.startGame()