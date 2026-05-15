package oop_110898_peterjuanpurnama.week12

fun main() {

    val result = runCatching {

        val number = "100".toInt()
        number / 2
    }

    println(result)
}