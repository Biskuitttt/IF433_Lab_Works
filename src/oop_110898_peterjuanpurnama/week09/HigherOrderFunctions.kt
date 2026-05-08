package oop_110898_peterjuanpurnama.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val filtered = numbers.filter { it > 2 }
    println(filtered)

    val mapped = numbers.map { it * 2 }
    println(mapped)

    val sorted = numbers.sortedByDescending { it }
    sorted.forEach { println(it) }
}