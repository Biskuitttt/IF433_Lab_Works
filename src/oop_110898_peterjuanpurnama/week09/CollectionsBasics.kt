package oop_110898_peterjuanpurnama.week09

fun main() {
    val immutableList = listOf("A", "B", "C")
    println(immutableList)

    val mutableList = mutableListOf("A", "B", "C")
    mutableList.add("D")
    println(mutableList)
    val setData = setOf(1, 2, 2, 3, 3, 4)
    println(setData)

    val mapData = mapOf(
        "A" to 1,
        "B" to 2
    )
    println(mapData)
}