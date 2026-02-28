package oop_110898_peterjuanpurnama.week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }

    override fun honk() {
        println("$brand membunyikan klakson mobil: Tiiin tiiin!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand mempercepat laju mobilnya!")
    }
}