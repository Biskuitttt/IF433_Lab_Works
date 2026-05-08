package oop_110898_peterjuanpurnama.week10

class PairBox<K, V>(
    private val key: K,
    private val value: V
) {

    fun printPair() {
        println("Key: $key")
        println("Value: $value")
    }
}