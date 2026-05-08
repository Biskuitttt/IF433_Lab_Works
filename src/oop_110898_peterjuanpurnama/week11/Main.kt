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

val ac = run {
    SmartDevice(
        "Daikin Inverter (Kabel 3x2.5)",
        "HVAC",
        false,
        800
    )
}

homeDevices.add(ac)

homeDevices.add(
SmartDevice(
"Picolo's Auto Feeder",
"Pet Care",
true,
10
)
)
val searchResult = homeDevices.find {
    it.category == "Camera"
}

searchResult?.let {
    println(it.diagnose())
}