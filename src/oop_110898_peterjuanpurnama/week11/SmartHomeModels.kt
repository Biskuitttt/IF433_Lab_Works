package oop_110898_peterjuanpurnama.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)