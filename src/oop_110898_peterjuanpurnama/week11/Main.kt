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