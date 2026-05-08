package oop_110898_peterjuanpurnama.week11

fun main() {
    val username: String? = "Peter"

    username?.let {
        println("Username length: ${it.length}")
    }
}