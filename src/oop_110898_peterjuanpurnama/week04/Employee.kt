package oop_110898_peterjuanpurnama.week04

import java.text.NumberFormat
import java.util.Locale

open class Employee(
    val name: String,
    val baseSalary: Double
) {

    open fun calculateSalary(): Double {
        return baseSalary
    }

    fun displayInfo() {
        val formatter = NumberFormat.getNumberInstance(Locale("in", "ID"))
        println("Nama: $name")
        println("Total Gaji: ${formatter.format(calculateSalary())}")
    }
}