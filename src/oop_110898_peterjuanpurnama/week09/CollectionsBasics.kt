package oop_110898_peterjuanpurnama.week09

fun main() {
    val immutableList = listOf("A", "B", "C")
    println(immutableList)

    val mutableList = mutableListOf("A", "B", "C")
    mutableList.add("D")
    println(mutableList)
}