package oop_110898_peterjuanpurnama.week10

class NumericalStorage<T : Number>(
    private val number: T
) {

    fun square(): Double {
        return number.toDouble() * number.toDouble()
    }
}