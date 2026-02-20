package oop_110898_peterjuanpurnama.week03

class Employee(
    val name: String,
    salary: Int
) {

    var salary: Int = salary
        set(value) {
            if (value < 0) {
                println("Salary tidak boleh negatif!")
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 0

    fun updateRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
        }
    }

    val bonus: Int
        get() = salary * performanceRating * 100

}
