package oop_110898_peterjuanpurnama.week11

fun main() {
    val text = "Halo Dunia"

    println(text.addExclamation())
    println(text.reverseWords())

    val shortText: String? = "Hai"
    val nullText: String? = null

    println(shortText.isNullOrShort())
    println(nullText.isNullOrShort())
}
val lamp = SmartDevice("", "").apply {
    name = "Philips WiZ Living Room"
    category = "Lighting"
    isOnline = true
    powerLoad = 12
}.also {
    homeDevices.add(it)
}

SmartDevice("Ezviz Outdoor", "Camera").apply {
    isOnline = true
    powerLoad = 5
}.also {
    println("(LOG) Kamera terhubung")
    homeDevices.add(it)
}