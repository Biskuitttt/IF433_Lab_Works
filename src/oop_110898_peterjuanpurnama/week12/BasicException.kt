package oop_110898_peterjuanpurnama.week12

fun basicDivision(a: Int, b: Int) {
    try {
        val result = a / b
        println("Hasil: $result")
    } catch (e: ArithmeticException) {
        println("Error: Tidak bisa dibagi dengan nol")
    } finally {
        println("Program selesai dijalankan")
    }
}