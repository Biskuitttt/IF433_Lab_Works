package oop_110898_peterjuanpurnama.week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("Masukkan NIM:")
    val nim = scanner.nextLine()

    println("Masukkan Nama:")
    val name = scanner.nextLine()

    println("Masukkan Jurusan:")
    val major = scanner.nextLine()

    val student = Student(nim, name, major)

    println()
    student.displayInfo()

}
