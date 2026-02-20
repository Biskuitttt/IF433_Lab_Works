package oop_110898_peterjuanpurnama.week03

class Employee(
    val name: String,
    salary: Int
) {

    var salary: Int = salary
        set(value) {
            println("Mengubah salary ke $value")
            this.salary = value
        }

}
