package oop_110898_peterjuanpurnama.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name speaker is ON")
    }

    override fun turnOff() {
        println("$name speaker is OFF")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }

}