package oop_110898_peterjuanpurnama.week09

fun main() {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(2, 3))

    val multiply: (Int) -> Int = { it * 2 }
    println(multiply(5))
}