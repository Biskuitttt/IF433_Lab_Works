package oop_110898_peterjuanpurnama.week03

fun main() {

    val e = Employee("Peter", 3000)

    e.salary = -200
    e.salary = 4000

    e.updateRating(4)

    println("Salary: ${e.salary}")
    println("Bonus: ${e.bonus}")

}
