package oop_110898_peterjuanpurnama.week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("Masukkan NIM:")
    val nim = scanner.nextLine()

    println("Masukkan Nama:")
    val name = scanner.nextLine()

    println("\nPilih Jalur Pendaftaran:")
    println("1. Sudah memilih jurusan")
    println("2. Belum memilih jurusan")
    print("Pilihan: ")
    val choice = scanner.nextInt()
    scanner.nextLine()

    val student: Student

    if (choice == 1) {
        println("Masukkan Jurusan:")
        val major = scanner.nextLine()

        println("Masukkan IPK:")
        val gpa = scanner.nextDouble()

        student = Student(nim, name, major, gpa)
    } else {
        student = Student(nim, name)
    }

    println()
    student.displayInfo()

}
