package oop_110898_peterjuanpurnama.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name CCTV is ON")
        startRecord()
    }

    override fun turnOff() {
        println("$name CCTV is OFF")
    }

    override fun startRecord() {
        println("$name mulai merekam...")
    }

}