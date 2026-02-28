package oop_110898_peterjuanpurnama.week04

class Developer(
    name: String,
    baseSalary: Double,
    val overtimePay: Double
) : Employee(name, baseSalary) {

    override fun calculateSalary(): Double {
        return baseSalary + overtimePay
    }
}