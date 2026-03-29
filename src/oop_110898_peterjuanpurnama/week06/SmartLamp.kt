package oop_110898_peterjuanpurnama.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name lamp is ON")
    }

    override fun turnOff() {
        println("$name lamp is OFF")
    }

}