package oop_110898_peterjuanpurnama.week04

open class Vehicle(
    val brand: String
) {

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }

    open fun honk() {
        println("$brand membunyikan klakson: Beep beep!")
    }

}
