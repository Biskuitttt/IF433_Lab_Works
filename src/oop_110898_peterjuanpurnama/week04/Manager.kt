package oop_110898_peterjuanpurnama.week04

class Manager(
    name: String,
    baseSalary: Double,
    val bonus: Double
) : Employee(name, baseSalary) {

    override fun calculateSalary(): Double {
        return baseSalary + bonus
    }
}