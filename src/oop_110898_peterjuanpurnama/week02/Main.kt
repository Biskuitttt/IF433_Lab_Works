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
        scanner.nextLine()

        student = Student(nim, name, major, gpa)
    } else {
        student = Student(nim, name)
    }

    println()
    student.displayInfo()

    println("\n=== SISTEM PERPUSTAKAAN ===")

    println("Masukkan Judul Buku:")
    val bookTitle = scanner.nextLine()

    println("Masukkan Nama Peminjam:")
    val borrower = scanner.nextLine()

    println("Lama Peminjaman (hari):")
    var duration: Int

    while (true) {
        try {
            duration = scanner.nextLine().toInt()
            break
        } catch (e: Exception) {
            println("Masukkan angka yang benar!")
        }
    }


    if (duration < 1) {
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)

    println("\n===== DATA PEMINJAMAN =====")
    println("Judul Buku : ${loan.bookTitle}")
    println("Peminjam   : ${loan.borrower}")
    println("Durasi     : ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")

    println("\n=== MINI RPG BATTLE ===")

    scanner.nextLine()
    println("Masukkan nama Hero:")
    val heroName = scanner.nextLine()

    println("Masukkan Base Damage:")
    var baseDamage: Int

    while (true) {
        try {
            baseDamage = scanner.nextLine().toInt()
            break
        } catch (e: Exception) {
            println("Masukkan angka damage yang benar!")
        }
    }

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val action = scanner.nextLine()

        if (action == "1") {

            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik! Damage: $enemyDamage")
                hero.takeDamage(enemyDamage)
                hero.showStatus()
            }

        } else if (action == "2") {
            println("Kamu berhasil kabur!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    if (hero.isAlive() && enemyHp == 0) {
        println("\n🎉 Kamu menang!")
    } else if (!hero.isAlive()) {
        println("\n💀 Kamu kalah...")
    }

}
