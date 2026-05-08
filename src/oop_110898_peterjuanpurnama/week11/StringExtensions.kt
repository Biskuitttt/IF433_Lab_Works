package oop_110898_peterjuanpurnama.week11

fun String.addExclamation(): String {
    return "$this!"
}

fun String.reverseWords(): String {
    return this.split(" ").reversed().joinToString(" ")
}